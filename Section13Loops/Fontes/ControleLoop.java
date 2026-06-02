public class ControleLoop{
	public static void main(String[] args) {
	
		for(int i = 0; i < 10; i++){

			if(i==5){
				break; // Sai do loop quando i é igual a 5
			}

			System.out.println(i);
		}

		System.out.println("___________________________________________________");
		System.out.println("___________________________________________________");
		System.out.println("  ");

		for (int j = 0; j < 10; j++){
			if(j == 5){
				continue; // Pula a iteração quando j é igual a 5
			}

			System.out.println(j);
		}	
	}
}