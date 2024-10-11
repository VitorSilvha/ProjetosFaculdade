package aula06;

public class FolhaDePagamentoTeste {

	public static void main(String[] args) {
		
		FolhaDePagamento folha = new FolhaDePagamento();
		
		folha.setNome1("Ricardo");
		folha.setSalario1(1500f);	
		System.out.println("Nome funcionario1: " + folha.getNome1() + ", salario R$ " + folha.getSalario1());
	
		folha.setNome2("Michele");
		folha.setSalario2(2500f);
		System.out.println("Nome funcionario2: " + folha.getNome2() + ", salario R$ " + folha.getSalario2());
		System.out.println("=============================================");
		System.out.println("Total da folha de pagamento R$ " + folha.totalFolhaPagamento(0, 0));
		System.out.println("=============================================");

	}

}
