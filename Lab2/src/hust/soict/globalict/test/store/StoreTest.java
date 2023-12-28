package hust.soict.globalict.test.store;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.store.Store;

// Hoàng Tố An - 20214980
public class StoreTest {

	public static void main(String[] args) {
		Store s = new Store();
		DigitalVideoDisc disc1 = new DigitalVideoDisc("Cinderella","Toan",19.95f,1234);
		DigitalVideoDisc disc2 = new DigitalVideoDisc("Jungle","An",19.5f,3456);
		DigitalVideoDisc[] di = new DigitalVideoDisc[3];
	    di[0] = new DigitalVideoDisc("Thang");
	    di[1] = new DigitalVideoDisc("Viet");
	    di[2] = new DigitalVideoDisc("Pokemon");
	    
	    s.addMedia(disc1, disc2, di[0], di[1], di[2]);
	    s.print();
	    s.removeMedia(disc1);
	    s.print();
	}

}
