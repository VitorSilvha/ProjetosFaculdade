package aula13.PadariaV1;

import java.util.ArrayList;

public class CarrinhoCompras {
	
	private ArrayList<Produto> listaDeCompras;
	
	public CarrinhoCompras () {
		listaDeCompras = new ArrayList<Produto>();
	}
	
	public void AdcionarItem(Produto item) {
		listaDeCompras.add(item);
	}
	
	public void MostrarItens () {
		for (Produto p : listaDeCompras) {
			System.out.println(p);
		}
	}
	
	public float CalcularTotalDasCompras() {
		float total = 0;
		for (Produto p : listaDeCompras) {
			total = total + p.getPrecoUnidade();
		}
		return total;
	}
}
