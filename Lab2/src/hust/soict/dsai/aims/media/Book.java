package hust.soict.dsai.aims.media;

import java.util.ArrayList;
// Hoàng Tố An - 20214980
import java.util.List;
public class Book extends Media{
	
	private ArrayList<String> authors = new ArrayList<String>();

	void addAuthor(String authorName){
		for (int i = 0; i < authors.size(); i++) {
			if (authorName == authors.get(i))
				return;
		}
		authors.add(authorName);
	}
	
	void removeAuthor(String authorName) {
		for (int i = 0; i < authors.size(); i++) {
			if (authorName == authors.get(i)) {
				authors.remove(i);
			}
		}
		return;
	}
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<String> getAuthors() {
		return authors;
	}

	public void setAuthors(ArrayList<String> authors) {
		this.authors = authors;
	}

}
