package aula04;

public class ProdutoTeste {

	public static void main(String[] args) {
	Podruto p1 = new Podruto();
	p1.nome = "Maca";
	p1.preco = 2.46f;
	p1.descricao = "Maca Fuji";
	
	System.out.println("Nome: " + p1.mostraNomeProduto() + " Preco: R$ " + p1.mostraPreco());

	
	Podruto p2 = new Podruto();
	p2.nome = "Laranja";
	p2.preco = 3.34f;
	p2.descricao = "Laranja";
	
	System.out.println("Nome: " + p2.mostraNomeProduto() + " Preco: R$ " + p2.mostraPreco());
	}
}
