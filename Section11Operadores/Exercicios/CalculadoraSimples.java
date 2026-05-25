public class CalculadoraSimples{
	public static void main(String[] args){
		Integer a,b;

		a = 10;
		b = 2;

		System.out.println("Soma -> " + (a + b));
		System.out.println("Subtração -> " + (a - b));
		System.out.println("Multiplacação -> "+(a * b));
		System.out.println("Divisão -> " + (double) a / b);
		System.out.println("Resto -> " + (a % b));

	}
}