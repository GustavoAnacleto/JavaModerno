import entidades.Produto;

public class Aplicacao{
	public static void main(String[] args) {
		Produto produto = new Produto("Notebook", 3000.00);

		System.out.println(produto.obterInfo());

		produto.aplicarDesconto(700.00);

		System.out.println(produto.obterInfo());
	}
}