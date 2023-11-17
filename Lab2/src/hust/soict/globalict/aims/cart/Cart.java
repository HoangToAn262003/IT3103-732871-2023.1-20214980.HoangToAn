package hust.soict.globalict.aims.cart;
import hust.soict.globalict.aims.disc.DigitalVideoDisc;

// Hoàng Tố An - 20214980
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private DigitalVideoDisc itemsOrdered1[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	int i = 0;
	int size = 0;
	int qtyOrdered() {
		return size;
	}
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		itemsOrdered[i] = disc;
		i++;
		size++;
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc []dvdList) {
		for(int i = 0; i < dvdList.length; i++) {
			itemsOrdered[size] = dvdList[i];
			size++;
		}
	}     
	
//	void addDigitalVideoDisc(DigitalVideoDisc ...dvdList) {
//	for(int i = 0; i < dvdList.length; i++) {
//			itemsOrdered[size] = dvdList[i];
//			size++;
//		}
//	}     
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2)
	{
		itemsOrdered[size] = dvd1;
		itemsOrdered[size + 1] = dvd2;
		size += 2;
	}
   
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		String found = disc.getTitle();
		int b = 0;
		for(int i = 0; i < qtyOrdered(); i++) {
			if(itemsOrdered[i].getTitle() != found) {
				itemsOrdered[b] = itemsOrdered[i];
				b++;
			}
		}
		size = b;
		}
	public float totalCost()
	{
		float sum = 0f;
		for(int i = 0; i < qtyOrdered(); i++) {
			sum += itemsOrdered[i].getCost();
		}
		return sum;
	}
    public void print()
    {
    	System.out.println("***********************CART***********************");
    	System.out.println("Ordered Items:");
    	for(int i = 0; i < qtyOrdered(); i++) {
	    	System.out.print(itemsOrdered[i].getTitle() + "\t  " + itemsOrdered[i].getCategory()+ "\t " 
	    			+ itemsOrdered[i].getDirector() + "\t " + itemsOrdered[i].getLength() + "\t " 
	    			+ itemsOrdered[i].getCost() + " \n"); 
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
	public static void main(String[] args) {
		Cart c = new Cart();
		DigitalVideoDisc disc1 = new DigitalVideoDisc("Cinderella","Toan",19.95f,1234);
		DigitalVideoDisc disc2 = new DigitalVideoDisc("Jungle","An",19.5f,3456);
		DigitalVideoDisc[] di = new DigitalVideoDisc[3];
	    di[0] = new DigitalVideoDisc("Thang");
	    di[1] = new DigitalVideoDisc("Viet");
	    di[2] = new DigitalVideoDisc("Pokemon");
	    
	    
	    c.addDigitalVideoDisc(disc1);	    
	    c.addDigitalVideoDisc(disc2);
//	    c.addDigitalVideoDisc(di);
	    c.addDigitalVideoDisc(disc1, disc2);
//	    c.addDigitalVideoDisc(disc2, di[0], di[1]);
	    
//	    System.out.println("Quantity ordered: "+ c.qtyOrdered());
//	    for(int i = 0; i < c.qtyOrdered(); i++) {
//	    	System.out.print(c.itemsOrdered[i].getTitle() + " \n"); 
//	    }
//	    
//		c.removeDigitalVideoDisc(disc2);
//		for(int i = 0; i < c.qtyOrdered(); i++) {
//			System.out.print(c.itemsOrdered[i].getTitle() + " ");
//		}
	    c.print();
	    System.out.print("Total cost: " + " ");   
	    System.out.print(c.totalCost() + "\n");
	    c.findbyID(1234);
	}
}
