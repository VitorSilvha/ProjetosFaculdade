package aula13.Ingresso;

public class Vip extends Ingressos {

	public Vip() {
		super(70f, "Ingrsso VIP (frente do palco)");
	}

	@Override
	public String toString() {
		return "Vip [valor=" + valor + ", descricao=" + descricao + "]";
	}

}
