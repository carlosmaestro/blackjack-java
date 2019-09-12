
public class Jogador {
    String nome;
    Carta[] mao;
    Integer numCards;

    Jogador(int order) {
        nome = "Jogador " + order;
        numCards = 0;
        mao = new Carta[12];
    }

    public Integer[] getPontuacao() {
        Integer[] pontuacao = new Integer[]{0, 0};

        for (Carta carta : mao) {
            if (carta == null) {
                break;
            }
            pontuacao[0] += carta.valor;
            pontuacao[1] += carta.naipe.equals(Tipo.CARTA_AS) ? 11: carta.valor ;
        }
        return pontuacao;
    }

    public void addCarta(Carta carta) {
        this.mao[numCards++] = carta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Carta[] getMao() {
        return mao;
    }

    public void setMao(Carta[] mao) {
        this.mao = mao;
    }


}
