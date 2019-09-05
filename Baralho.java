
public class Baralho {
	Carta[] cartas;
	static final Integer totalNumCartas = 52;
	static final String[] listaCartas = { Tipo.CARTA_AS, Tipo.CARTA_2, Tipo.CARTA_3, Tipo.CARTA_4, Tipo.CARTA_5,
			Tipo.CARTA_6, Tipo.CARTA_7, Tipo.CARTA_8, Tipo.CARTA_9, Tipo.CARTA_10, Tipo.CARTA_Q, Tipo.CARTA_J,
			Tipo.CARTA_K };
	static final String[] listaNaipes = { Tipo.COPAS, Tipo.ESPADAS, Tipo.PAUS, Tipo.OUROS };

	public Baralho() {

	}
	
	private String[] gerarBaralho() {
		Carta[] _listaCartas = new Carta[totalNumCartas];
		for (String naipe: listaNaipes) {
			for (String carta: listaCartas) {
				_listaCartas
			}
		}
		
		return Baralho.listaCartas;
	}
}
