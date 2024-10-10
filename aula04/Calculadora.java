package aula04;

public class Calculadora {
	int valor;
	String operacao;

	int somar(int a, int b) {
		operacao = "soma";
		valor = a+b;
		return valor;
	}
	int subtratir(int a, int b) {
		operacao = "subtracao";
		valor = a-b;
		return valor;
		
	}
	
	int ultimoResultado() {
		return valor;
	}
	String ultimaOperacao() {
		return operacao;
	}
}

