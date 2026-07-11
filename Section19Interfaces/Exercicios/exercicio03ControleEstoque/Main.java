import entidades.ProdutoImpl;
import interfaces.Produto;

public class Main {

    public static void main(String[] args) {

        Produto produto = new ProdutoImpl("Arroz", 50);

        System.out.println("Produto: " + produto.getNome());
        System.out.println("Quantidade inicial: " + produto.getQuantidade());

        produto.adicionarQuantidade(20);
        System.out.println("Após adicionar 20: " + produto.getQuantidade());

        produto.removerQuantidade(15);
        System.out.println("Após remover 15: " + produto.getQuantidade());

        produto.removerQuantidade(80);
        System.out.println("Quantidade final: " + produto.getQuantidade());
    }
}