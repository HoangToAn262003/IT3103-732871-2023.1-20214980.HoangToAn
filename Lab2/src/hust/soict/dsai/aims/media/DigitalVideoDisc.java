package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{
	   private static int nbDigitalVideoDiscs = 0;
	   
	   public DigitalVideoDisc(String title) {
		   super();
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
	   
	   public boolean isMatch(int id)
	   {
		   if(this.getId() == id) {
			   return true;
		   }
		   return false;
	   }
	   public boolean isMatch(String title)
	   {
		   if(this.getTitle() == title) {
			   return true;
		   }
		   return false;
	   }
	   public void play()
	   {
		   System.out.println("Playing DVD: " + this.getTitle());
		   System.out.println("DVD length: " + this.getLength());

	   }
}
