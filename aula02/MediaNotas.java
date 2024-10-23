package aula02;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Entre com a nota 1: ");
		float n1 = entrada.nextFloat();
		System.out.print("Entre com a nota 2: ");
		float n2 = entrada.nextFloat();
		System.out.print("Entre com a nota 3: ");
		float n3 = entrada.nextFloat();
		float media = (n1+n2+n3)/3;
		
//		A m�dia de aprova��o � >= 7.0; 
//		a m�dia de recupera��o � >= 5.0 e < 7.0; e
//		a m�dia do reprovado � < 5.0
		if (media >= 7f) {
//			System.out.println("Aluno aprovado");
			System.out.printf("Aluno aprovado com nota %.2f\n");
//		} else if (media >= 5f) {
		} else if (media >= 5.0 && media < 7.0) {
				System.out.println("Aluno em recuperacao");
		} else {
			System.out.println("Aluno reprovado");
		}

	}

}
