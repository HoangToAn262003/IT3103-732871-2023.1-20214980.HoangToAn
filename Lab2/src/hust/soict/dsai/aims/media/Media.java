package hust.soict.dsai.aims.media;

import java.util.Comparator;
import java.util.Objects;

import hust.soict.dsai.aims.cart.MediaComparatorByCostTitle;

public class Media {
	private int id;
	private String title;
	private String category;
	private float cost;
  //  public static final Comparator<Media> COMPARE_BY_COST_TITLE = (Comparator<Media>) new MediaComparatorByCostTitle();
   // java.util.Collection.sort(collection, COMPARE_BY_COST_TITLE)
	public Media() {
		// TODO Auto-generated constructor stub
	}
	public Media(int id, String title, String category, float cost) {
		this.id = id;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	public Media(String title) {
		this.title = title;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Media other = (Media) obj;
		return Objects.equals(title, other.title);
	}
    
}
