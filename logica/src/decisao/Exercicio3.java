package decisao;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {

		//* Exercicio 3:
		//* Receba o valor do salário bruto, o nome de um colaborador e a qtde de faltas.
		//* Se não houver faltas o salario bruto receberá um aumento de 2%.
		//* Calcule o valor do INSS sobre o salário bruto.
		//* Exiba no final o salário bruto, e o salário liquido (retirando o INSS e 8% do FGTS)

		String colaborador = JOptionPane.showInputDialog("Colaborador").toUpperCase();
		float salarioBruto = Float.parseFloat(JOptionPane.showInputDialog("Salário bruto"));
		byte qtdeFaltas = Byte.parseByte(JOptionPane.showInputDialog("Quantidade de faltas: "));
		if (qtdeFaltas==0) {
			salarioBruto = salarioBruto * (float) 1.02;
		}
		float inss=0;
		if (salarioBruto<=1100) {
				inss = salarioBruto * (float) 0.07;
		}else if (salarioBruto>1100.01 && salarioBruto<=2203.48) {
				inss = salarioBruto * (float) 0.09;
		}else if (salarioBruto>2203.49 && salarioBruto<=3305.22) {
				inss = salarioBruto * (float) 0.12;
		}else 
				inss = salarioBruto * (float) 0.14;

		System.out.println("Salario Bruto: " + salarioBruto);
		System.out.println("Salário Liquído: " + (salarioBruto - inss - salarioBruto*0.08));



		}

	}
