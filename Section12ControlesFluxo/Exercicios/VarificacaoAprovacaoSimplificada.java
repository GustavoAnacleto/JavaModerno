import java.util.Scanner;

public class VarificacaoAprovacaoSimplificada{
	public static void main(String[] args) {
		double nota1, nota2, result;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a primeira nota: ");
		nota1 = sc.nextDouble();
		System.out.println("Digite a segunda nota: ");
		nota2 = sc.nextDouble();

		result = (nota1 + nota2) / 2;

		if(result >= 6.0){
			System.out.println("Aprovado.");
		}else{
			System.out.println("Reprovado.");
		}
		sc.close();

	}
}