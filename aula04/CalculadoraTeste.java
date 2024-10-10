package aula04;


public class CalculadoraTeste {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();{
			calc.somar(10, 5);
			System.out.println(calc.ultimaOperacao() + " = " + calc.ultimoResultado());
			
			calc.subtratir(6, 5);
			System.out.println(calc.ultimaOperacao() + " = " + calc.ultimoResultado());			
		}
	}
}
