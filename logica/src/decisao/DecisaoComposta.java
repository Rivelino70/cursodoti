package decisao;

import javax.swing.JOptionPane;

public class DecisaoComposta {
		
	public static void main(String[] args) {
			
		String nome = JOptionPane.showInputDialog("Nome : ").toUpperCase();
		short idade = Short.parseShort(JOptionPane.showInputDialog("Idade: "));
		//float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2: "));
		//float media = (nota1+nota2)/2;
	
	if (idade>=18 && idade<70 ) {
			System.out.println("Seu voto é obrigatório!");
		}

	else if (idade<16) {
			System.out.println("Você não pode votar, idade mínima 14!");
		}

	else {
			System.out.println("Seu voto é facultativo!");
	}
	
	System.out.println("Nome: " + nome + " Idade: " + idade);

	}
	
}
