package hust.soict.globalict.aims.media;

public class MediaComparatorByTitleCost {
	public int compare(Media m1, Media m2) {
		int titleCompare = m1.getTitle().compareTo(m2.getTitle());
		
		if (titleCompare != 0) {
			return titleCompare;
		}
		
		return Float.compare(m1.getCost(), m2.getCost());
	}
}
