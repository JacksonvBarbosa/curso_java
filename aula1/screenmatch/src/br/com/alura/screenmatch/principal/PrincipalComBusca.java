package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        //Buscar dados
        Scanner leitura = new Scanner(System.in);
        String busca = "";
        List<Titulo> titulos = new ArrayList<>();

        //Com o GsonBuilder() cria um padrão de nome de construção
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        //equalsIgnoreCase - não distingue se é a palavra está em maiúsculo ou minúsculo
        while(! busca.equalsIgnoreCase("sair")){
            System.out.println("Digite um filme para busca: ");
            busca = leitura.nextLine();

            if(busca.equalsIgnoreCase("sair")){
                break;
            }

            String endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=c17bec12";

            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);

                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(meuTituloOmdb);//Serve para tranferirs dados
                /*Condição de se acontecer um erro ele tenta mostrar o resultado
                 * e ainda traz com o catch o erro que acorreu e o programa continua executando*/
                //try{
                //Roda a busca até onde estiver o erro erro
                Titulo meuTitulo = new Titulo(meuTituloOmdb);//Titulo personalizado
                System.out.println("Titulo já convertido");
                System.out.println(meuTitulo);

                titulos.add(meuTitulo);
            } catch(NumberFormatException e) {
                //Caso aconteça um erro é apresentado na tela
                System.out.println("Aconteceu um erro: ");
                System.out.println(e.getMessage());
            } catch(IllegalArgumentException e) {
                System.out.println("Algum erro de argumento na busca, verifique o endereço!");
            }catch(ErroDeConversaoDeAnoException e) {
                System.out.println(e.getMessage());
            }

        /*finally {
            //Fecha um bloco try muito, utilizado para limpar recursos, fechar conexões com banco de dados etc
        }*/
        }

        System.out.println(titulos);

        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();
        System.out.println("O programa finalizou corretamente!");




    }
}
