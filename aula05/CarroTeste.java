package aula05;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro car = new Carro();
		car.setNome("Celta");
		car.setPotencia(78);
	
		System.out.println(car.getNome());
		System.out.println(car.getPotencia());

		
		Carro car2 = new Carro();
		car2.setNome("Ferrari");
		car2.setPotencia(733);
		
		System.out.println(car2.getNome());
		System.out.println(car2.getPotencia());

	}

}
