package entidades;

public class SalaAula{

	private static int totalAlunos = 0;

	public static void adicionarAluno() {
	    totalAlunos++;
	}

	public static void exibirInfo() {
		System.out.println("Número de alunos: " + totalAlunos);
	}




}