package entidades;

public class Livro{

	public String titulo;
	private String autor;
	protected int anoPublicacao;
	double preco;

	public Livro(){
		titulo = "Desconhecido";
		autor = "Desconhecido";
		anoPublicacao = 0;
		preco = 0d;
	}

	public Livro(String tituloInit, String autorInit){

		titulo = tituloInit;
		autor = autorInit;
		anoPublicacao = 0;
		preco = 0d;
	}

	public Livro(String tituloInit, String autorInit, int anoPublicacaoInit, double precoInit){

		titulo = tituloInit;
		autor = autorInit;
		anoPublicacao = anoPublicacaoInit;
		preco = precoInit;
	}

	public void exibirInfo(){

		System.out.println("Titulo: " + titulo + "\nAutor: " + autor + "\nAno Publicação: "
							+ anoPublicacao + "\nPreço: " + preco + "\n\n");
	}
}