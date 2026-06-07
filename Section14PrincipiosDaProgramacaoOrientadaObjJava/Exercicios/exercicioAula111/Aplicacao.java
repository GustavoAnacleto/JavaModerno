import entidades.Produto;

public class Aplicacao{
	public static void main(String[] args) {
		Produto prod = new Produto("Mouse Gamer", 150.00, 10);

		System.out.println(prod.obterInfo());

		prod.aplicarDesconto(20.00);
		System.out.println(prod.obterInfo());

		prod.aplicarDesconto(10);
		System.out.println(prod.obterInfo());

		prod.aplicarDesconto(5, 2);
		System.out.println(prod.obterInfo());


	}
}