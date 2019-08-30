public class Carta {
	Naipe naipe;
	Integer valor;
	
	public Carta(Naipe _naipe, Integer _valor) {
		this.naipe = _naipe;
		this.valor = _valor;
	}
	
	public Naipe getNaipe() {
		return naipe;
	}
	public void setNaipe(Naipe naipe) {
		this.naipe = naipe;
	}
	public Integer getValor() {
		return valor;
	}
	public void setValor(Integer valor) {
		this.valor = valor;
	}
}
