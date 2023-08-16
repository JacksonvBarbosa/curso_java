package br.com.alura.screenmatch.modelos;

//Defini a estrura que quero exibir na tela
public record TituloOmdb(String title, String year, String runtime) {
}
/*Essa classe foi inserida com Record que é imutavel
* não tenho interesse de ficar modificando a mesma e
* só criar um cabeçalho nesse caso do Titulo*/