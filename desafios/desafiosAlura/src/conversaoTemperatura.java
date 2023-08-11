public class conversaoTemperatura {

    public static void main(String[] args) {

        double celsius = 32;
        double fahrenheit = (celsius * 1.8) + 32;

        String temperatura = """
                    Hoje a temperatura está em %.2f Celsius
                    olhando em Fahrenheit ela está em %.2fF
                """.formatted(celsius, fahrenheit);
        System.out.println(temperatura);

        int simplificarFahrenheit = (int) (fahrenheit);

        String fahrenheitSimplificado = """
                Fiz a simplificação do resultado em Fahrenheit, 
                tirando as casas decimais e mantendo só o valor inteiro e ficou assim:
                Fahrenheit = %dF simplificado
                """.formatted(simplificarFahrenheit);
        System.out.println(fahrenheitSimplificado);

    }

}
