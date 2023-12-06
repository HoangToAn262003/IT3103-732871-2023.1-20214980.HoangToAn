package hust.soict.dsai.aims.cart;
import java.util.Comparator;

import hust.soict.dsai.aims.media.Media;
public class MediaComparatorByCostTitle {
    Comparator<Media> compare = Comparator.comparing(Media::getCost).thenComparing(Media::getTitle);
}
