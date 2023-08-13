
public class Main {
    public static void main(String[] args) {

        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1d;

        /*Média calculadas pelas 3 notas inseridas*/
        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println(media);
        String sinopse;
sinopse = """
            Top Gun 
            Filme de aventura Estrelado por Tom Cruise
            Ano de lançamento
        """ + anoDeLancamento; //Formatado com Text Blocks
        System.out.println(sinopse);

        int classificacao;
        classificacao = (int) (media /2);
        System.out.println(classificacao);

        int classificacao1 = (int) (media /2);
        System.out.println(classificacao1);
    }
}