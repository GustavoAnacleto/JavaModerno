import entidades.Livro;

public class Aplicacao{
	public static void main(String[] args) {

		Livro livroA = new Livro();
		Livro livroB = new Livro("Gargamel", "Mauro Aguilari");
		Livro livroC = new Livro("Carta Branca", "Maria Teresa", 1988, 1.50);

		livroA.exibirInfo();

		livroB.exibirInfo();

		livroC.exibirInfo();

	}
}