import java.util.Scanner;

public class DiasNoMesComNome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do mês: ");
        String mes = sc.nextLine().toUpperCase(); // transforma tudo em maiúsculo

        int numeroDeDias = switch (mes) {
            case "JANEIRO", "MARÇO", "MAIO", "JULHO", "AGOSTO",
                 "OUTUBRO", "DEZEMBRO" -> 31;
            case "ABRIL", "JUNHO", "SETEMBRO", "NOVEMBRO" -> 30;
            case "FEVEREIRO" -> 28;
            default -> -1;
        };

        if (numeroDeDias != -1) {
            System.out.println("Número de dias em " + mes + ": " + numeroDeDias);
        } else {
            System.out.println("Mês desconhecido: \"" + mes + "\"");
        }

        sc.close();
    }
}