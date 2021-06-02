package br.com.unixyz.modelo;

public class Endereco {

		private String logradouro;
		private String complemento;
		private String numero;
		private String bairro;
		private String cidade;
		private String uf;
		private String cep;
		
		
		public Endereco() {
			super();
		}


		public Endereco(String logradouro, String complemento, String numero, String bairro, String cidade, String uf,
				String cep) {
			super();
			this.logradouro = logradouro;
			this.complemento = complemento;
			this.numero = numero;
			this.bairro = bairro;
			this.cidade = cidade;
			this.uf = uf;
			this.cep = cep;
		}


		public String getLogradouro() {
			return logradouro;
		}


		public void setLogradouro(String logradouro) {
			this.logradouro = logradouro;
		}


		public String getComplemento() {
			return complemento;
		}


		public void setComplemento(String complemento) {
			this.complemento = complemento;
		}


		public String getNumero() {
			return numero;
		}


		public void setNumero(String numero) {
			this.numero = numero;
		}


		public String getBairro() {
			return bairro;
		}


		public void setBairro(String bairro) {
			this.bairro = bairro;
		}


		public String getCidade() {
			return cidade;
		}


		public void setCidade(String cidade) {
			this.cidade = cidade;
		}


		public String getUf() {
			return uf;
		}


		public void setUf(String uf) {
			this.uf = uf;
		}


		public String getCep() {
			return cep;
		}


		public void setCep(String cep) {
			this.cep = cep;
		}
		
		
		
		
}
