package aula13.RpgKata;

import java.util.Objects;

public class Personagem {
	
	protected int saude = 1000;
	protected int nivel = 1;
	protected boolean vivo;
	
	public Personagem(int saude, int nivel, boolean vivo) {
		super();
		this.saude = saude;
		this.nivel = nivel;
		this.vivo = vivo;
	}
	
	public void Atacar(Personagem p, int dano) {
		int novaSaude = p.getSaude() - dano;
		p.setSaude(novaSaude);
		if (dano > novaSaude) {
			vivo = false;
		}
		else
		vivo = true;
	}
	
	public void Curar (Personagem p, int cura) {
		if (vivo == true) {
			int novaCura = p.getSaude() + cura;
			p.setSaude(novaCura);
		}
		else
			System.out.println("Personagem se fudeu");
	}
	
	public int getSaude() {
		return saude;
	}
	public void setSaude(int saude) {
		this.saude = saude;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public boolean isVivo() {
		return vivo;
	}
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}
	@Override
	public String toString() {
		return "Personagem [saude=" + saude + ", nivel=" + nivel + ", vivo=" + vivo + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(nivel, saude, vivo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personagem other = (Personagem) obj;
		return nivel == other.nivel && saude == other.saude && vivo == other.vivo;
	}

	

}
