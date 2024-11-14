package aula16.FormaGeometrica;

import java.util.Objects;

public abstract class FormaGeometrica {
	protected String nome;
	protected float area;
	
	protected abstract float totalArea();
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	public FormaGeometrica(String nome, float area) {
		super();
		this.nome = nome;
		this.area = area;
	}
	@Override
	public String toString() {
		return "FormaGeometrica [nome=" + nome + ", area=" + area + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(area, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FormaGeometrica other = (FormaGeometrica) obj;
		return Float.floatToIntBits(area) == Float.floatToIntBits(other.area) && Objects.equals(nome, other.nome);
	}
	
}

