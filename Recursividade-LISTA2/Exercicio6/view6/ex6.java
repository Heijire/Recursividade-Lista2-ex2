package view6;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class ex6 {
	public static void main(String []args) {
		int num = 0;
		while(num!= 9) {
			num = Integer.parseInt(JOptionPane.showInputDialog(" Digite a opção desejada \n 1 - Vetor de 10"
					+ "\n 2 - Vetor de 11 \n 9 - Finalizar"));
			switch (num) {
			case 1: 		int vet10[] = new int [10];
							for(int i = 0; i <10; i++) {
									vet10[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+ (i+1) + "º numero"));	
							}
							JOptionPane.showMessageDialog(null, Arrays.toString(vet10));
							vet10 = iverter(vet10, 0, vet10.length -1);
							JOptionPane.showMessageDialog(null, Arrays.toString(vet10));
				break;
			case 2:			int vet11[] = new int [11];
							for(int i = 0; i <11; i++) {
								vet11[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+ (i+1) + "º numero"));
							}
							JOptionPane.showMessageDialog(null, Arrays.toString(vet11));
							vet11 = iverter(vet11, 0, vet11.length -1);
							JOptionPane.showMessageDialog(null, Arrays.toString(vet11));
				break;
			case 9: JOptionPane.showMessageDialog(null, "Programa Finalizado");
				break;
			default: JOptionPane.showMessageDialog(null, "Opcão invalida");
				break;
			}	
		}
	}

	private static int[] iverter(int[] vet, int inicio, int fim) {
		if(inicio < fim) {
			int temporario = vet[inicio];
			vet[inicio] = vet[fim];
			vet[fim] = temporario;
			iverter(vet, inicio +1 , fim -1);

		}
		return vet;	
	}
}
