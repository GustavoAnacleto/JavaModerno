import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploListComplementar {

    public static void main(String[] args) {

        /*
         * List é uma interface que representa uma coleção ordenada.
         *
         * ArrayList é uma classe que implementa List.
         *
         * Características principais:
         * - mantém a ordem de inserção;
         * - permite elementos duplicados;
         * - trabalha com índices;
         * - o primeiro índice é sempre zero.
         */
        List<String> linguagens = new ArrayList<>();

        /*
         * add(elemento) adiciona um elemento no final da lista.
         */
        linguagens.add("Java");
        linguagens.add("Python");
        linguagens.add("C++");
        linguagens.add("Java");

        imprimirLista("Lista inicial", linguagens);

        /*
         * List permite elementos duplicados.
         * Por isso, a palavra Java aparece duas vezes.
         */
        System.out.println(
                "Quantidade de elementos: " + linguagens.size()
        );

        imprimirSeparador();

        /*
         * add(indice, elemento) adiciona um elemento em uma
         * posição específica.
         *
         * Os outros elementos são deslocados para a direita.
         */
        linguagens.add(1, "Progress4GL");

        imprimirLista(
                "Após adicionar Progress4GL no índice 1",
                linguagens
        );

        imprimirSeparador();

        /*
         * get(indice) retorna o elemento presente em uma posição.
         */
        String primeiraLinguagem = linguagens.get(0);
        String terceiraLinguagem = linguagens.get(2);

        System.out.println(
                "Elemento do índice 0: " + primeiraLinguagem
        );

        System.out.println(
                "Elemento do índice 2: " + terceiraLinguagem
        );

        imprimirSeparador();

        /*
         * set(indice, elemento) substitui o elemento que está
         * em uma determinada posição.
         *
         * Ele não aumenta o tamanho da lista.
         */
        String elementoSubstituido = linguagens.set(2, "JavaScript");

        System.out.println(
                "Elemento substituído: " + elementoSubstituido
        );

        imprimirLista(
                "Após substituir o elemento do índice 2",
                linguagens
        );

        imprimirSeparador();

        /*
         * contains(elemento) verifica se determinado elemento
         * existe na lista.
         */
        boolean contemJava = linguagens.contains("Java");
        boolean contemRuby = linguagens.contains("Ruby");

        System.out.println(
                "A lista contém Java? " + contemJava
        );

        System.out.println(
                "A lista contém Ruby? " + contemRuby
        );

        imprimirSeparador();

        /*
         * indexOf(elementoProcurado) busca o elemento informado e retorna o 
           índice da primeira vez em que esse elemento aparece na lista..
         *
         * lastIndexOf(elemento) retorna o índice da última ocorrência.
         *
         * Caso o elemento não exista, o retorno será -1.
         */
        int primeiroIndiceJava = linguagens.indexOf("Java");
        int ultimoIndiceJava = linguagens.lastIndexOf("Java");
        int indiceRuby = linguagens.indexOf("Ruby");

        System.out.println(
                "Primeiro índice de Java: " + primeiroIndiceJava
        );

        System.out.println(
                "Último índice de Java: " + ultimoIndiceJava
        );

        System.out.println(
                "Índice de Ruby: " + indiceRuby
        );

        imprimirSeparador();

        /*
         * remove(elemento) remove a primeira ocorrência
         * do elemento informado.
         *
         * O método retorna:
         * true  -> o elemento foi encontrado e removido;
         * false -> o elemento não existia.
         */
        boolean foiRemovido = linguagens.remove("Java");

        System.out.println(
                "A primeira ocorrência de Java foi removida? "
                        + foiRemovido
        );

        imprimirLista(
                "Após remover Java pelo conteúdo",
                linguagens
        );

        imprimirSeparador();

        /*
         * remove(indice) remove o elemento de uma determinada posição.
         *
         * Nesse caso, o método retorna o elemento que foi removido.
         */
        String removidoPeloIndice = linguagens.remove(1);

        System.out.println(
                "Elemento removido do índice 1: "
                        + removidoPeloIndice
        );

        imprimirLista(
                "Após remover pelo índice",
                linguagens
        );

        imprimirSeparador();

        /*
         * Percorrendo a lista com for-each.
         *
         * Use quando precisar dos elementos, mas não dos índices.
         */
        System.out.println("Percorrendo com for-each:");

        for (String linguagem : linguagens) {
            System.out.println("Linguagem: " + linguagem);
        }

        imprimirSeparador();

        /*
         * Percorrendo a lista com for tradicional.
         *
         * Essa forma é útil quando precisamos do índice.
         */
        System.out.println("Percorrendo com índice:");

        for (int indice = 0; indice < linguagens.size(); indice++) {
            System.out.println(
                    "Índice " + indice
                            + ": " + linguagens.get(indice)
            );
        }

        imprimirSeparador();

        /*
         * Collections.sort(lista) ordena os textos
         * em ordem alfabética crescente.
         */
        Collections.sort(linguagens);

        imprimirLista(
                "Lista em ordem crescente",
                linguagens
        );

        /*
         * Collections.reverse(lista) inverte a ordem atual.
         *
         * Como a lista estava crescente, ela ficará decrescente.
         */
        Collections.reverse(linguagens);

        imprimirLista(
                "Lista em ordem decrescente",
                linguagens
        );

        imprimirSeparador();

        /*
         * isEmpty() verifica se a lista está vazia.
         */
        System.out.println(
                "A lista está vazia? " + linguagens.isEmpty()
        );

        /*
         * clear() remove todos os elementos.
         */
        linguagens.clear();

        imprimirLista(
                "Lista após o clear()",
                linguagens
        );

        System.out.println(
                "A lista está vazia? " + linguagens.isEmpty()
        );
    }

    /*
     * Método auxiliar para imprimir o título, o conteúdo
     * e o tamanho da lista.
     */
    public static void imprimirLista(
            String titulo,
            List<String> lista
    ) {
        System.out.println(titulo + ": " + lista);
        System.out.println("Tamanho da lista: " + lista.size());
    }

    /*
     * Método auxiliar para organizar visualmente a saída.
     */
    public static void imprimirSeparador() {
        System.out.println(
                "_____________________________________________________________"
        );
    }
}