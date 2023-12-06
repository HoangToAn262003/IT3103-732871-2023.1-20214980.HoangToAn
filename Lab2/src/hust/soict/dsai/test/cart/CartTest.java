package hust.soict.dsai.test.cart;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

// Hoàng Tố An - 20214980
public class CartTest {
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
