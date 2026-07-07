import entidades.Pessoa;
import entidades.Estudante;

public class Aplicacao{
	public static void main(String[] args) {
		
		Estudante aluno = new Estudante("Gustavo", 38, 41044);

		System.out.println("Nome: " + aluno.getNome());
		System.out.println("Idade: " + aluno.getIdade());
		System.out.println("Matricula: " + aluno.getMatricula());
	}
}