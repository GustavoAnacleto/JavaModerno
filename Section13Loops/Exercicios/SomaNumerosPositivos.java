public class SomaNumerosPositivos{

	public static void main(String[] args) {
		
		int num = 10;
		int soma = 0;

		do{	
			System.out.println(soma);
			soma += num;
			num--;	
		}while(num >= 0);
	}
}