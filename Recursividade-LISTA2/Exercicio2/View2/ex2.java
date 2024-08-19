package View2;
import javax.swing.JOptionPane;

public class ex2 {

	public static void main(String[] args) {
		int a, b;
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite o dividendo"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite o divisor"));
		int x = recursiva(a, b);
		System.err.println(x);
	}
	private static int recursiva(int a, int b) {
		if (a < b) {
			return a;
		} else {
			return recursiva( (a-b), b) ;
		}
	}
}
