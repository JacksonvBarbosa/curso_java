import java.util.Scanner;

public class While {

    public static void main(String[] args) {

        Scanner notas = new Scanner(System.in);
        double mediaavaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;


        while (nota != -1) {
            System.out.printf("Gostariamos de saber sua avaliação ou -1 para encerrar: ");
            nota = notas.nextDouble();

            if (nota != -1) {
                mediaavaliacao += nota;
                totalDeNotas ++;
            } else if(totalDeNotas ==  0){
                System.out.println("Você não deu sua avaliação para esse filme");
            } else {
                System.out.println("Obrigado por sua avaliação");
            }
        }

        if(totalDeNotas != 0) {
            String texto = """
                    Foram feitas %d avaliações para o filme selecionado,
                    E sua média de avaliação foi de %.2f.
                    """.formatted(totalDeNotas, mediaavaliacao / totalDeNotas);

            System.out.println(texto);
        }
    }

}
