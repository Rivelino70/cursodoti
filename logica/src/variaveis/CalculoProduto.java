package variaveis;

import javax.swing.JOptionPane;

public class CalculoProduto {
	
	public static void main(String[] args) {
			
		/* 
		 * - nome do produto
		 * - qtde do produto
		 * - valor unitario
		 * exibir no final
		 * - nome do produto
		 * - valor total
		 * - valor do imposto ( 17% do valor total)
		 */
		
		String produto 	= JOptionPane.showInputDialog("Digite o nome do produto");	
		int qtde 		= Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade"));
		double valor 	= Double.parseDouble(JOptionPane.showInputDialog("Valor Unitario"));
		double percimp 	= Double.parseDouble(JOptionPane.showInputDialog("% Imposto"));
		double total 	= (qtde * valor);
		double imp      = (total * percimp);
		
		System.out.println("Produto...: " + produto);
		System.out.println("Valor Total..: " + total);
		System.out.println("Imposto....: " + imp);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
