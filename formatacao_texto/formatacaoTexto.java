public class formatacaoTexto {
    public static void main(String[] args) {
        String nome = "Jackson";
        byte idade = 39;
        double valor = 55.9999;

        String nome1 = "Jose";
        int aulas = 4;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais comprando um jogo!", nome, idade, valor));

        String mensagem = """
                            Olá, %s!
                            Boas vindas ao curso de Java.
                            teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                """.formatted(nome1, aulas);
        System.out.println(mensagem);
    }
}
