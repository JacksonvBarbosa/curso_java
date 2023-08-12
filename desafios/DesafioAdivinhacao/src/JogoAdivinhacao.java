import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

    public static void main(String[] args) {

        int numAleatorio = new Random().nextInt(100);
        int totalTentaiva = 0;
        int tentativaRestante = 5;
        int chute = 0;

        System.out.println("JOGO DA ADIVINHAÇÃO");
        System.out.printf("");

        for (int i = 0; i < 5; i++) {
            Scanner tentativa = new Scanner(System.in);
            System.out.printf("Digite um número de 0 a 100: ");
            chute = tentativa.nextInt();

            if (chute != numAleatorio) {
                if(chute > numAleatorio) {
                    System.out.println("Seu chute foi maior que o número aleatório");
                } else {
                    System.out.println("Seu chute foi menor que o número aleatório");
                }
                tentativaRestante--;
                totalTentaiva++;
                System.out.println(String.format("Você tem mais %d Tentativas ", tentativaRestante));
            } else {
                break;
            }
        }

        if(chute == numAleatorio) {
            System.out.println(String.format("PARABÉNS!!! o número secreto é %d, Você acertou na tentativa número %d ",numAleatorio, totalTentaiva + 1));
        } else {
            System.out.println("Game Over!! Mais sorte na próxima vez");
        }


    }
}
