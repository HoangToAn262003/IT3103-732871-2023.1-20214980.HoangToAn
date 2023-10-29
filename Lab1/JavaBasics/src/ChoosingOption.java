import javax.swing.JOptionPane;
public class ChoosingOption {
	public static void main(String[] args) {
		String []options = {"I do", "I don't", "Cancel"};
		int option = JOptionPane.showOptionDialog(null,
				"Do you want to change to the first class ticket?",
				null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
				null, options, options[0]);
		
		JOptionPane.showMessageDialog(null, "You've chosen: " + (option == JOptionPane.YES_OPTION?"I do":"I don't"));
		System.exit(0);
	}
}
