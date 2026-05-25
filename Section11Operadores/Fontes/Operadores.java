/*
 * Classe: Operadores
 * Objetivo: Demonstrar de forma didática os principais operadores em Java.
 *
 * Seções abordadas:
 *  1) Operadores Aritméticos
 *  2) Operadores de Atribuição
 *  3) Operadores de Comparação (Relacionais)
 *  4) Operadores Lógicos
 *  5) Operadores Unários, Incremento e Decremento
 *
 * Dica: Execute esse programa e acompanhe o console. 
 * Leia cada comentário antes de olhar a saída.
 */

public class Operadores {

    public static void main(String[] args) {

        // ============================================================
        // 1) OPERADORES ARITMÉTICOS
        // ============================================================
        System.out.println("======= 1) OPERADORES ARITMÉTICOS =======");

        int a = 10;
        int b = 2;

        // +  soma
        int soma = a + b;
        // -  subtração
        int subtracao = a - b;
        // *  multiplicação
        int multiplicacao = a * b;
        // /  divisão inteira
        int divisao = a / b;
        // %  módulo (resto da divisão inteira)
        int resto = a % b;

        System.out.println("Valores iniciais: a = " + a + ", b = " + b);
        System.out.println("a + b = " + soma + "  (soma)");
        System.out.println("a - b = " + subtracao + "  (subtração)");
        System.out.println("a * b = " + multiplicacao + "  (multiplicação)");
        System.out.println("a / b = " + divisao + "  (divisão inteira)");
        System.out.println("a % b = " + resto + "  (resto da divisão inteira)");
        System.out.println();

        // Exemplo extra para mostrar diferença entre divisão inteira e double
        int x = 7;
        int y = 2;
        System.out.println("Exemplo de divisão inteira x / y, com x = 7 e y = 2:");
        System.out.println("x / y (int / int) = " + (x / y) + "  (parte decimal é descartada)");
        System.out.println("x / (double) y   = " + (x / (double) y) + "  (divisão com casas decimais)");
        System.out.println();


        // ============================================================
        // 2) OPERADORES DE ATRIBUIÇÃO
        // ============================================================
        System.out.println("======= 2) OPERADORES DE ATRIBUIÇÃO =======");

        int numero = 10;  // =  (atribuição simples)
        System.out.println("Valor inicial de numero: " + numero);

        // +=  soma e atribui
        numero += 5; // equivale a: numero = numero + 5;
        System.out.println("Depois de numero += 5  -> " + numero);

        // -=  subtrai e atribui
        numero -= 3; // equivale a: numero = numero - 3;
        System.out.println("Depois de numero -= 3  -> " + numero);

        // *=  multiplica e atribui
        numero *= 2; // equivale a: numero = numero * 2;
        System.out.println("Depois de numero *= 2  -> " + numero);

        // /=  divide e atribui (inteiro)
        numero /= 4; // equivale a: numero = numero / 4;
        System.out.println("Depois de numero /= 4  -> " + numero);

        // %=  resto e atribui
        numero %= 3; // equivale a: numero = numero % 3;
        System.out.println("Depois de numero %= 3  -> " + numero);
        System.out.println();


        // ============================================================
        // 3) OPERADORES DE COMPARAÇÃO (RELACIONAIS)
        // ============================================================
        System.out.println("======= 3) OPERADORES DE COMPARAÇÃO (RELACIONAIS) =======");

        int idade1 = 18;
        int idade2 = 20;

        System.out.println("Comparando idade1 = " + idade1 + " e idade2 = " + idade2);
        System.out.println("idade1 == idade2 -> " + (idade1 == idade2) + "  (igual a?)");
        System.out.println("idade1 != idade2 -> " + (idade1 != idade2) + "  (diferente de?)");
        System.out.println("idade1 > idade2  -> " + (idade1 > idade2)  + "  (maior que?)");
        System.out.println("idade1 < idade2  -> " + (idade1 < idade2)  + "  (menor que?)");
        System.out.println("idade1 >= idade2 -> " + (idade1 >= idade2) + "  (maior ou igual a?)");
        System.out.println("idade1 <= idade2 -> " + (idade1 <= idade2) + "  (menor ou igual a?)");
        System.out.println();

        // Exemplo prático: verificar se a pessoa é maior de idade
        int idadePessoa = 17;
        boolean maiorDeIdade = idadePessoa >= 18;
        System.out.println("Idade da pessoa: " + idadePessoa);
        System.out.println("Pessoa é maior de idade? " + maiorDeIdade);
        System.out.println();


        // ============================================================
        // 4) OPERADORES LÓGICOS
        // ============================================================
        System.out.println("======= 4) OPERADORES LÓGICOS =======");

        // &&  (E lógico) -> true somente se as duas condições forem verdadeiras
        // ||  (OU lógico) -> true se pelo menos uma condição for verdadeira
        // !   (NÃO lógico) -> inverte o valor booleano

        boolean temCarteiraMotorista = true;
        boolean temMaisDe18 = true;

        boolean podeDirigir = temCarteiraMotorista && temMaisDe18;
        System.out.println("Exemplo usando && (E lógico):");
        System.out.println("Tem carteira de motorista?   " + temCarteiraMotorista);
        System.out.println("Tem mais de 18 anos?         " + temMaisDe18);
        System.out.println("Pode dirigir? (A && B)       " + podeDirigir);
        System.out.println();

        boolean conheceJava = true;
        boolean conheceBancoDeDados = false;

        System.out.println("Exemplo usando || (OU lógico):");
        System.out.println("Conhece Java?                " + conheceJava);
        System.out.println("Conhece Banco de Dados?      " + conheceBancoDeDados);
        System.out.println("Serve para vaga full stack (Java OU BD)? -> " 
                           + (conheceJava || conheceBancoDeDados));
        System.out.println();

        boolean precisaTreinar = !conheceBancoDeDados;
        System.out.println("Exemplo usando ! (NÃO lógico):");
        System.out.println("Conhece Banco de Dados?      " + conheceBancoDeDados);
        System.out.println("Precisa treinar BD? (!cond)  " + precisaTreinar);
        System.out.println();


        // ============================================================
        // 5) OPERADORES UNÁRIOS / INCREMENTO E DECREMENTO
        // ============================================================
        System.out.println("======= 5) OPERADORES UNÁRIOS / INCREMENTO E DECREMENTO =======");

        int contador = 5;
        System.out.println("Valor inicial do contador: " + contador);

        // ++contador (pré-incremento): soma 1 e depois usa o valor
        System.out.println("Pré-incremento (++contador): " + (++contador));
        System.out.println("Valor do contador após pré-incremento: " + contador);

        // contador++ (pós-incremento): usa o valor e depois soma 1
        System.out.println("Pós-incremento (contador++): " + (contador++));
        System.out.println("Valor do contador após pós-incremento: " + contador);

        // --contador (pré-decremento)
        System.out.println("Pré-decremento (--contador): " + (--contador));
        System.out.println("Valor do contador após pré-decremento: " + contador);

        // contador-- (pós-decremento)
        System.out.println("Pós-decremento (contador--): " + (contador--));
        System.out.println("Valor do contador após pós-decremento: " + contador);
        System.out.println();

        // Exemplo prático: simular um estoque com incremento e decremento
        int estoque = 10;
        System.out.println("Exemplo prático de estoque:");
        System.out.println("Estoque inicial: " + estoque);

        // chegou 1 unidade (incremento)
        estoque++;
        System.out.println("Chegou 1 produto (estoque++). Estoque agora: " + estoque);

        // saiu 2 unidades (decremento duas vezes)
        estoque--;
        estoque--;
        System.out.println("Saíram 2 produtos (estoque-- duas vezes). Estoque agora: " + estoque);

        System.out.println();
        System.out.println("===== FIM DO PROGRAMA =====");
    }
}