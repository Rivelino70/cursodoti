package repeticao;

import javax.swing.JOptionPane;

public class Missao {

	public static void main(String[] args) {

		int numero = Integer.parseInt(JOptionPane.showInputDialog("N�mero"));
		int chute = 0;
		int contador = 0;
		do {
			chute = Integer.parseInt(JOptionPane.showInputDialog("Adivinhe o n�mero"));
			contador=contador+1; 
			if (chute>numero) {
				JOptionPane.showMessageDialog(null, "Voc� est� chutando alto");
				//System.out.println("Voc� est� chutando alto");
			}else if (chute<numero) {
				JOptionPane.showMessageDialog(null, "Voc� est� chutando baixo");
				//System.out.println("Voc� est� chutando baixo");
			}
		}while(numero!=chute);
			JOptionPane.showMessageDialog(null, "Parab�ns voc� acertou com " + contador + " tentativas(s)");
			//System.out.println("Parab�ns voc� acertou");
		
		
		
	}
}
