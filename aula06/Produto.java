package aula06;

public class Produto {
	private String nome;
	private float preco;
	private String descricao;
	
	String mostraNomeProduto() {
		return nome;
	}
	
	float mostraPreco() {
		return preco;
	}
	
	String mostradescricaoProduto() {
		System.out.println(descricao);
		return descricao;
	}

	public Produto(String nome, float preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	public Produto(String nome, float preco, String descricao) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
	}
}
