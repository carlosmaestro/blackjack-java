
public class Baralho {
	Carta[] cartas;
	static final Integer totalNumCartas = 52;
	static final CartaValor[] listaCartas = { Tipo.CARTA_AS, Tipo.CARTA_2, Tipo.CARTA_3, Tipo.CARTA_4, Tipo.CARTA_5,
			Tipo.CARTA_6, Tipo.CARTA_7, Tipo.CARTA_8, Tipo.CARTA_9, Tipo.CARTA_10, Tipo.CARTA_Q, Tipo.CARTA_J,
			Tipo.CARTA_K };
	static final String[] listaNaipes = { Tipo.COPAS, Tipo.ESPADAS, Tipo.PAUS, Tipo.OUROS };

	public Baralho() {
		this.cartas = this.gerarBaralho();
	}

	private Carta[] gerarBaralho() {
		Carta[] _listaCartas = new Carta[totalNumCartas];
		
		int countCartas = 0;
		for (String naipe : listaNaipes) {
			System.out.println(naipe);
			for (CartaValor carta : listaCartas) {
				_listaCartas[countCartas] = new Carta(naipe, carta.simbolo, carta.valor);
				System.out.println(carta.simbolo);
				countCartas++;
			}
			System.out.println(countCartas);
		}

		return _listaCartas;
	}
}
