package decisao;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {

		//* Exercicio 2:
		//* Considere receber a quantidade de di?rias de um hotel e o valor da di?ria. 
		//* Sobre a di?ria haver? uma taxa que depende da quantidade de di?rias.
		//* Se a quantidade de di?rias for maior que 10 a taxa ser? de 5%
		//* Se a quantidade estiver entre 5 e 10 a taxa ser? de 8%
		//* Se a quantidade de diarias for menor que 5 a taxa ser? de 10%
		//* Exiba o valor final.

		//String operador = JOptionPane.showInputDialog("Operador Matem?tico: ");
		short qtdeDiaria = Short.parseShort(JOptionPane.showInputDialog("Quantidade de Di?rias: "));
		float valorDiaria = Float.parseFloat(JOptionPane.showInputDialog("Valor da Diaria: "));
		float taxa=0;
	
		if (qtdeDiaria>10){
			System.out.println("Valor da Di?ria: R$ " + valorDiaria + " \nQuantidade de Di?rias: " + qtdeDiaria + " \nValor do Taxa %: " + 
					(valorDiaria*0.05) + " Valor Total: " + (valorDiaria*qtdeDiaria*.95));
		}

		else if (qtdeDiaria>=5 && qtdeDiaria<=10){
			System.out.println("Valor da Di?ria: R$ " + valorDiaria + " \nQuantidade de Di?rias: " + qtdeDiaria + " \nValor do Taxa %: " + 
					(valorDiaria*0.08) +" \nValor Total: " + (valorDiaria*qtdeDiaria*.92));
		}
		
		else if (qtdeDiaria<5){
			System.out.println("Valor da Di?ria: R$ " + valorDiaria + " \nQuantidade de Di?rias: " + qtdeDiaria + " \nValor do Taxa %: " + 
					(valorDiaria*0.1) +	" \nValor Total: " + (valorDiaria*qtdeDiaria*.90));
		}

		
				

	}

}
