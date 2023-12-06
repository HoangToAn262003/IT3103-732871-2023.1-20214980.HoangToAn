package hust.soict.dsai.aims.cart;
import java.util.ArrayList;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.store.Store;

// Hoàng Tố An - 20214980
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	//private DigitalVideoDisc itemsOrdered1[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	int i = 0;
	int size = 0;
	private ArrayList<Media>itemsOrdered = new ArrayList<Media>();
	private ArrayList<DigitalVideoDisc>itemsOrdered1 = new ArrayList<DigitalVideoDisc>();
	Store s = new Store();
	
	public void addMedia(String title) {
		itemsOrdered1.add(new DigitalVideoDisc(title));
		System.out.print(itemsOrdered1.size());
	}
		  
	public void playDvd(String title)
	{
		for(DigitalVideoDisc dvd : itemsOrdered1) {
			if(dvd.getTitle().equalsIgnoreCase(title)) {
				dvd.play();
			}
		}
	}
	public void showInfo()
	{
		s.setArrayList(itemsOrdered);
		for(Media m2 : s.getItemsinstore()) {
			 System.out.print(m2.getId() + " " + m2.getTitle() + " " +  m2.getCost() + "\n");
		}
	}
	public ArrayList<Media> getItemsordered() {
		return itemsOrdered;
	}
	public ArrayList<DigitalVideoDisc> getItemsordered1() {
		return itemsOrdered1;
	}
	void RemoveMedia(Media m) {
		for(Media i: itemsOrdered) {
			if(i.getTitle() == m.getTitle()) {
				itemsOrdered.remove(m);
			}
		}
	}
	public float totalCost()
	{
		float sum = 0f;
		for(Media m :itemsOrdered) {
			sum += m.getCost();
		}
		return sum;
	}
    public void print()
    {
    	System.out.println("***********************CART***********************");
    	System.out.println("Ordered Items:");
    	for(Media m : itemsOrdered) {
			 System.out.print(m.getId() + " " + m.getTitle() + " " +  m.getCost() + "\n");
		}
    }
    public void findbyID(int id)
    {
    	for(int i = 0; i < qtyOrdered(); i++) {
    		if(itemsOrdered[i].isMatch(id)) {
    			System.out.print("Found matching ID of " + id + ": " + itemsOrdered[i].getTitle() + "\t  " 
    					+ itemsOrdered[i].getCategory()+ "\t " + itemsOrdered[i].getCost()+" \n");
    		}
    		else {
    			itemsOrdered1[i] = itemsOrdered[i];
    		}
    	}
    	if(itemsOrdered1.length == qtyOrdered()) {
    		System.out.print("No information");
    	}
    }
    public void findbyTitle(String title)
    {
    	for(int i = 0; i < qtyOrdered(); i++) {
    		if(itemsOrdered[i].isMatch(title)) {
    			System.out.print(itemsOrdered[i].getTitle() + "  " + itemsOrdered[i].getCategory()+ " " + itemsOrdered[i].getCost()+" \n");
    		}
    		else {
    			itemsOrdered1[i] = itemsOrdered[i];
    		}
    	}
    	if(itemsOrdered1.length == qtyOrdered()) {
    		System.out.print("No information");
    	}
    }
}
