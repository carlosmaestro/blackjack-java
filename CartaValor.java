
public class CartaValor {
	String simbolo;
	Integer valor;
	
	public CartaValor(String simbolo, Integer valor) {
		this.simbolo = simbolo;
		this.valor = valor;
	}

	public String getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}
}
