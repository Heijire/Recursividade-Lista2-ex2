package View3;
import javax.swing.JOptionPane;

public class ex3 {

	public static void main(String[] args) {
		int tamanho; 
		
		int valor;
		tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor"));
		int vet[] = new int[tamanho];
		
		for (int i = 0; i< tamanho; i++ ) {
			valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i+1) + "�nummero natural possitivo"));
			vet[i] = valor;
		}
		
		
		int quant = 0 ;
		int quantidade = recursiva(vet, tamanho-1, quant);
		System.out.println(quantidade);
	}
	
	private static int recursiva(int vet[], int i, int quantidade ) {
		if(i >= 0) {
			if(vet[i] % 2 == 0) {
				quantidade++;
			}
			return recursiva(vet, --i, quantidade );
		} else {
			return quantidade ;
		}

	}
}
