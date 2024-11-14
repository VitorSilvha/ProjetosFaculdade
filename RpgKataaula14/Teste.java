package RpgKataaula14;

import aula13.RpgKata.Personagem;

public class Teste {

	public static void main(String[] args) {
		
		Personagem p1 = new Personagem(100, 1, true);
		Personagem p2 = new Personagem(100, 10, true);
		try {
		p1.Atacar(p2, 0);
		p1.Atacar(p1, 0);
		p1.Curar(p2, 0);
		p1.Curar(p1, 0);
		} catch (Exception e) {
			System.out.println("Deu problema");
			e.printStackTrace();
		}
	
		System.out.println(p1);
		System.out.println("");
		System.out.println(p2);
		
	}
}
