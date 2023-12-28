package hust.soict.globalict.aims.store;
import java.util.ArrayList;

import hust.soict.globalict.aims.media.Book;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Media;

// Hoàng Tố An - 20214980
public class Store {
	public static final int MAX = 100;
	int i = 0;
	int size = 0;
	private ArrayList<Media> itemsInStore = new ArrayList<Media>();
	public void setArrayList(ArrayList<Media> m)
	{
		itemsInStore = m;
		itemsInStore.add(new DigitalVideoDisc("Detective Pikachu", 45f));
		itemsInStore.add(new Media(1234, "Exorcist", "horror", 45f));
		itemsInStore.add(new Media(1234, "Pokemon", "funny", 45f));
		itemsInStore.add(new Media(1234, "Mario", "funny", 45f));
		itemsInStore.add(new Media(1234, "Kirby", "funny", 45f));
		itemsInStore.add(new Media(1234, "Sonic", "funny", 45f));
		itemsInStore.add(new Book("Ghost Stories", 45f));
		itemsInStore.add(new Media(1234, "Donkey Kong", "funny", 45f));
		itemsInStore.add(new DigitalVideoDisc("Godzilla", 45f));
	}
	public ArrayList<Media> getItemsInStore() {
		return itemsInStore;
	}

	public void addMedia(Media t) {
		int count = 0;
		for(Media m : itemsInStore)
		{
			if(m.getTitle().equalsIgnoreCase(t.getTitle())) {
				count++;
			}
		}
		if(count == 0) {
			itemsInStore.add(t);
		}
	}
	public void removeMedia(Media m) {
		String title = m.getTitle();
		for(int i = 0; i < itemsInStore.size(); i++) {
			if(itemsInStore.get(i).getTitle().equals(title)) {
				itemsInStore.remove(itemsInStore.get(i));
			}
		}
		for(Media m2 : itemsInStore)
		{
			System.out.print(m2.getId() + " " + m2.getTitle() + " " +  m2.getCost() + "\n");
		}
	}
	public void FindMediabyTitle(String title)
	{
		for(Media m2 : itemsInStore)
		 {
			 if(m2.getTitle().equalsIgnoreCase(title)) {
				 System.out.print(m2.getId() + " " + m2.getTitle() + " " +  m2.getCost() + "\n");
			 }
		 }
	}
	public void print() {
		System.out.println("***********************IN STORE***********************");
    	for(Media m : itemsInStore) {
	    	System.out.print(m.getTitle() + "\t  " + m.getCategory()+ "\t " + m.getCost() + " \n"); 
	    }
	}
}
