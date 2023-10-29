import javax.swing.JOptionPane;
import java.lang.Math;
public class Equations{
	public static void main(String[] args) {
		String choices[] = {"One variable Linear Equation", "Two variables Linear System",
				"One variable Second-degree Equation"};
		String input = (String) JOptionPane.showInputDialog(null, "Choose please", "Options menu",
				JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);
		
		if (input == "One variable Linear Equation") {
			String num_a, num_b;
			
			num_a = JOptionPane.showInputDialog(null, "Nhap a: ", JOptionPane.INFORMATION_MESSAGE);
			double a = Double.parseDouble(num_a);
			
			num_b = JOptionPane.showInputDialog(null, "Nhap b: ", JOptionPane.INFORMATION_MESSAGE);
			double b = Double.parseDouble(num_b);
			if(a != 0) {
				double kq = -b/a;
				JOptionPane.showMessageDialog(null, "Phuong trinh co nghiem duy nhat la: " +kq);
			}
			else if(a == 0) {
				if(b != 0) {
					JOptionPane.showMessageDialog(null, "Phuong trinh vo nghiem.");
				}
				else if(b == 0) {
					JOptionPane.showMessageDialog(null, "Phuong trinh co vo so nghiem.");
				}
			}
		}
		else if(input == "Two variables Linear System") {
			String num_a1, num_b1, num_c1, num_a2, num_b2, num_c2;
			num_a1 = JOptionPane.showInputDialog(null, "Nhap he so thu nhat phuong trinh thu nhat: ",
					JOptionPane.INFORMATION_MESSAGE);
			num_b1 = JOptionPane.showInputDialog(null, "Nhap he so thu hai phuong trinh thu nhat: ",
					JOptionPane.INFORMATION_MESSAGE);
			num_c1 = JOptionPane.showInputDialog(null, "Nhap ket qua phuong trinh thu nhat: ",
					JOptionPane.INFORMATION_MESSAGE);
			
			num_a2 = JOptionPane.showInputDialog(null, "Nhap he so thu nhat phuong trinh thu hai: ",
					JOptionPane.INFORMATION_MESSAGE);
			num_b2 = JOptionPane.showInputDialog(null, "Nhap he so thu hai phuong trinh thu hai: ",
					JOptionPane.INFORMATION_MESSAGE);
			num_c2 = JOptionPane.showInputDialog(null, "Nhap ket qua phuong trinh thu hai: ",
					JOptionPane.INFORMATION_MESSAGE);
			
			double a1 = Double.parseDouble(num_a1);
			double b1 = Double.parseDouble(num_b1);
			double c1 = Double.parseDouble(num_c1);
			
			double a2 = Double.parseDouble(num_a2);
			double b2 = Double.parseDouble(num_b2);
			double c2 = Double.parseDouble(num_c2);
			
			double D = a1 * b2 - a2 * b1;
			double DX = c1 * b2 - c2 * b1;
			double DY = a1 * c2 - a2 * c1;
			double kq1 = DX/D;
			double kq2 = DY/D;
			
			if(D != 0) {
				JOptionPane.showMessageDialog(null, "He phuong trinh co cap nghiem la: " + kq1 + ", " + kq2);
			}
			else if(D == 0) {
				if(DX != 0 || DY != 0) {
				   JOptionPane.showMessageDialog(null, "He phuong trinh vo nghiem.");
				}
				else if(DX == 0 && DY == 0) {
					JOptionPane.showMessageDialog(null, "He phuong trinh co vo so nghiem.");
				}
			}
		}
		else if(input == "One variable Second-degree Equation") {
			String num_a, num_b, num_c;
			num_a = JOptionPane.showInputDialog(null, "Nhap a: ", JOptionPane.INFORMATION_MESSAGE);
			int a = Integer.parseInt(num_a);
			
			num_b = JOptionPane.showInputDialog(null, "Nhap b: ", JOptionPane.INFORMATION_MESSAGE);
			int b = Integer.parseInt(num_b);
			
			num_c = JOptionPane.showInputDialog(null, "Nhap c: ", JOptionPane.INFORMATION_MESSAGE);
			int c = Integer.parseInt(num_c);
			
			double delta = b*b-4*a*c;
			if(delta < 0) {
				JOptionPane.showMessageDialog(null, "Phuong trinh vo nghiem");
			}
			else if(delta == 0) {
				  double kq1 = b / (-2)*a;
				  JOptionPane.showMessageDialog(null, "Phuong trinh co nghiem kep" + kq1);
			}
			else if(delta > 0) {
				double kq = (-b + Math.sqrt(delta))/(2*a);
				double kq1 = (-b - Math.sqrt(delta))/(2*a);

				JOptionPane.showMessageDialog(null, "Phuong trinh co 2 nghiem phan biet: " + kq + ", " + kq1);
			  
			}
		}
	}
}