package variaveis;

public class ManipulaString {
	
	public static void main(String[] args) {
		
		String email = "Rivelino.tazinaffo@Gmail.com";
		System.out.println("Original: "+ email);
		System.out.println("Minuscula: "+ email.toLowerCase());
		System.out.println("Maiuscula: "+ email.toUpperCase());
		System.out.println("Tem arroba ?  " + email.contains("@"));
		System.out.println("Posi??o do @: " + email.indexOf("@"));
		System.out.println("Qtde de Caracteres: " + email.length());
		System.out.println("Do 2? at? o 5?: " + email.substring(1,5));
		System.out.println("Primeira metade: " + email.substring(0, email.length()/2));
		System.out.println("Usu?rio: " + email.substring(0, email.indexOf("@")).toLowerCase());
		System.out.println("Servidor " + email.substring(email.indexOf("@") + 1).toUpperCase());
		System.out.println("Primeiro Caracter: " + email.toLowerCase().charAt(0));
			
		
	}

}
