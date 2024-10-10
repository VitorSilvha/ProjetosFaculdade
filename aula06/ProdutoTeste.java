package aula06;

public class ProdutoTeste {

	public static void main(String[] args) {
		Produto p1 = new Produto("Maca", 2.34f);
		System.out.println(p1.mostraNomeProduto() + p1.mostraPreco());
		
		Produto p2 = new Produto("Laranja", 2.12f, "Suco"); {
		System.out.println(p2.mostraNomeProduto() + p2.mostraPreco() + p2.mostradescricaoProduto());
	}		
  }
}
