package View1;
import javax.swing.JOptionPane;
public class ex1 {
	public static void main(String[] args) {
		int a, b;
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
		int valor = recursividade(a, b);
		System.out.println(valor);
	}

	private static int recursividade(int a, int b) {
		if (b <= 1) {
			return a;
		} else {
			return a + (recursividade(a, --b));
		}

	}

}
