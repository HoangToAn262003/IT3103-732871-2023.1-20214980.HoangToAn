package hust.soict.globalict.aims.cart;
import java.util.Comparator;

import hust.soict.globalict.aims.media.Media;
public class MediaComparatorByCostTitle {
    Comparator<Media> compare = Comparator.comparing(Media::getCost).thenComparing(Media::getTitle);
}
