package aula03;

import java.util.Scanner;

public class mediafunc {

	public static void main(String[] args) {
		
		
		
		Scanner nota = new Scanner(System.in);
		System.out.println("Digite a N1 do aluno");
		float n1 = nota.nextFloat();
		System.out.println("Digite a N2 do aluno");
		float n2 = nota.nextFloat();
		System.out.println("Digite a N3 do aluno");
		float n3 = nota.nextFloat();
		
		float notaGeral;
		notaGeral=(n1+n2+n3)/3;

		statusAlno ();
	}

	public static void statusAluno() {		
		
		if (notaGeral >=7.0) {
			
			System.out.println("Aluno Aprovado");
			
		}
		else if (notaGeral <5.0) {
			System.out.println("Aluno Reprovado");
		}
		
		else {
			System.out.println("Aluno em recuperaca");

		}

	}
}
