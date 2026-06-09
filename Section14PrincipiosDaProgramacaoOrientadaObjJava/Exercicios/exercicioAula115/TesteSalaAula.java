import entidades.SalaAula;

public class TesteSalaAula{
	public static void main(String[] args) {
		SalaAula a1 = new SalaAula();
		SalaAula a2 = new SalaAula();
		SalaAula a3 = new SalaAula();

		SalaAula.adicionarAluno();
		SalaAula.exibirInfo();

		SalaAula.adicionarAluno();
		SalaAula.exibirInfo();

		SalaAula.adicionarAluno();
		SalaAula.exibirInfo();

		SalaAula.exibirInfo();


	}
}