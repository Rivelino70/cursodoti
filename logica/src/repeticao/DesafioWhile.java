package repeticao;

import javax.swing.JOptionPane;

public class DesafioWhile {

	public static void main(String[] args) {

		int dia = Integer.parseInt(JOptionPane.showInputDialog("Dia"));
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Mes"));
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano"));

		while (ano<2003 || ano>1920) {
			ano = Integer.parseInt(JOptionPane.showInputDialog("Ano"));
		}

		while (mes<1 || mes>12) {
			mes = Integer.parseInt(JOptionPane.showInputDialog("Mes"));
		}

		if (mes==2) {
			while (dia<1 || dia>29) {
				dia = Integer.parseInt(JOptionPane.showInputDialog("Dia"));
				}
			}else if (mes==4 || mes==6 || mes==9 || mes==11) {
				while (dia<1 || dia>30) {
					dia = Integer.parseInt(JOptionPane.showInputDialog("Dia"));
				}
			}else {
				while (dia<1 || dia>31) {
					dia = Integer.parseInt(JOptionPane.showInputDialog("Dia"));
				}
							
			}			
			
			System.out.println("Dia: " + dia + " M?s: " + mes + " Ano: " + ano);	

		}

	}

