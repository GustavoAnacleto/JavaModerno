public class ControlesDeFluxo {
    public static void main(String[] args) {

        /*
         * =====================================================
         * SEÇÃO 1: if-else
         * =====================================================
         * O if-else é a estrutura condicional mais básica do Java.
         * Ele avalia uma condição booleana (true ou false) e
         * executa um bloco de código dependendo do resultado.
         *
         * Sintaxe:
         *   if (condição) {
         *       // executa se a condição for true
         *   } else {
         *       // executa se a condição for false
         *   }
         */

        System.out.println("========== IF-ELSE ==========");

        int idade = 18;

        if (idade >= 18) {
            System.out.println("Maior de idade"); // condição true
        } else {
            System.out.println("Menor de idade"); // condição false
        }

        // Podemos encadear múltiplas condições com else if
        int nota = 75;

        if (nota >= 90) {
            System.out.println("Conceito A");
        } else if (nota >= 70) {
            System.out.println("Conceito B"); // esse bloco será executado
        } else if (nota >= 50) {
            System.out.println("Conceito C");
        } else {
            System.out.println("Reprovado");
        }

        /*
         * =====================================================
         * SEÇÃO 2: instanceof
         * =====================================================
         * O operador instanceof verifica se um objeto é uma
         * instância de determinada classe ou tipo.
         *
         * É muito útil quando trabalhamos com objetos genéricos
         * (tipo Object) e precisamos saber com qual tipo estamos
         * lidando antes de realizar alguma operação.
         *
         * Sintaxe:
         *   objeto instanceof NomeDaClasse
         *   Retorna: true ou false
         */

        System.out.println("\n========== INSTANCEOF ==========");

        Object texto = "Olá, Java!";
        Object numero = 42;

        // Verifica se 'texto' é uma instância de String
        if (texto instanceof String) {
            System.out.println("'texto' é uma String: " + texto);
        }

        // Verifica se 'numero' é uma instância de Integer
        if (numero instanceof Integer) {
            System.out.println("'numero' é um Integer: " + numero);
        }

        // Exemplo onde a condição será false
        if (numero instanceof String) {
            System.out.println("Isso não será impresso");
        } else {
            System.out.println("'numero' NÃO é uma String");
        }

        /*
         * =====================================================
         * SEÇÃO 3: switch (sintaxe moderna - Java 14+)
         * =====================================================
         * O switch é uma alternativa ao if-else quando precisamos
         * comparar uma variável com vários valores possíveis.
         * É mais legível e eficiente nesse cenário.
         *
         * Na sintaxe moderna (arrow ->), não precisamos do break.
         * Cada case executa apenas seu próprio bloco e para
         * automaticamente.
         *
         * Sintaxe:
         *   switch (variavel) {
         *       case valor1 -> instrução;
         *       case valor2 -> instrução;
         *       default    -> instrução; // executado se nenhum case bater
         *   }
         */

        System.out.println("\n========== SWITCH MODERNO ==========");

        // Exemplo 1: switch com int
        int diaDaSemana = 3;

        switch (diaDaSemana) {
            case 1 -> System.out.println("Segunda-feira");
            case 2 -> System.out.println("Terça-feira");
            case 3 -> System.out.println("Quarta-feira"); // será executado
            case 4 -> System.out.println("Quinta-feira");
            case 5 -> System.out.println("Sexta-feira");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Dia inválido");
        }

        // Exemplo 2: switch como expressão (retorna um valor)
        // Podemos usar vários valores no mesmo case separados por vírgula
        String dia = "Ter.";

        String tipoDeDia = switch (dia) {
            case "Seg.", "Ter.", "Qua.", "Qui.", "Sex." -> "Dia útil";
            case "Sáb.", "Dom."                        -> "Fim de semana";
            default                                    -> "Desconhecido";
        };

        System.out.println(dia + " é: " + tipoDeDia);

        /*
         * =====================================================
         * SEÇÃO 4: switch (sintaxe clássica - versões antigas)
         * =====================================================
         * Antes do Java 14, o switch usava uma sintaxe diferente.
         * Cada case precisava de um break para evitar o "fall-through"
         * (o código continuaria executando os próximos cases sem parar).
         *
         * Restrições da sintaxe clássica:
         * - Apenas int, char e (a partir do Java 7) String são aceitos
         * - Precisa de break em cada case
         * - Não pode ser usado como expressão (não retorna valor)
         *
         * Sintaxe:
         *   switch (variavel) {
         *       case valor1:
         *           instrução;
         *           break;
         *       default:
         *           instrução;
         *           break;
         *   }
         */

        System.out.println("\n========== SWITCH CLÁSSICO ==========");

        int mes = 4;

        switch (mes) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril"); // será executado
                break;
            case 5:
                System.out.println("Maio");
                break;
            default:
                System.out.println("Mês não mapeado");
                break;
        }

        /*
         * O que acontece SEM o break? (fall-through)
         * Sem o break, o Java continua executando os próximos
         * cases até encontrar um break ou chegar ao fim do switch.
         * Isso raramente é intencional e costuma causar bugs.
         *
         * Exemplo (apenas ilustrativo, comentado):
         *
         * int x = 1;
         * switch (x) {
         *     case 1:
         *         System.out.println("case 1"); // executa
         *     case 2:
         *         System.out.println("case 2"); // também executa! (sem break)
         *     case 3:
         *         System.out.println("case 3"); // também executa!
         *         break;                        // para aqui
         * }
         * Saída: case 1, case 2, case 3
         */

        /*
         * =====================================================
         * SEÇÃO 5: COMPARAÇÃO PRÁTICA — if-else vs switch
         * =====================================================
         * Quando usar cada um?
         *
         * Use if-else quando:
         * - A condição envolve ranges (ex: nota >= 70 && nota < 90)
         * - A condição envolve expressões complexas
         * - Você compara tipos booleanos
         *
         * Use switch quando:
         * - Você compara uma variável com valores fixos e específicos
         * - Há muitos casos (o código fica mais limpo que vários else if)
         * - Você quer aproveitar a sintaxe moderna como expressão
         */

        System.out.println("\n========== COMPARAÇÃO: if-else vs switch ==========");

        int opcaoMenu = 2;

        // Com if-else:
        System.out.println("-- Com if-else --");
        if (opcaoMenu == 1) {
            System.out.println("Opção 1: Novo jogo");
        } else if (opcaoMenu == 2) {
            System.out.println("Opção 2: Carregar jogo"); // será executado
        } else if (opcaoMenu == 3) {
            System.out.println("Opção 3: Configurações");
        } else {
            System.out.println("Opção inválida");
        }

        // Com switch (mais limpo para esse cenário):
        System.out.println("-- Com switch --");
        switch (opcaoMenu) {
            case 1 -> System.out.println("Opção 1: Novo jogo");
            case 2 -> System.out.println("Opção 2: Carregar jogo"); // será executado
            case 3 -> System.out.println("Opção 3: Configurações");
            default -> System.out.println("Opção inválida");
        }

    }
}