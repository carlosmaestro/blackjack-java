import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numJogarores;
        Scanner scanner = new Scanner(System.in);

        numJogarores = perguntaNumeroJogadores(scanner);
        Jogo jogo = new Jogo(numJogarores);
    }

    public static int perguntaNumeroJogadores(Scanner scanner) {
        int num = 1;
        boolean continuePerguntando = true;
        while (continuePerguntando) {
            System.out.println("Informe o número de jogadores(1 a 6):");
            try {
                num = scanner.nextInt();
                scanner.nextLine();
                if (num >= 1 && num <= 6) {
                    continuePerguntando = false;
                } else {
                    System.out.println("Informe um valor entre 1 e 6.");
                }
            } catch (Exception e) {
                System.out.println("Valor informado inesperado.");
                scanner.nextLine();
            }
        }

        return num;
    }

}
