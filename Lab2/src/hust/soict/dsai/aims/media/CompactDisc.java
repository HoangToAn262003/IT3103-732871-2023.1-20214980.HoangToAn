package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();
    
	public String getArtist() {
    	return artist;
	}
    
	public CompactDisc() {
	}

	public void setTracks(ArrayList<Track> tracks) {
		this.tracks = tracks;
	}

	public CompactDisc(int length, String director, String artist, ArrayList<Track> tracks) {
		super(length, director);
		this.artist = artist;
		this.tracks = tracks;
	}
    void addTrack(Track t)
    {
    	int count = 0;
    	for(int i = 0; i < tracks.size(); i++) {
    		if(tracks.get(i).getTitle() == t.getTitle()) {
    			count++;
    		}
    	}
    	if(count == 0) {
    		tracks.add(t);
    	}
    }
    void removeTrack(Track t)
    {

    	int count = 0;
    	for(int i = 0; i < tracks.size(); i++) {
    		if(tracks.get(i).getTitle() == t.getTitle()) {
    			count++;
    		}
    	}
    	if(count == 0) {
    		System.out.println("Existed");
    	}
    	else {
    		tracks.remove(t);
    	}
    }
    int getlength()
    {
    	int length = 0;
    	for(int i = 0; i < tracks.size(); i++) {
    		length += tracks.get(i).getLength();
    	}
    	return length;
    }
    public void play()
    {
    	for(Track t: tracks) {
    		t.play();
    	}
    }
    public static void main(String[] args) {
    	Track t1 = new Track("Piupiu", 3);
    	Track t2 = new Track("Piupiu", 4);
    	CompactDisc c = new CompactDisc();
    	c.addTrack(t1);
    	for(Track t: c.tracks) {
    		System.out.println(t.getTitle());
    	}
    	c.addTrack(t2);
    	for(Track t: c.tracks) {
    		System.out.print(t.getTitle());
    	}
    }
}
