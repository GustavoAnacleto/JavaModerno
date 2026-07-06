public class NotasAlunos{
	
	public static void main(String[] args) {
	
		int tamanho = 5;	
		double[] notas = new double[tamanho];

		notas[0] = 5.5;
		notas[1] = 6;
		notas[2] = 6.3;
		notas[3] = 7.5;
		notas[4] = 9.8;

		for(double elemento : notas){

			System.out.printf(elemento + ", ");
		}

	}
}