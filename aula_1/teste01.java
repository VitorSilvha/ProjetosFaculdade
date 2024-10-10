package aula_1;

import java.util.Scanner;

public class teste01 {

	public static void main(String[] args) { 
	
	float area; 
		
		
												try (/* SAIDA DE DADOS, PODEMOS UTILIZAR PRINTLN (QUEBRA DE LINHA AUTOMÁTICA
													   	PRINTF (CONFORME A LINGUAGÉM C
													   	PRINT */                     
		Scanner lado = new Scanner(System.in)) {
			System.out.println("Digite o lado do quadrado: ");   // 	ENTRADA DE DADOS
			float x = lado.nextFloat();
			area=x*x;
		}
		System.out.println("O numero digitado foi " + area ); //ENTRADA E SAIDA DE DADOS
	}

}
