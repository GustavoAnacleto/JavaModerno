public class MainAula107{
	public static void main(String[] args) {
		ProdutoAula107 produtoA = new ProdutoAula107();

		produtoA.setNome("Detergente Ypê");
		produtoA.setPreco(2.89);
		produtoA.setQuantidadeEstoque(12);


		System.out.println("Produto: " + produtoA.getNome());
		System.out.println("Preço: "+ produtoA.getPreco());
		System.out.println("Quantidade em Estoque: " + produtoA.getQuantidadeEstoque());
	}
}