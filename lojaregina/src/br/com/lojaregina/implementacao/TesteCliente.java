package br.com.lojaregina.implementacao;

import javax.swing.JOptionPane;

import br.com.lojaregina.modelo.Cliente;

public class TesteCliente {
		
		public static void main(String[] args) {
			// Instanciando Objeto
			Cliente objeto = new Cliente();
			
			// Preenchendo Objeto
			objeto.setId(Integer.parseInt(JOptionPane.showInputDialog("ID")));
			objeto.setNome(JOptionPane.showInputDialog("Nome").toUpperCase());
			objeto.setEmail(JOptionPane.showInputDialog("Email").toLowerCase());
			objeto.setTelefone(JOptionPane.showInputDialog("Telefone"));
			
			// Retornando os dados do Objeto
			System.out.println("ID: " + objeto.getId());
			System.out.println("Nome: " + objeto.getNome());
			System.out.println("Email: " + objeto.getEmail());
			System.out.println("Fone: " + objeto.getTelefone());

		}
}
