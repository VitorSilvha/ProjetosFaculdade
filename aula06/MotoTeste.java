package aula06;

public class MotoTeste {

	public static void main(String[] args) {

		Moto modelo1 = new Moto();
		
		modelo1.setNome("Honda");
		modelo1.setMarca("Fan");
		modelo1.setPeso(107.9f);
		modelo1.setPotencia(125);
		
		System.out.println(" Nome: " + modelo1.getNome() + "\n Marca: " + modelo1.getMarca() + 
				"\n Peso " + modelo1.getPeso() + " Kg" + "\n Potencia " + modelo1.getPotencia());
		
		System.out.println("=================");
		
		Moto modelo2 = new Moto();
		
		modelo2.setNome("Honda");
		modelo2.setMarca("CB");
		modelo2.setPeso(127.54f);
		modelo2.setPotencia(300);
		
		System.out.println(" Nome: " + modelo2.getNome() + "\n Marca: " + modelo2.getMarca() + 
				"\n Peso " + modelo2.getPeso() + " Kg" + "\n Potencia " + modelo2.getPotencia());
		
	}

}
