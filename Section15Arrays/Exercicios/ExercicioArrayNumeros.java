public class ExercicioArrayNumeros{

	public static void main(String[] args) {

		int [] meuArray = new int[]{10,20,30,40,50};

		System.out.println("primeiro valor: " + meuArray[0]);

		System.out.println("ultimo valor: " + meuArray[meuArray.length - 1]);

		meuArray[2] = 99;

		for(int elemento : meuArray){
			System.out.println(elemento);
		}
		
	}
}