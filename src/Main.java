
public class Main {

	public static void main(String[] args) {

		Baralho baralho = new Baralho();

		for (Carta carta : baralho.cartas) {
			System.out.println(carta.naipe + " - " + carta.simbolo + " - " + carta.valor);
		}
	}

}