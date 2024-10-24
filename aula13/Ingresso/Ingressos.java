package aula13.Ingresso;

public class Ingressos {
	
	protected float valor;
	protected String descricao;
	
	
	public Ingressos() {
		super();
	}
	public Ingressos(float valor, String descricao) {
		super();
		this.valor = valor;
		this.descricao = descricao;
	}
	
	
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	@Override
	public String toString() {
		return "Ingressos [valor=" + valor + ", descricao=" + descricao + "]";
	}
	


}
