package br.com.elevador.implentacao;

import br.com.elevador.modelo.Elevador;

public class TesteElevador {

	public static void main(String[] args) {
		
		// 1º Instanciar o objeto
		
		Elevador elevador = new Elevador();
		
		// 2º Preencher os atributos do objeto
		
		elevador.prencherNome("TORRE B");
		elevador.inicializar(20, 0, 10);
				
		// 3º Exibir os resultados
		
		System.out.println(elevador.retornarResumo());
		elevador.subir();
		elevador.subir();
		System.out.println(elevador.retornarResumo());
		elevador.subir();
		elevador.entrar(5);
		System.out.println(elevador.retornarResumo());
		elevador.descer();
		elevador.sair();
		System.out.println(elevador.retornarResumo());
		elevador.sair();
		
		
		
	}
}
