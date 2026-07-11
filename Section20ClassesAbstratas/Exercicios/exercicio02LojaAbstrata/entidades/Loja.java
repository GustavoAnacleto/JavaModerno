package entidades;

// Classe abstrata: não pode ser instanciada diretamente (Regra 1)
public abstract class Loja {

    String cnpj;
    String razaoSocial;
    boolean aberta; // Campos definidos na própria classe abstrata (Regra 4)

    // Construtor da classe abstrata (Regra 3): será chamado via super() pelas subclasses
    public Loja(String cnpj, String razaoSocial) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.aberta = false; // Loja começa fechada por padrão
    }

    // Método concreto (Regra 2): controla o estado da loja, já vem pronto
    public void abrir() {
        if (!aberta) {
            aberta = true;
            System.out.println(razaoSocial + " está aberta.");
        } else {
            System.out.println(razaoSocial + " já estava aberta.");
        }
    }

    // Método concreto (Regra 2): controla o estado da loja, já vem pronto
    public void fechar() {
        if (aberta) {
            aberta = false;
            System.out.println(razaoSocial + " está fechada.");
        } else {
            System.out.println(razaoSocial + " já estava fechada.");
        }
    }
}