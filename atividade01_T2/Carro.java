package atividade01_T2;

public class Carro {

	private String nome;
	private String marca;
	private int potencia;
	
	
	public void Carro(String nome, int potencia) {

		System.out.println("Informações do carro: " + nome + potencia);
	}
	public void Carro(String nome, String marca, int potencia) {
		System.out.println("Informações do carro: " + nome + marca + potencia);
	}
	public void Carro(String nome, String marca) {
		System.out.println("Informações do carro: " + nome + marca);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

}
