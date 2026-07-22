import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExemploMapComplementar {

    public static void main(String[] args) {

        System.out.println("========== HASHMAP ==========");

        /*
         * Map representa uma estrutura formada por pares:
         *
         * chave -> valor
         *
         * Na declaração abaixo:
         *
         * String  -> tipo da chave
         * Integer -> tipo do valor
         *
         * HashMap é uma implementação da interface Map.
         *
         * Características do HashMap:
         * - as chaves não podem se repetir;
         * - os valores podem se repetir;
         * - não garante ordem de exibição;
         * - cada chave permite localizar um valor.
         */
        Map<String, Integer> pontuacoes = new HashMap<>();

        /*
         * put(chave, valor) adiciona um par ao mapa.
         */
        pontuacoes.put("Java", 20);
        pontuacoes.put("Python", 10);
        pontuacoes.put("C++", 15);
        pontuacoes.put("JavaScript", 25);
        pontuacoes.put("Ruby", 10);

        /*
         * Os valores podem se repetir.
         *
         * Python e Ruby possuem o mesmo valor 10,
         * mas suas chaves são diferentes.
         */
        imprimirMapa("Mapa inicial", pontuacoes);

        imprimirSeparador();

        /*
         * size() informa quantos pares de chave e valor
         * existem no mapa.
         */
        System.out.println(
                "Quantidade de elementos: " + pontuacoes.size()
        );

        /*
         * containsKey(chave) verifica se uma chave existe.
         */
        boolean contemJava = pontuacoes.containsKey("Java");
        boolean contemPHP = pontuacoes.containsKey("PHP");

        System.out.println(
                "O mapa contém a chave Java? " + contemJava
        );

        System.out.println(
                "O mapa contém a chave PHP? " + contemPHP
        );

        /*
         * containsValue(valor) verifica se determinado valor
         * existe no mapa.
         *
         * Não informa qual chave possui esse valor.
         */
        boolean contemValor10 = pontuacoes.containsValue(10);
        boolean contemValor50 = pontuacoes.containsValue(50);

        System.out.println(
                "O mapa contém o valor 10? " + contemValor10
        );

        System.out.println(
                "O mapa contém o valor 50? " + contemValor50
        );

        imprimirSeparador();

        /*
         * get(chave) retorna o valor associado à chave.
         */
        Integer pontuacaoJava = pontuacoes.get("Java");

        System.out.println(
                "Pontuação associada a Java: " + pontuacaoJava
        );

        /*
         * Quando a chave não existe, get() retorna null.
         */
        Integer pontuacaoPHP = pontuacoes.get("PHP");

        System.out.println(
                "Pontuação associada a PHP: " + pontuacaoPHP
        );

        /*
         * getOrDefault(chave, valorPadrao) retorna:
         *
         * - o valor da chave, quando ela existe;
         * - o valor padrão informado, quando ela não existe.
         */
        Integer pontuacaoPHPComPadrao =
                pontuacoes.getOrDefault("PHP", 0);

        System.out.println(
                "Pontuação de PHP usando valor padrão: "
                        + pontuacaoPHPComPadrao
        );

        imprimirSeparador();

        /*
         * Uma chave não pode aparecer duas vezes.
         *
         * Ao chamar put() usando uma chave já existente,
         * o valor anterior será substituído.
         *
         * O método put() devolve o valor anterior.
         */
        Integer valorAnterior = pontuacoes.put("Java", 30);

        System.out.println(
                "Valor anterior associado a Java: " + valorAnterior
        );

        System.out.println(
                "Novo valor associado a Java: "
                        + pontuacoes.get("Java")
        );

        imprimirMapa(
                "Mapa após atualizar Java",
                pontuacoes
        );

        imprimirSeparador();

        /*
         * putIfAbsent(chave, valor) adiciona o par somente
         * quando a chave ainda não existe.
         */
        pontuacoes.putIfAbsent("Java", 100);

        /*
         * Como Java já existe, o valor 100 não será usado.
         */
        System.out.println(
                "Java após putIfAbsent: " + pontuacoes.get("Java")
        );

        pontuacoes.putIfAbsent("PHP", 18);

        /*
         * Como PHP ainda não existia, foi adicionado.
         */
        System.out.println(
                "PHP após putIfAbsent: " + pontuacoes.get("PHP")
        );

        imprimirMapa(
                "Mapa após putIfAbsent",
                pontuacoes
        );

        imprimirSeparador();

        /*
         * replace(chave, novoValor) substitui o valor somente
         * quando a chave existe.
         *
         * O método retorna o valor anterior.
         */
        Integer valorCAnterior = pontuacoes.replace("C++", 22);

        System.out.println(
                "Valor anterior de C++: " + valorCAnterior
        );

        System.out.println(
                "Novo valor de C++: " + pontuacoes.get("C++")
        );

        /*
         * Como Kotlin não existe, nenhuma alteração será feita.
         */
        Integer valorKotlinAnterior =
                pontuacoes.replace("Kotlin", 40);

        System.out.println(
                "Resultado ao substituir Kotlin: "
                        + valorKotlinAnterior
        );

        imprimirSeparador();

        /*
         * remove(chave) remove o par associado à chave.
         *
         * Diferentemente do remove() de Set, essa versão de
         * remove() retorna o valor que estava associado à chave.
         *
         * Caso a chave não exista, retorna null.
         */
        Integer valorRemovido = pontuacoes.remove("Python");

        System.out.println(
                "Valor removido junto com Python: " + valorRemovido
        );

        Integer valorInexistente = pontuacoes.remove("C#");

        System.out.println(
                "Resultado ao tentar remover C#: "
                        + valorInexistente
        );

        imprimirMapa(
                "Mapa após remoções",
                pontuacoes
        );

        imprimirSeparador();

        /*
         * remove(chave, valor) remove o elemento somente quando
         * a chave está associada exatamente ao valor informado.
         *
         * Essa versão retorna boolean:
         *
         * true  -> o par foi encontrado e removido;
         * false -> o par informado não existia.
         */
        boolean rubyFoiRemovido =
                pontuacoes.remove("Ruby", 10);

        System.out.println(
                "O par Ruby = 10 foi removido? "
                        + rubyFoiRemovido
        );

        boolean javaFoiRemovido =
                pontuacoes.remove("Java", 20);

        /*
         * Java possui atualmente o valor 30.
         * Por isso, tentar remover Java = 20 retornará false.
         */
        System.out.println(
                "O par Java = 20 foi removido? "
                        + javaFoiRemovido
        );

        imprimirMapa(
                "Mapa após remoções por chave e valor",
                pontuacoes
        );

        imprimirSeparador();

        /*
         * keySet() devolve um conjunto contendo todas as chaves.
         *
         * Como as chaves de um Map são únicas, o retorno é um Set.
         */
        System.out.println("Percorrendo somente as chaves:");

        for (String chave : pontuacoes.keySet()) {
            System.out.println("Chave: " + chave);
        }

        imprimirSeparador();

        /*
         * values() devolve uma coleção contendo todos os valores.
         *
         * Os valores podem aparecer repetidos.
         */
        System.out.println("Percorrendo somente os valores:");

        for (Integer valor : pontuacoes.values()) {
            System.out.println("Valor: " + valor);
        }

        imprimirSeparador();

        /*
         * entrySet() devolve um conjunto de pares formados
         * por chave e valor.
         *
         * Map.Entry representa uma entrada do mapa.
         */
        System.out.println("Percorrendo chaves e valores:");

        for (Map.Entry<String, Integer> entrada
                : pontuacoes.entrySet()) {

            String chave = entrada.getKey();
            Integer valor = entrada.getValue();

            System.out.println(
                    "Linguagem: " + chave
                            + " | Pontuação: " + valor
            );
        }

        imprimirSeparador();

        /*
         * HashMap não garante a ordem dos elementos.
         *
         * Para manter a ordem de inserção, usamos LinkedHashMap.
         */
        System.out.println("========== LINKEDHASHMAP ==========");

        Map<String, Integer> mapaOrdemInsercao =
                new LinkedHashMap<>();

        mapaOrdemInsercao.put("Java", 20);
        mapaOrdemInsercao.put("Python", 10);
        mapaOrdemInsercao.put("C++", 15);
        mapaOrdemInsercao.put("Ruby", 5);

        System.out.println(
                "Ordem de inserção: " + mapaOrdemInsercao
        );

        imprimirSeparador();

        /*
         * TreeMap organiza os elementos pela chave.
         *
         * Para String, a ordem natural é alfabética crescente.
         */
        System.out.println("========== TREEMAP CRESCENTE ==========");

        Map<String, Integer> mapaOrdenado =
                new TreeMap<>();

        mapaOrdenado.put("Java", 20);
        mapaOrdenado.put("Python", 10);
        mapaOrdenado.put("C++", 15);
        mapaOrdenado.put("Ruby", 5);

        System.out.println(
                "Mapa ordenado pelas chaves: " + mapaOrdenado
        );

        imprimirSeparador();

        /*
         * TreeMap também pode receber um Comparator.
         *
         * Comparator.reverseOrder() ordena as chaves
         * em ordem decrescente.
         */
        System.out.println("========== TREEMAP DECRESCENTE ==========");

        Map<String, Integer> mapaOrdemDecrescente =
                new TreeMap<>(Comparator.reverseOrder());

        mapaOrdemDecrescente.put("Java", 20);
        mapaOrdemDecrescente.put("Python", 10);
        mapaOrdemDecrescente.put("C++", 15);
        mapaOrdemDecrescente.put("Ruby", 5);

        System.out.println(
                "Mapa com chaves em ordem decrescente: "
                        + mapaOrdemDecrescente
        );

        imprimirSeparador();

        /*
         * isEmpty() verifica se o mapa está vazio.
         */
        System.out.println(
                "O mapa principal está vazio? "
                        + pontuacoes.isEmpty()
        );

        /*
         * clear() remove todos os pares de chave e valor.
         */
        pontuacoes.clear();

        imprimirMapa(
                "Mapa após clear()",
                pontuacoes
        );

        System.out.println(
                "O mapa principal está vazio? "
                        + pontuacoes.isEmpty()
        );
    }

    /*
     * Método auxiliar para imprimir o mapa e seu tamanho.
     */
    public static void imprimirMapa(
            String titulo,
            Map<String, Integer> mapa
    ) {
        System.out.println(titulo + ": " + mapa);
        System.out.println("Quantidade de pares: " + mapa.size());
    }

    /*
     * Método auxiliar para organizar a saída do terminal.
     */
    public static void imprimirSeparador() {
        System.out.println(
                "_____________________________________________________________"
        );
    }
}