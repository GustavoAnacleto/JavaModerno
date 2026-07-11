package interfaces;

public interface Produto {

    String getNome();

    int getQuantidade();

    void adicionarQuantidade(int quantidade);

    void removerQuantidade(int quantidade);
}