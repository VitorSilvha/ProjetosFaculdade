package aula04;

public class ComputadorTeste {

	public static void main(String[] args) {
	
		Computador pc = new Computador();
		pc.nome = "Fatima" ;
		pc.clock = 1400;
		
		System.out.println(pc.mostraNomeComputador());
		System.out.println(pc.mostraClock());
	}

}
