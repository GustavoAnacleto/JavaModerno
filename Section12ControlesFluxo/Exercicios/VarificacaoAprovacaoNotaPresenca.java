import java.util.Scanner;

public class VarificacaoAprovacaoNotaPresenca{
	public static void main(String[] args) {
		double nota1, nota2,presenca, result;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a primeira nota: ");
		nota1 = sc.nextDouble();
		System.out.println("Digite a segunda nota: ");
		nota2 = sc.nextDouble();
		System.out.println("Digite a percentual de presença: ");
		presenca = sc.nextInt();

		result = (nota1 + nota2) / 2;

		if(result >= 7.0 && presenca >= 75){
			System.out.println("Aprovado.");
		}else{
			System.out.println("Reprovado.");
		}
		sc.close();

	}
}