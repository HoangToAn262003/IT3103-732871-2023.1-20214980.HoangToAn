package hust.soict.dsai.test.disc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

// Hoàng Tố An - 20214980
public class TestPassingParameter {

	public static void main(String[] args) {
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		
		swap(jungleDVD, cinderellaDVD);
		System.out.println("Jungle DVD title: "+ jungleDVD.getTitle());
		System.out.println("Cinderella DVD title: "+ cinderellaDVD.getTitle());
		
		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("\nJungle DVD title: "+ jungleDVD.getTitle());
	}
	
	// old
	public static void swap(Object o1, Object o2) {
		Object tmp = o1;
		o1 = o2;
		o2 = tmp;
	}
	
	// new
	public static void swap(DigitalVideoDisc o1, DigitalVideoDisc o2) {
		String tmp = o1.getTitle();
		o1.setTitle(o2.getTitle());
		o2.setTitle(tmp);
	}
	
	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}
}
