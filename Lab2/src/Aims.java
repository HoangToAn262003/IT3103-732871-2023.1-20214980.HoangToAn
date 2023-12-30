import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.store.Store;

import java.util.ArrayList;
import java.util.Scanner;
public class Aims {
	public static void showMenu() {
		System.out.println("AIMS: ");
		System.out.println("--------------------------------");
		System.out.println("1. View store");
        System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
}
	public static void storeMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. See a media’s details");
		System.out.println("2. Add a media to cart");
		System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}
	public static void mediaDetailsMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add to cart");
		System.out.println("2. Play");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
		}
	public static void handlestoreMenu()
	{
		String title;
		Scanner sc = new Scanner(System.in);
		Store s = new Store();
		Cart c = new Cart();
	while(true) {
		int choice = sc.nextInt();
		ArrayList<Media>med = new ArrayList<Media>();
		s.setArrayList(med);
		switch(choice)
		{
			case 1:
				title = sc.next();
				s.FindMediabyTitle(title);
				//mediaDetailsMenu();
				break;
			case 2:
				System.out.print("please enter the title to add");
				title = sc.next();
				for(Media media : s.getItemsInStore()) {
					if(media.getTitle().equalsIgnoreCase(title)) {
						c.addMedia(media);
					}
				}
				c.showInfo();
				break;
			case 3:
				title = sc.next();
				c.playDvd(title);
				break;
		}		 
	 }   
	}
	public static void main(String[] args) {
		String optionc2;
		Store s = new Store();
		ArrayList<Media>med = new ArrayList<Media>();
		s.setArrayList(med);
		showMenu();
		int choice;
		Scanner sc = new Scanner(System.in);	
		while(true) {
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				storeMenu();
				handlestoreMenu();
				break;
			case 2:
				optionc2 = sc.next();
				if(optionc2.equals("add")){
					Media m = new Media(1234, "Sherlock holmes", "horror", 34f);
					Media m1= new Media(2345, "Snake", "horror", 34f);
					s.addMedia(m);	
					s.addMedia(m1);
					for(Media m2 : s.getItemsInStore()) {
						 System.out.print(m2.getId() + " " + m2.getTitle() + " " +  m2.getCost()+ "\n");
					}
				}
				else if(optionc2.equals("remove")) {
					Media m1= new Media(2345, "Snake", "horror", 34f);
					s.removeMedia(m1);
				}
				break;
				default:
					break;
			}
		}

	}
}
