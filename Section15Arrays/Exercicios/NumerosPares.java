public class NumerosPares {
	public static void main(String[] args) {
	
		int tamanho = 4;
		int[] meuArray = new int[tamanho];
		
		meuArray[0] = 2;
		meuArray[1] = 4;
		meuArray[2] = 6;
		meuArray[3] = 8;
		
		for (int i = 0; i < meuArray.length; i++) {

			System.out.print(meuArray[i] + " ");
		}
	}

}