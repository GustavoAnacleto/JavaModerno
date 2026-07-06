public class Arrays{
	
	public static void main(String[] args) {
		
		int [] meuArray; //declaração de arrays

		/*meuArray = new int[3]; //criação do array 

		meuArray[0] = 5;
		meuArray[1] = 8;
		meuArray[2] = 2;*/

		meuArray = new int[]{5,8,2}; // cria e preenche i array com valores 

		System.out.println(meuArray[0]);
		System.out.println(meuArray[1]);
		System.out.println(meuArray[2]);

		// Alterando Elementos do Array

		meuArray[0] = 10;

		System.out.println("Valor alterado: " + meuArray[0]);


		// Percorrendo Arrays

		for( int i = 0; i < meuArray.length; i++){

			System.out.println(meuArray[i]);
		}

	}
}