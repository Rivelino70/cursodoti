package br.com.elevador.modelo;

public class Elevador {

	private String nome;
	private int andarMaximo;
	private int andarMinimo;
	private int capacidadePessoas;
	private int qtdePessoas;
	private int andarAtual;


	public void entrar(int qtde) {
		int resultado = qtdePessoas + qtde;
		if (resultado<=capacidadePessoas) {
			qtdePessoas+=qtde;
		}
	}

	public void sair(int qtde) {
		int resultado = qtdePessoas - qtde;
		if (resultado>=0) {
			qtdePessoas-=qtde;
		}
	}

	public void sair() {
		if (qtdePessoas>0) {
			qtdePessoas--;
		}
	}

	public String descer() {
		if (andarAtual==andarMinimo) {
			return "Já esta no andar minimo";
		}
		andarAtual--;
		return "Descendo";
	}

	public String subir() {
		if (andarAtual==andarMaximo) {
			return "Já esta no ultimo andar";
		}
		andarAtual++;
		return "Subindo";
	}

	public String retornarResumo() {
		return
				"Nome do Elevador: " + nome + "\n" +
				"Andar Atual.....: " + andarAtual + "\n" +
				"Qtde de Pessoas.: " + qtdePessoas;
	}

	public void inicializar(int pAndarMax, int pAndarMin, int pCapPessoas) {
		andarMaximo=pAndarMax;
		andarMinimo=pAndarMin;
		capacidadePessoas=pCapPessoas;
	}
	public void prencherNome(String param) {
		nome=param;
	}
	public String retornarNome() {
		return nome;
	}


}
