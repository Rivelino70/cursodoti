package decisao;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {

		char operador = JOptionPane.showInputDialog("Digite o operador: ").charAt(0);
		short valor1 = Short.parseShort(JOptionPane.showInputDialog("Valor 1: "));
		short valor2 = Short.parseShort(JOptionPane.showInputDialog("Valor 2: "));

		if (operador=='+'){
			System.out.println("A soma dos 2 n�meros � " + (valor1+valor2));
		}
		else if (operador=='-'){
			System.out.println("A soma dos 2 n�meros � " + (valor1-valor2));
		}
		else if (operador=='*'){
			System.out.println("A soma dos 2 n�meros � " + (valor1*valor2));
		}
		else if (operador=='/'){
			System.out.println("A soma dos 2 n�meros � " + (valor1/valor2));
		}
		else {
			System.out.println("Operador inv�lido");
		}

	}

}
