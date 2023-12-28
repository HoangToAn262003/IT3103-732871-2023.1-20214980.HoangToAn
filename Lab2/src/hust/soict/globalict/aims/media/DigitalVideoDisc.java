package hust.soict.globalict.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{
	   private static int nbDigitalVideoDiscs = 0;

	   public DigitalVideoDisc(String title) {
		   super();
	   }
	   public DigitalVideoDisc()
	   {
		   
	   }
	   public DigitalVideoDisc(String title, float cost)
	   {
		   super(title, cost);
	   }
	   public DigitalVideoDisc(String title, String category, float cost, int id) {
		   super();
		   nbDigitalVideoDiscs++;
	   }
	   
	   public DigitalVideoDisc(String title, String category, float cost, String director, int id) {
		   super();
		   nbDigitalVideoDiscs++;
	   }
	   
	   public DigitalVideoDisc(String title, String category, float cost, String director, int length, int id) {
		   super();
		   nbDigitalVideoDiscs++;
	   }

	   public void play()
	   {
		   System.out.println("Playing DVD: " + this.getTitle());
		   System.out.println("DVD length: " + this.getLength());

	   }
}
