package atividade04;

import java.util.Scanner;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		System.out.println("CADASTRO DE PESSOAS");
		System.out.println();
		System.out.println("CADASTRO 1" );
		
		System.out.println("Digite o seu nome: " );
		try (Scanner teclado = new Scanner (System.in)) {
			p1.setNome(teclado.next());
		
		System.out.println("Digite sua idade: " );
		    p1.setIdade(teclado.nextInt());
		
		    teclado.nextLine(); // ESTAVA PULANDO ESSA ETAPA (IDADE), AO PESQUISAR NO FORUM DA ALURA ENTENDI O PROBLEMA E APLIQUEI EM MEU CODIGO. 
		    
		System.out.println("Digite seu endereço: " );
		    p1.setEndereço(teclado.nextLine());
		
	
		Pessoa p2 = new Pessoa();
		System.out.println("CADASTRO 2" );
		
		System.out.println("Digite o seu nome: " );
			p2.setNome(teclado.next());
		
		System.out.println("Digite sua idade: " );
			p2.setIdade(teclado.nextInt());
		
			teclado.nextLine();
			
		System.out.println("Digite seu endereço: " );
			p2.setEndereço(teclado.nextLine());
		
		System.out.println("CADASTRO 1" + "\nNOME: " + p1.getNome() + "\nIDADE: " + p1.getIdade() + "\nENDEREÇO: " + p1.getEndereço() );
		System.out.println();
		System.out.println("CADASTRO 2" + "\nNOME: " + p2.getNome() + "\nIDADE: " + p2.getIdade() + "\nENDEREÇO: " + p2.getEndereço() );

		}
	}
}
