import entidades.Produto;

public class Main {

    public static void main(String[] args) {

        Produto produtoA = new Produto("Detergente Ypê", 2.89, 12);
        produtoA.exibirInfo();

        System.out.println("---");

        Produto produtoB = new Produto("Sabão em Pó", 8.49, 30);
        produtoB.exibirInfo();
    }
}