import javax.swing.JOptionPane;

public class SimpleCalculator{
	public static void main(String [] args){
		double sum, diff, prod, quot;
		String strNum1, strNum2;
		
		strNum1 = JOptionPane.showInputDialog(null, "Please input the first number",
				JOptionPane.INFORMATION_MESSAGE);
		double num1 = Double.parseDouble(strNum1);
		
		strNum2 = JOptionPane.showInputDialog(null, "Please input the second number",
				JOptionPane.INFORMATION_MESSAGE);
		double num2 = Double.parseDouble(strNum2);
		
		sum = num1 + num2;
		diff = num1 - num2;
		prod = num1 * num2;
		quot = num1 / num2;
		
		JOptionPane.showMessageDialog(null, "Sum = "+ sum + "\nDifference = "+ diff
				+ "\nProduct = " + prod + "\nQuotient = "+ quot);
		
		System.exit(0);
	}
}