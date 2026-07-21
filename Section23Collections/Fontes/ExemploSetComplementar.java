import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSetComplementar {

    public static void main(String[] args) {

        System.out.println("========== HASHSET ==========");

        /*
         * Set é a interface que define o comportamento de um conjunto.
         * HashSet é uma classe que implementa a interface Set.
         *
         * Características do HashSet:
         * - não permite elementos duplicados;
         * - não trabalha com índices;
         * - não garante a ordem de inserção;
         * - utiliza o código hash dos objetos para organizar e localizar
         *   os elementos internamente.
         */
        Set<String> conjunto = new HashSet<>();

        /*
         * O método add() adiciona um elemento ao conjunto.
         *
         * Ele também retorna um valor boolean:
         * true  -> o elemento foi adicionado;
         * false -> o elemento já existia no conjunto.
         */
        conjunto.add("Java");
        conjunto.add("C++");
        conjunto.add("Python");

        imprimirSeparador();

        /*
         * O método contains() verifica se determinado elemento
         * existe no conjunto.
         */
        System.out.println(
                "O conjunto contém Java? " + conjunto.contains("Java")
        );

        System.out.println(
                "O conjunto contém Ruby? " + conjunto.contains("Ruby")
        );

        imprimirSeparador();

        // Adicionando mais dois elementos.
        conjunto.add("PHP");
        conjunto.add("Progress4GL");

        /*
         * O HashSet não garante a ordem em que os elementos
         * serão apresentados.
         *
         * Por isso, a ordem exibida pode ser diferente da ordem
         * em que os elementos foram adicionados.
         */
        System.out.println("Conjunto completo: " + conjunto);

        /*
         * O método size() informa a quantidade de elementos
         * existentes no conjunto.
         */
        System.out.println("Quantidade de elementos: " + conjunto.size());

        imprimirSeparador();

        /*
         * O método remove() remove um elemento do conjunto.
         *
         * Ele também retorna um boolean:
         * true  -> o elemento existia e foi removido;
         * false -> o elemento não existia.
         */
        boolean foiRemovido = conjunto.remove("Python");

        System.out.println("Python foi removido? " + foiRemovido);
        System.out.println("Conjunto após remover Python: " + conjunto);
        System.out.println("Quantidade de elementos: " + conjunto.size());

        imprimirSeparador();

        /*
         * Tentativa de adicionar um elemento duplicado.
         *
         * Como Java já está no conjunto, ele não será adicionado
         * novamente e o método add() retornará false.
         */
        boolean foiAdicionado = conjunto.add("Java");

        System.out.println(
                "Java foi adicionado novamente? " + foiAdicionado
        );

        System.out.println("Conjunto após a tentativa: " + conjunto);
        System.out.println("Quantidade de elementos: " + conjunto.size());

        imprimirSeparador();

        /*
         * Como Set não possui acesso por índice, normalmente usamos
         * o for-each para percorrer seus elementos.
         */
        System.out.println("Percorrendo o HashSet:");

        for (String linguagem : conjunto) {
            System.out.println(linguagem);
        }

        imprimirSeparador();

        /*
         * O método clear() remove todos os elementos do conjunto.
         */
        conjunto.clear();

        System.out.println("Conjunto após o clear(): " + conjunto);
        System.out.println("Quantidade de elementos: " + conjunto.size());

        /*
         * O método isEmpty() verifica se o conjunto está vazio.
         */
        System.out.println(
                "O conjunto está vazio? " + conjunto.isEmpty()
        );

        System.out.println();
        System.out.println("========== LINKEDHASHSET ==========");

        /*
         * LinkedHashSet também não permite elementos duplicados.
         *
         * A diferença é que ele mantém a ordem em que os elementos
         * foram adicionados.
         */
        Set<String> conjuntoOrdemInsercao = new LinkedHashSet<>();

        conjuntoOrdemInsercao.add("Java");
        conjuntoOrdemInsercao.add("C++");
        conjuntoOrdemInsercao.add("Python");
        conjuntoOrdemInsercao.add("PHP");
        conjuntoOrdemInsercao.add("Progress4GL");

        System.out.println(
                "Ordem de inserção: " + conjuntoOrdemInsercao
        );

        /*
         * Mesmo no LinkedHashSet, elementos duplicados continuam
         * não sendo permitidos.
         */
        boolean duplicadoLinkedHashSet =
                conjuntoOrdemInsercao.add("Java");

        System.out.println(
                "Java foi adicionado novamente? "
                        + duplicadoLinkedHashSet
        );

        System.out.println(
                "Conjunto após a tentativa: "
                        + conjuntoOrdemInsercao
        );

        System.out.println();
        System.out.println("========== TREESET CRESCENTE ==========");

        /*
         * TreeSet mantém os elementos automaticamente ordenados.
         *
         * Para String, a ordenação natural é alfabética crescente.
         *
         * Assim como os demais tipos de Set, não permite duplicatas.
         */
        Set<String> conjuntoOrdenado = new TreeSet<>();

        conjuntoOrdenado.add("Java");
        conjuntoOrdenado.add("C++");
        conjuntoOrdenado.add("Python");
        conjuntoOrdenado.add("PHP");
        conjuntoOrdenado.add("Progress4GL");

        System.out.println(
                "Ordem crescente: " + conjuntoOrdenado
        );

        System.out.println();
        System.out.println("========== TREESET DECRESCENTE ==========");

        /*
         * Para ordenar em ordem decrescente, podemos fornecer
         * Comparator.reverseOrder() ao criar o TreeSet.
         *
         * Esse comportamento é conceitualmente semelhante
         * a uma ordenação DESC.
         */
        Set<String> conjuntoOrdemDecrescente =
                new TreeSet<>(Comparator.reverseOrder());

        conjuntoOrdemDecrescente.add("Java");
        conjuntoOrdemDecrescente.add("C++");
        conjuntoOrdemDecrescente.add("Python");
        conjuntoOrdemDecrescente.add("PHP");
        conjuntoOrdemDecrescente.add("Progress4GL");

        System.out.println(
                "Ordem decrescente: " + conjuntoOrdemDecrescente
        );

        System.out.println();
        System.out.println("========== RESUMO ==========");

        System.out.println(
                "HashSet: não permite duplicados e não garante ordem."
        );

        System.out.println(
                "LinkedHashSet: não permite duplicados e mantém "
                        + "a ordem de inserção."
        );

        System.out.println(
                "TreeSet: não permite duplicados e mantém "
                        + "os elementos ordenados."
        );
    }

    /*
     * Método auxiliar criado apenas para evitar repetição
     * do separador durante a execução do programa.
     */
    public static void imprimirSeparador() {
        System.out.println(
                "_____________________________________________________________"
        );
    }
}