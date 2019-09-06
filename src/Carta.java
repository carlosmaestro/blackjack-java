public class Carta {

	String naipe;
	String simbolo;
	Integer valor;

	public Carta(String naipe, String simbolo, Integer valor) {
		this.naipe = naipe;
		this.valor = valor;
		this.simbolo = simbolo;
	}

	public String getNaipe() {
		return naipe;
	}

	public void setNaipe(String naipe) {
		this.naipe = naipe;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public String getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}
	
}
