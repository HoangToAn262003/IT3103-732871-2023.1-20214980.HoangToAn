package hust.soict.globalict.aims.screen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.media.Playable;
import javafx.collections.ObservableList;

// Hoàng Tố An - 20214980
public class MediaStore extends JPanel{
	private Media media;
	
	static StoreScreen m;
	Cart c = new Cart();
	public JButton Add;
//	ArrayList<Media>test = s.itemsOrdered;
//	ArrayList<MediaStore>test1 = new ArrayList<MediaStore>();
	ObservableList<Media>test = c.itemsOrdered;
//	ObservableList<MediaStore>test1 = new ObservableList<MediaStore>();
	
	public MediaStore() {
	}
	
	public MediaStore(Media media) {
		this.media = media;
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JLabel title = new JLabel(media.getTitle());
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 20));
		title.setAlignmentX(CENTER_ALIGNMENT);
	    
		JLabel cost = new JLabel("" + media.getCost() + " $");
		cost.setAlignmentX(CENTER_ALIGNMENT);
		
		JPanel container = new JPanel();
		container.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		Add = new JButton("Add to cart");
		container.add(Add);
		//Add.addActionListener(new ButtonListener());
		
		if (media instanceof Playable) {
			JButton play = new JButton("Play");
			play.addActionListener(new ButtonListener());
			container.add(play);
		}
		
		this.add(Box.createVerticalGlue());
		this.add(title);
		this.add(cost);
		this.add(Box.createVerticalGlue());
		this.add(container);

		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}
	
	//Hoàng Tố An - 20214980
	public class ButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			String button = e.getActionCommand();
			if (button.equals("Play")) {
				JDialog d = new JDialog(m, "Dialog Box");
				JLabel l = new JLabel(media.getTitle() + " now playing");
	            d.add(l);
	 
	            d.setSize(300, 100);
	            d.setVisible(true);
			}
			if (button.equals("Add to cart")) {
				c.addMedia(media);
				c.print();
			}
		}
	}

}
