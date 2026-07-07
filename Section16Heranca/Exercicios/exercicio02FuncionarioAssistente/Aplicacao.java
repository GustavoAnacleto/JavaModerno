public class Aplicacao {

    public static void main(String[] args) {
        Assistente assistente = new Assistente();

        assistente.setNome("João");
        assistente.setSalario(3000);
        assistente.addAumento(500);

        System.out.println("Nome: " + assistente.getNome());
        System.out.println("Salário anual: R$ " + assistente.ganhoAnual());
    }
}