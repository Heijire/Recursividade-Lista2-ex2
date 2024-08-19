package view5;
import javax.swing.JOptionPane;

public class ex5 {
	public static void main(String[] args) {

		int a, b;
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
			
		System.out.println(mdc(a,b));
	}
	private static int mdc(int a , int b) {
		if(a > b) {
			return mdc(a-b, b);
		} else if( a == b) {
			return b;
		} else {
			return mdc(b, a);
		}
	}
}
