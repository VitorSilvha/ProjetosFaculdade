package aula_02;

import java.util.Scanner;

public class teste02 {

	public static void main(String[] args) { 
		
		
		System.out.println("Digite um numero: ");
		try (Scanner entrada = new Scanner(System.in)) {
			int x = entrada.nextInt();
			
			System.out.println("Digite outro numero: ");
			int y = entrada.nextInt();
			
				if(x > y ){
					System.out.println("O maior numero foi " + x );			
				}
				else {
					System.out.println("O maior numero foi " + y );		
				}
		}
	
	}

}
