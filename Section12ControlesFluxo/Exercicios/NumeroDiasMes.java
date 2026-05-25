import java.util.Scanner;
public class NumeroDiasMes{
	public static void main(String[] args) {
		
		int mes;
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número do mês");
		mes = sc.nextInt();

		switch(mes){
		    case 1,3,5,7,8,10,12  -> System.out.println("O número de dias é 31");
            case 4,6,9,11 -> System.out.println("O número de dias é 30");
            case 2 -> System.out.println("28 ou 29"); 
            default -> System.out.println("Mês inválido");
		}

		sc.close();		
	}
}