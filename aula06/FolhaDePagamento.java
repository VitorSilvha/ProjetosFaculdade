package aula06;

public class FolhaDePagamento {
	
	private String nome1;
	private float salario1;
	private String nome2;
	public String getNome1() {
		return nome1;
	}

	public void setNome1(String nome1) {
		this.nome1 = nome1;
	}

	public float getSalario1() {
		return salario1;
	}

	public void setSalario1(float salario1) {
		if(salario1 > 0) {
		this.salario1 = salario1;
		}
		else {
			System.out.println("Número negativo");
		}
	}

	public String getNome2() {
		return nome2;
	}

	public void setNome2(String nome2) {
		this.nome2 = nome2;
	}

	public float getSalario2() {
		return salario2;
	}

	public void setSalario2(float salario2) {
		if(salario2 > 0) {
			this.salario2 = salario2;
			}
			else {
			System.out.println("Numero negativo");
			}
	}

	private float salario2;
	
	public float totalFolhaPagamento(float a, float b) {
		return salario1 + salario2;
	}
}
