package aula03;

public class forfunc {

	public static void main(String[] args) {

		for (int i = 0; i <= 100; i++) {
		System.out.print(" " + i);
//		parOuimpar(i);  //CHAMADA DA FUNÇÃO
	ehPar(i);
	}	
}
	
	// CRIAÇÃO DA FUNÇÃO
	public static void parOuimpar(int valor) {
		
		if(valor==0) {
			System.out.println(" - Número (Par)");
			}
			else
			System.out.println(" - Número (Impar)");
			}
	public static boolean ehPar(int valor) {
		if(valor==0) {
			return true;
		}
		return false;
	}
}