
public class Jogador {
    String nome;
    Carta[] mao;
    Integer numCards;
    Boolean parou;

    Jogador(int order) {
        nome = "Jogador " + order;
        numCards = 0;
        mao = new Carta[12];
        parou = false;
    }

    public Integer[] getPontuacao() {
        Integer[] pontuacao = new Integer[]{0, 0};

        for (Carta carta : mao) {
            if (carta == null) {
                break;
            }
            pontuacao[0] += carta.valor;
            pontuacao[1] += carta.naipe.equals(Tipo.CARTA_AS) ? 11 : carta.valor;
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

    public void showMao() {
        System.out.println("Mão:");
        for (Carta itemCarta : mao) {
            if (itemCarta != null) {
                System.out.printf("[%d de %s], ", itemCarta.valor, itemCarta.naipe);
            }
        }
        System.out.println("");
    }

    public void showPontuacao() {
        System.out.println("Pontuação:");
        System.out.println(getPontuacao()[0] == getPontuacao()[1] ? "[" + getPontuacao()[0] + "]" : "[" + getPontuacao()[0] + "] ou [" + getPontuacao()[1] + "]");
    }

    public void showPontuacaoFinal() {
        printLine();
        System.out.println("Pontuação final: " + nome);
        showMao();
        showPontuacao();
        printLine();
    }

    public void printLine() {
        System.out.println("------------------------------------------------ ");
    }


    public void setMao(Carta[] mao) {
        this.mao = mao;
    }


}
