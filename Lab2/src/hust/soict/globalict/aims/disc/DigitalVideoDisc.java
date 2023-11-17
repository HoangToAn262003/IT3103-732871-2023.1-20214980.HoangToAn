package hust.soict.globalict.aims.disc;
// Hoàng Tố An - 20214980
public class DigitalVideoDisc {
   private String category;
   private String title;
   private String director;
   private int length;
   private float cost;
   private static int nbDigitalVideoDiscs = 0;
   private int id;
   public DigitalVideoDisc(String title) {
		this.title = title;
	}
   public DigitalVideoDisc(String title, String category, float cost, int id) {
		this.title = title;
		this.category = category;
		this.cost = cost;
		nbDigitalVideoDiscs++;
		this.id = id;
	}
   public DigitalVideoDisc(String title, String category, float cost, String director, int id) {
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.director = director;
		nbDigitalVideoDiscs++;
		this.id = id;
	}
   public DigitalVideoDisc(String title, String category, float cost, String director, int length, int id) {
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.director = director;
		this.length = length;
		nbDigitalVideoDiscs++;
		this.id = id;
	}
   public String getCategory() {
	   return category;
   }
   public void setCategory(String category) {
	   this.category = category;
   }
   public String getTitle() {
	   return title;
   }
   public void setTitle(String title) {
	   this.title = title;
   }
   public String getDirector() {
	   return director;
   }
   public void setDirector(String director) {
	   this.director = director;
   }
   public int getLength() {
	   return length;
   }
   public void setLength(int length) {
	   this.length = length;
   }
   public float getCost() {
	   return cost;
   }
   public void setCost(float cost) {
	   this.cost = cost;
   }
   public int getID()
   {
	   return id;
   }
   public boolean isMatch(int id)
   {
	   if(this.id == id) {
		   return true;
	   }
	   return false;
   }
   public boolean isMatch(String title)
   {
	   if(this.title == title) {
		   return true;
	   }
	   return false;
   }
}
