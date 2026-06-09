package entidades;

public class Personagem {

    private String nome;
    private int nivelPoder;

    public Personagem(String nomeInit, int nivelPoderInit) {
        nome = nomeInit;
        nivelPoder = nivelPoderInit;
    }

    public Personagem() {
    }

    public void tentarAumentarNivelPoder(int poder) {
        poder += 10;
    }

    public void mudarNome(Personagem personagem, String novoNome) {
        personagem.nome = novoNome;
    }

    public void aumentarNivelPoder(int quantidade) {
        nivelPoder += quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getNivelPoder() {
        return nivelPoder;
    }
}