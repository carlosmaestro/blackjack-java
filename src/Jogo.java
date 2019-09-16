import java.io.IOException;
import java.util.Scanner;

public class Jogo {

    private Jogador dealer;
    private Jogador[] jogadores = new Jogador[6];
    private Baralho baralho;
    private Scanner scanner;

    Jogo(int numJogadores) {
        scanner = new Scanner(System.in);
        System.out.println("Iniciando com " + numJogadores + " jogadore(s):");
        dealer = new Jogador(0);
        baralho = new Baralho();
        criaJogadores(numJogadores);

        baralho.embaralhar(5);


        for (Jogador itemJogador : jogadores) {
            if (itemJogador == null) {
                break;
            }
            startRodada(itemJogador);
        }
    }

    public void criaJogadores(int numJogadores) {
        for (int i = 0; i < numJogadores; i++) {
            jogadores[i] = new Jogador(i + 1);
        }
    }

    public void startRodada(Jogador itemJogador) {
        getCartasIniciais(itemJogador);
        while (!itemJogador.parou && itemJogador.getPontuacao()[0] < 21 && itemJogador.getPontuacao()[1] != 21) {
            System.out.printf("Vez: %s\n", itemJogador.nome);
            itemJogador.showMao();
            itemJogador.showPontuacao();
            Boolean respostaJogador = null;
            String entrada;
            while (respostaJogador == null){
                System.out.println(" Mais uma carta? Sim[s], Não[n]");
                entrada = scanner.next();

                if(entrada.toLowerCase().equals("s")){
                    respostaJogador = true;
                }else if(entrada.toLowerCase().equals("n")){
                    respostaJogador = false;
                }else{
                    System.out.println("Entrada desconhecida, tente novamente");
                }
            }

            if(respostaJogador){
                itemJogador.addCarta(baralho.getNext());
            }else{
                itemJogador.parou = true;
                System.out.println("Jogada finalizada.");
            }
        }
        itemJogador.showPontuacaoFinal();
    }




    public void getCartasIniciais(Jogador itemJogador) {
        for (int i = 0; i < 2; i++) {
            itemJogador.addCarta(baralho.getNext());
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
