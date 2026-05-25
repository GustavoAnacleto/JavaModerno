import java.util.Scanner;

public class VericadorMes{
	public static void main(String[] args) {
		
		int mes;
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número do mês");
		mes = sc.nextInt();

		switch(mes){
		    case 1 -> System.out.println("Janeiro");
            case 2 -> System.out.println("Fevereiro");
            case 3 -> System.out.println("Março"); 
            case 4 -> System.out.println("Abril");
            case 5 -> System.out.println("Maio");
            case 6 -> System.out.println("Junho");
            case 7 -> System.out.println("Julho");
            case 8 -> System.out.println("Agosto"); 
            case 9 -> System.out.println("Setembro");
            case 10 -> System.out.println("Outubro");
            case 11 -> System.out.println("Novembro");
            case 12 -> System.out.println("Dezembro");
            default -> System.out.println("Mês inválido");
		}

		sc.close();		
	}
}