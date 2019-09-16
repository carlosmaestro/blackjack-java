import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Baralho {
    Carta[] cartas;
    Integer indexAtual;
    static final Integer totalNumCartas = 52;
    static final CartaValor[] listaCartas = {Tipo.CARTA_AS, Tipo.CARTA_2, Tipo.CARTA_3, Tipo.CARTA_4, Tipo.CARTA_5,
            Tipo.CARTA_6, Tipo.CARTA_7, Tipo.CARTA_8, Tipo.CARTA_9, Tipo.CARTA_10, Tipo.CARTA_Q, Tipo.CARTA_J,
            Tipo.CARTA_K};
    static final String[] listaNaipes = {Tipo.COPAS, Tipo.ESPADAS, Tipo.PAUS, Tipo.OUROS};

    public Baralho() {
        this.cartas = this.gerarBaralho();
        indexAtual = 0;
    }

    private Carta[] gerarBaralho() {
        Carta[] _listaCartas = new Carta[totalNumCartas];

        int countCartas = 0;
        for (String naipe : listaNaipes) {
//			System.out.println(naipe);
            for (CartaValor carta : listaCartas) {
                _listaCartas[countCartas] = new Carta(naipe, carta.simbolo, carta.valor);
//				System.out.println(carta.simbolo);
                countCartas++;
            }
            // System.out.println(countCartas);
        }

        return _listaCartas;
    }

    public void embaralhar(int vezes) {
        Random r = new Random();
        Carta cAux;
        for (int j = 0; j < vezes; j++) {
            for (int i = 0; i < cartas.length; i++) {
                int c = r.nextInt(cartas.length);
                cAux = cartas[c];
                cartas[c] = cartas[i];
                cartas[i] = cAux;
            }
        }
    }

    public Carta getNext() {
        if (indexAtual >= totalNumCartas) {
            return null;
        }
        return cartas[indexAtual++];
    }

    public String toString() {
        StringBuilder repr = new StringBuilder();
        for (Carta c : cartas) {
            repr.append(c.simbolo + " - " + c.naipe + ",");
        }
        return repr.toString();
    }
}
