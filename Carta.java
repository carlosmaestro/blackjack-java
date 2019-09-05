public class Carta {
	
	String naipe;
	Integer valor;
	
	public Carta(String _naipe, Integer _valor) {
		this.naipe = _naipe;
		this.valor = _valor;
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
}
