public class PromocoesAutomaticas{
	public static void main(String[] args) {

		byte a = 10;  
		int b = a + 5; // a é promovido para int antes do cálculo 
		System.out.println("Valor de a= " + a);

		int c = 10;  
		float d = 1.5f;  
		float f = c * d; // a é promovido para float antes do cálculo 
		System.out.println("Valor de f = " + f);

		int g = 10; 
		double h = 1.5;  
		double i = g * h; // a é promovido para double antes do cálculo 
		System.out.println("Valor de i = " + i);
	}
}