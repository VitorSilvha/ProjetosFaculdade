package aula05;

public class ContaTeste {

	public static void main(String[] args) {

		Conta c1 = new Conta();
		
		c1.setSaldo(100);
		c1.setNumeroConta("2231231");
		
		System.out.println(c1.getNumeroConta());
		System.out.println(c1.getSaldo());
		

	}

}
