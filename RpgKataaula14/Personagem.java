package RpgKataaula14;

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
	
	public void Atacar(Personagem p, int dano) throws Exception {
		 if (dano <= 0) {
			 throw new Exception("Valor negativo");
		 }
		
		if (this ==p) {
			int novoDano = dano;
			if( (p.getNivel() - nivel) > 5 ) {
				novoDano = novoDano / 2;
			}else if (nivel - p.getNivel() < 5 ) {
				novoDano = (int) (novoDano * 1.5);
	
			}
			int novaSaude = p.getSaude() - novoDano;
			if (novaSaude <= 0) {
				p.setSaude(0);
				p.setVivo(false);
			} else {
				p.setSaude(novaSaude);
			}
		}
	}
	
	public void Curar (Personagem p, int cura) throws Exception {
			 if (cura <= 0) {
				 throw (new Exception("Valor negativo"));
			 }
		
		if(this !=p) {
			System.out.println("Persoagem só pode curar a si mesmo");
			return;
		}
		if (p.isVivo()) {
			int novaCura = p.getSaude() + cura;
				if (novaCura > 1000) {
					System.out.println("Nível de cura não permitido");
					p.setSaude(1000);
			 		} else {
					p.setSaude(novaCura);
				}
		}
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

