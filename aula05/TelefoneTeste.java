package aula05;

public class TelefoneTeste {

	public static void main(String[] args) {
		
		Telefone tel1 = new Telefone();
		tel1.setNumeroTelefone("51994292248");
		tel1.setOperadora("Claro");
		
		
		System.out.println(tel1.getNumeroTelefone());
		System.out.println(tel1.getOperadora());
		
		Telefone tel2 = new Telefone();
		tel2.setNumeroTelefone("51987602934");
		tel2.setOperadora("Vivo");
		
		
		System.out.println(tel2.getNumeroTelefone());
		System.out.println(tel2.getOperadora());
	}

}
