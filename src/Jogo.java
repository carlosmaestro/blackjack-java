import java.io.IOException;

public class Jogo {

    private Jogador dealer;
    private Jogador[] jogadores = new Jogador[6];
    private Baralho baralho;

    Jogo(int numJogadores) {

        System.out.println("Iniciando com " + numJogadores + " jogadore(s):");
        dealer = new Jogador(0);
        baralho = new Baralho();
        criaJogadores(numJogadores);

//        System.out.println(baralho);
//        baralho.embaralhar(5);
//        System.out.println(baralho);
    }

    public void criaJogadores(int numJogadores) {
        for (int i = 0; i < numJogadores; i++) {
            jogadores[i] = new Jogador(i + 1);
        }
    }

    public Jogador getDealer() {
        return dealer;
    }

    public void setDealer(Jogador dealer) {
        this.dealer = dealer;
    }

    public Baralho getBaralho() {
        return baralho;
    }

    public void setBaralho(Baralho baralho) {
        this.baralho = baralho;
    }
}
