public class switchCase {

    public static void main(String[] args) {
        int dia = 4;
        String nomeDia;

        switch (dia) {
            case 1:
                nomeDia = "Domingo";
                break;
            case 2:
                nomeDia = "Segunda-Feira";
                break;
            case 3:
                nomeDia = "Terça-Feira";
                break;
            case 4:
                nomeDia = "Quarta-Feira";
                break;
            case 5:
                nomeDia = "Quinta-Feira";
                break;
            case 6:
                nomeDia = "Sexta-Feira";
                break;
            case 7:
                nomeDia = "Sabado";
                break;
            default:
                nomeDia = "Dia Invalido";
                break;
        }
        System.out.println("O dia " + dia + " é " + nomeDia);
    }

}
