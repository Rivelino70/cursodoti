package br.com.lojaregina.implementacao;

import br.com.lojaregina.modelo.Cliente;
import br.com.lojaregina.modelo.Colaborador;
import br.com.lojaregina.modelo.Endereco;
import br.com.lojaregina.modelo.Pagamento;
import br.com.lojaregina.modelo.Produto;
import br.com.lojaregina.modelo.Venda;

public class TesteVenda {

	public static void main(String[] args) {
		

		Cliente cliente = new Cliente();
		Produto produto = new Produto();
		Endereco endereco = new Endereco();
		Colaborador colaborador = new Colaborador();
		Pagamento pagamento = new Pagamento();
		Venda venda = new Venda();
		
		endereco.setLogradouro("Rua X");
		endereco.setNumero("50");
		endereco.setComplemento("");
		endereco.setBairro("Centro");
		endereco.setCidade("São Paulo");
		endereco.setUf("SP");
		endereco.setCep("02375-0990");
		
		cliente.setAll(endereco, 1, "Rivelino", "zubers@zuebers", "1234");
		colaborador.setEndereco(endereco);
		colaborador.setCargo("Vendedor");
		colaborador.setId(12);
		colaborador.setNome("Carla");
		colaborador.setSalario(5000);
		
		produto.setAll(1, "CHURROS", 6, 12, 10);
		
		pagamento.setData("02/05/2021");
		pagamento.setForma("DINHEIRO");
		pagamento.setId(125);
		pagamento.setValor(120);
		
		venda.setId(5421);
		venda.setData("02/05/2021");
		venda.setCliente(cliente);
		venda.setPagamento(pagamento);
		venda.setProduto(produto);
		venda.setVendedor(colaborador);
		
		System.out.println("Cliente: " + venda.getCliente().getNome());
		System.out.println("Cidade: " + venda.getCliente().getEndereco().getCidade());
		System.out.println("Vendedor: " + venda.getVendedor().getNome());
		System.out.println("Produto: " + venda.getProduto().getDescricao());
		System.out.println("Pagamento: " + venda.getPagamento().getForma());
		
				
	}
}
