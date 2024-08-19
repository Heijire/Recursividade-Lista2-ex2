package view4;
import javax.swing.JOptionPane;

public class ex4 {

	public static void main(String[] args) {
		int valor;
		do {
			valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero impar"));
		} while(valor % 2 == 0);
		
		
		System.err.print(calcular(valor));
	}

	private static int calcular(int valor) {
		if(valor < 0) {
			return 1;
		} else { 
			return valor * calcular(valor -2);
		}
	}

}
