package hust.soict.globalict.aims.cart;
import java.util.ArrayList;

import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.store.Store;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

// Hoàng Tố An - 20214980
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	int size = 0;
	Media m = new Media();
	Store s = new Store();
	//public ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	public ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();
	
	public void addMedia(Media m) {
		itemsOrdered.add(m);
		for(int i = 0; i < itemsOrdered.size(); i++)
		{
			m.setTitle(itemsOrdered.get(i).getTitle());
			//System.out.print(itemsOrdered.get(i).getTitle());
		}
		//System.out.print(itemsOrdered.size());
	}
		  
//	public void setItemsOrdered(ArrayList<Media> itemsOrdered) {
	public void setItemsOrdered(ObservableList<Media> itemsOrdered) {
		this.itemsOrdered = itemsOrdered;
	}
    
	//public ArrayList<Media> getItemsOrdered() {
	public ObservableList<Media> getItemsOrdered() {
		return itemsOrdered;
	}

	public void showInfo()
	{
		s.setArrayList(itemsOrdered);
		for(Media m2 : s.getItemsInStore()) {
			 System.out.print(m2.getId() + " " + m2.getTitle() + " " +  m2.getCost() + "\n");
		}
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
//    public void findbyID(int id)
//    {
//    	for(Media m : itemsOrdered) {
//    		if(m.isMatch(id)) {
//    			System.out.print("Found matching ID of " + id + ": " + m.getTitle() + "\t  " 
//    					+ m.getCategory()+ "\t " + m.getCost()+" \n");
//    		}
//    		else {
//    			itemsOrdered1[i] = itemsOrdered[i];
//    		}
//    	}
//    	if(itemsOrdered1.length == qtyOrdered()) {
//    		System.out.print("No information");
//    	}
//    }
//    public void findbyTitle(String title)
//    {
//    	for(Media m : itemsOrdered) {
//    		if(m.isMatch(title)) {
//    			System.out.print(m.getTitle() + "  " + m.getCategory()+ " " + m.getCost()+" \n");
//    		}
//    		else {
//    			itemsOrdered1[i] = itemsOrdered[i];
//    		}
//    	}
//    	if(itemsOrdered1.length == qtyOrdered()) {
//    		System.out.print("No information");
//    	}
//    }
}
