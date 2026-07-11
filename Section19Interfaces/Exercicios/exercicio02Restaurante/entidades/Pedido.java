package entidades;

import interfaces.PedidoRestaurante;

public class Pedido implements PedidoRestaurante {

    private String[] itens;
    private double[] precos;
    private int quantidadeItens;

    public Pedido(int capacidadeMaxima) {
        this.itens = new String[capacidadeMaxima];
        this.precos = new double[capacidadeMaxima];
        this.quantidadeItens = 0;
    }

    @Override
    public void adicionarItem(String item, double preco) {
        itens[quantidadeItens] = item;
        precos[quantidadeItens] = preco;
        quantidadeItens++;
        System.out.println("Item adicionado: " + item + " - Preço: " + preco);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < quantidadeItens; i++) {
            total += precos[i];
        }
        return total;
    }

}