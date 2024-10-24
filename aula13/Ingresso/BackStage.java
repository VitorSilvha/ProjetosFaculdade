package aula13.Ingresso;

public class BackStage extends Ingressos {

	public BackStage() {
		super(100f, "Ingresso BackStage (perto do palco)");
	}

	@Override
	public String toString() {
		return "BackStage [getValor()=" + getValor() + ", getDescricao()=" + getDescricao() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	

}
