package hust.soict.dsai.aims.store;
import java.util.ArrayList;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

// Hoàng Tố An - 20214980
public class Store {
	public static final int MAX = 100;
	public DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX];
	int i = 0;
	int size = 0;
	private ArrayList<Media> itemsinstore = new ArrayList<Media>();
	public void setArrayList(ArrayList<Media>m)
	{
		itemsinstore = m;
		itemsinstore.add(new Media(1234, "nhu", "horror", 45f));
		itemsinstore.add(new Media(1234, "ngu", "funny", 45f));
	}
	public ArrayList<Media> getItemsinstore() {
		return itemsinstore;
	}

	public void addMedia(Media t) {
		int count = 0;
		for(Media m : itemsinstore)
		{
			if(m.getTitle().equalsIgnoreCase(t.getTitle())) {
				count++;
			}
		}
		if(count == 0) {
			itemsinstore.add(t);
		}
	}
	public void removeMedia(Media m) {
		String title = m.getTitle();
		for(int i = 0; i < itemsinstore.size(); i++) {
			if(itemsinstore.get(i).getTitle().equals(title)) {
				itemsinstore.remove(itemsinstore.get(i));
			}
		}
		for(Media m2 : itemsinstore)
		{
			System.out.print(m2.getId() + " " + m2.getTitle() + " " +  m2.getCost() + "\n");
		}
	}
	public void FindMediabyTitle(String title)
	{
		for(Media m2 : itemsinstore)
		 {
			 if(m2.getTitle().equalsIgnoreCase(title)) {
				 System.out.print(m2.getId() + " " + m2.getTitle() + " " +  m2.getCost() + "\n");
			 }
		 }
	}
	public void print() {
		System.out.println("***********************IN STORE***********************");
    	for(int i = 0; i < size; i++) {
	    	System.out.print(itemsInStore[i].getTitle() + "\t  " + itemsInStore[i].getCategory()+ "\t " 
	    			+ itemsInStore[i].getDirector() + "\t " + itemsInStore[i].getLength() + "\t " 
	    			+ itemsInStore[i].getCost() + " \n"); 
	    }
	}
}
