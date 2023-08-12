import java.util.Scanner;

public class For {

    public static void main(String[] args) {

        Scanner notas = new Scanner(System.in);
        double mediaAvaliacao = 0;

        for (int i = 0; i < 3; i++) {
            System.out.printf("Gostariamos de saber sua avaliação: ");
            mediaAvaliacao += notas.nextDouble();
        }

        System.out.println("A média de avaliação para esse filme foi " + mediaAvaliacao/3);

    }

}
