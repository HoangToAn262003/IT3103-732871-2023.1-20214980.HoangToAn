package hust.soict.globalict.test.screen;

import java.util.ArrayList;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.screen.StoreScreen;
import hust.soict.globalict.aims.store.Store;

public class ScreenTest {


	public static void main(String[] args) {
		Store s = new Store();
		Cart c = new Cart();
		s.setArrayList(new ArrayList<Media>());
		new StoreScreen(s, c);


	}

}
