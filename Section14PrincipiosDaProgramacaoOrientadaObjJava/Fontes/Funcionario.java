public class Funcionario {

    // -------------------------------------------------------
    // VARIÁVEIS DE INSTÂNCIA (atributos da classe)
    // Ficam fora de qualquer método.
    // Cada objeto Funcionario terá seus próprios valores aqui.
    // -------------------------------------------------------
    String nome;
    String cargo;
    int idade;

    // -------------------------------------------------------
    // CONSTRUTOR COM PARÂMETROS
    // Tem o mesmo nome da classe: Funcionario
    // É chamado automaticamente quando usamos:
    // new Funcionario("João", "Desenvolvedor", 30)
    // Recebe os dados e já preenche os atributos do objeto.
    // -------------------------------------------------------
    Funcionario(String nomeInit, String cargoInit, int idadeInit) {
        nome  = nomeInit;   // atributo nome  recebe o valor passado
        cargo = cargoInit;  // atributo cargo recebe o valor passado
        idade = idadeInit;  // atributo idade recebe o valor passado
    }

    // -------------------------------------------------------
    // CONSTRUTOR VAZIO (sem parâmetros)
    // Necessário para criar o objeto sem passar dados.
    // Usado para o funcionario2 (Maria) abaixo.
    // Quando não declaramos NENHUM construtor, o Java cria
    // esse construtor vazio automaticamente e de forma invisível.
    // Porém, assim que declaramos qualquer construtor com
    // parâmetros (como o de cima), o Java PARA de criar o
    // construtor vazio automaticamente. Por isso precisamos
    // declará-lo explicitamente aqui.
    // -------------------------------------------------------
    Funcionario() {
        // sem inicialização: atributos ficam com valor padrão
        // String → null
        // int    → 0
    }

    public static void main(String[] args) {

        // -------------------------------------------------------
        // FUNCIONÁRIO 1 — JOÃO
        // Criado COM construtor com parâmetros.
        // Os dados são passados direto no new, de forma concisa.
        // O construtor recebe "João", "Desenvolvedor", 30
        // e preenche os atributos automaticamente.
        // -------------------------------------------------------
        Funcionario funcionario1 = new Funcionario("João", "Desenvolvedor", 30);


        // -------------------------------------------------------
        // FUNCIONÁRIO 2 — MARIA
        // Criado SEM construtor com parâmetros (construtor vazio).
        // O objeto é criado "em branco" e os atributos são
        // preenchidos manualmente linha por linha, usando
        // o operador ponto (objeto.atributo = valor).
        // -------------------------------------------------------
        Funcionario funcionario2 = new Funcionario(); // objeto criado vazio
        funcionario2.nome  = "Maria";       // preenchendo atributo por atributo
        funcionario2.cargo = "Gerente";
        funcionario2.idade = 50;


        // -------------------------------------------------------
        // IMPRESSÃO — FUNCIONÁRIO 1 (João)
        // Acessa os atributos usando: objeto.atributo
        // -------------------------------------------------------
        System.out.println("Nome: "  + funcionario1.nome);
        System.out.println("Cargo: " + funcionario1.cargo);
        System.out.println("Idade: " + funcionario1.idade);

        System.out.println("------------------------------");

        // -------------------------------------------------------
        // IMPRESSÃO — FUNCIONÁRIO 2 (Maria)
        // Mesma forma de acesso, objeto diferente, valores diferentes.
        // Isso demonstra o conceito de REUSO:
        // a mesma classe serviu para criar dois funcionários distintos.
        // -------------------------------------------------------
        System.out.println("Nome: "  + funcionario2.nome);
        System.out.println("Cargo: " + funcionario2.cargo);
        System.out.println("Idade: " + funcionario2.idade);
    }
}