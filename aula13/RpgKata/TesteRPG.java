package aula13.RpgKata;

public class TesteRPG {

	public static void main(String[] args) {
		
		Personagem p1 = new Personagem(0, 1, true);
		Personagem p2 = new Personagem(1000, 10, true);
	
		p1.Atacar(p2, 0);
		p1.Atacar(p1, 0);
		p1.Curar(p2, 0);
		p1.Curar(p1, 0);
		
		System.out.println(p1);
		System.out.println("");
		System.out.println(p2);
	}


}
