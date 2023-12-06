package hust.soict.dsai.aims.media;

// Hoàng Tố An - 20214980
public class Disc extends Media {
	public Disc(int length, String director) {
		super();
		this.length = length;
		this.director = director;
	}
	public Disc() {
		// TODO Auto-generated constructor stub
	}
	private int length;
	private String director;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
}
