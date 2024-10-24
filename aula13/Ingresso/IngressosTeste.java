package aula13.Ingresso;

public class IngressosTeste {

	public static void mostraIngressos(Ingressos i) {
		System.out.println(i.toString());
	}

	public static void main(String[] args) {
	
		Vip v1 = new Vip();
		Pista p1 = new Pista();
		BackStage b1 = new BackStage();
		
		IngressosTeste.mostraIngressos(v1);
		IngressosTeste.mostraIngressos(p1);
		IngressosTeste.mostraIngressos(b1);
	}

}
