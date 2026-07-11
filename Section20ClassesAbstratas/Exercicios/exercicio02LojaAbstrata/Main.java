import entidades.*;

public class Main {
    public static void main(String[] args) {

        LojaComercial loja = new LojaComercial("12.345.678/0001-90", "Loja Comercial LTDA");

        loja.abrir();
        loja.fechar();
        loja.abrir();
    }
}