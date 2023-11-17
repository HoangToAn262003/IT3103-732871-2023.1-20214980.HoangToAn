package hust.soict.globalict.aims.store;
import hust.soict.globalict.aims.disc.DigitalVideoDisc;

// Hoàng Tố An - 20214980
public class Store {
	public static final int MAX = 100;
	public DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX];
	int i = 0;
	int size = 0;
	
	public void addDVD(DigitalVideoDisc ...dvdList) {
	for(int i = 0; i < dvdList.length; i++) {
			itemsInStore[size] = dvdList[i];
			size++;
		}
	}
	public void removeDVD(DigitalVideoDisc disc) {
		String found = disc.getTitle();
		int b = 0;
		for(int i = 0; i < size; i++) {
			if(itemsInStore[i].getTitle() != found) {
				itemsInStore[b] = itemsInStore[i];
				b++;
			}
		}
		size = b;
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
