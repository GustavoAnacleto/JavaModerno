package entidades;

public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nomeInit, double precoInit, int quantidadeEmEstoqueInit) {
        nome                = nomeInit;
        preco               = precoInit;
        quantidadeEmEstoque = quantidadeEmEstoqueInit;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void exibirInfo() {
        System.out.println("Produto: "               + nome);
        System.out.println("Preço: "                 + preco);
        System.out.println("Quantidade em Estoque: " + quantidadeEmEstoque);
    }
}