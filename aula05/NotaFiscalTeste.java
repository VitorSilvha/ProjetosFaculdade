package aula05;

public class NotaFiscalTeste {

	public static void main(String[] args) {

		NotaFiscal fiscal1 = new NotaFiscal();
		
		fiscal1.nomeItem1= " Bola de futebool ";
		fiscal1.nomeItem2= " Camiseta de time ";
		fiscal1.precoItem1= 30.00f;
		fiscal1.precoItem2= 400.00f;
		
		
		System.out.println("NOTA FISCAL: " + fiscal1.mostraNomeItem1() + "Preco: R$ " + fiscal1.precoItem1 +
						   fiscal1.mostraNomeItem2() + "Preco: R$ " + fiscal1.precoItem2 + " TOTAL R$ = " + fiscal1.calculaNotaFiscal());
	
		
		NotaFiscal fiscal2 = new NotaFiscal();
		
		fiscal2.nomeItem1= " Pão frances ";
		fiscal2.nomeItem2= " Queijo ";
		fiscal2.precoItem1= 2.75f;
		fiscal2.precoItem2= 4.45f;
		
		System.out.println("NOTA FISCAL: " + fiscal2.mostraNomeItem1() + "Preco: R$ " + fiscal2.precoItem1 +
				   fiscal2.mostraNomeItem2() + "Preco: R$ " + fiscal2.precoItem2 + " TOTAL R$ = " + fiscal2.calculaNotaFiscal());

		
		
		NotaFiscal fiscal3 = new NotaFiscal();
		
		fiscal3.nomeItem1= " Pão de forma ";
		fiscal3.nomeItem2= " Presunto ";
		fiscal3.precoItem1= 5.75f;
		fiscal3.precoItem2= 3.45f;
		
		System.out.println("NOTA FISCAL: " + fiscal3.mostraNomeItem1() + "Preco: R$ " + fiscal3.precoItem1 +
				   fiscal3.mostraNomeItem2() + "Preco: R$ " + fiscal3.precoItem2 + " TOTAL R$ = " + fiscal3.calculaNotaFiscal());

	}
}
