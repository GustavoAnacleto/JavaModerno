import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExercise {

    public static void main(String[] args) {

        Set<Integer> numeros = new HashSet<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(51);

        System.out.println(
                "Conjunto completo: " + numeros
                        + "\nUsando size: " + numeros.size()
        );

        imprimirSeparador();

        System.out.println(verificarExistencia(numeros, 30));
        System.out.println(verificarExistencia(numeros, 70));

        imprimirSeparador();

        int numeroParaRemover = 20;
        boolean foiRemovido = numeros.remove(numeroParaRemover);

        if (foiRemovido) {
            System.out.println(
                    "O número " + numeroParaRemover
                            + " foi removido com sucesso."
            );
        } else {
            System.out.println(
                    "O número " + numeroParaRemover
                            + " não existe no conjunto."
            );
        }

        imprimirSeparador();

        int numeroInexistente = 90;
        boolean foiRemovidoNumeroInexistente =
                numeros.remove(numeroInexistente);

        if (foiRemovidoNumeroInexistente) {
            System.out.println(
                    "O número " + numeroInexistente
                            + " foi removido com sucesso."
            );
        } else {
            System.out.println(
                    "O número " + numeroInexistente
                            + " não existe no conjunto."
            );
        }

        imprimirSeparador();

        int numeroDuplicado = 30;
        boolean foiAdicionado = numeros.add(numeroDuplicado);

        if (foiAdicionado) {
            System.out.println(
                    "O número " + numeroDuplicado
                            + " foi adicionado com sucesso."
            );
        } else {
            System.out.println(
                    "O número " + numeroDuplicado
                            + " não foi adicionado, pois já existe."
            );
        }

        imprimirSeparador();

        System.out.println(
                "Conjunto completo: " + numeros
                        + "\nUsando size: " + numeros.size()
        );

        imprimirSeparador();

        for (Integer elemento : numeros) {
            if (elemento % 2 == 0) {
                System.out.println(
                        "Número encontrado: " + elemento + "  número par."
                );
            } else {
                System.out.println(
                        "Número encontrado: " + elemento + "  número ímpar."
                );
            }
        }

        imprimirSeparador();

        numeros.clear();

        System.out.println(
                "Conjunto completo: " + numeros
                        + "\nUsando size: " + numeros.size()
        );

        System.out.println(
                "Verificando se realmente está vazio: "
                        + numeros.isEmpty()
        );

        imprimirSeparador();

        Set<Integer> numerosEmOrdemDeInsercao =
                new LinkedHashSet<>();

        numerosEmOrdemDeInsercao.add(50);
        numerosEmOrdemDeInsercao.add(10);
        numerosEmOrdemDeInsercao.add(40);
        numerosEmOrdemDeInsercao.add(20);
        numerosEmOrdemDeInsercao.add(30);

        System.out.println(
                "Ordem de inserção: " + numerosEmOrdemDeInsercao
        );

        imprimirSeparador();

        Set<Integer> numerosOrdenados = new TreeSet<>();

        numerosOrdenados.add(50);
        numerosOrdenados.add(10);
        numerosOrdenados.add(40);
        numerosOrdenados.add(20);
        numerosOrdenados.add(30);

        System.out.println(
                "Ordem crescente: " + numerosOrdenados
        );

        imprimirSeparador();

        Set<Integer> numerosOrdenadosDesc =
                new TreeSet<>(Comparator.reverseOrder());

        numerosOrdenadosDesc.add(50);
        numerosOrdenadosDesc.add(10);
        numerosOrdenadosDesc.add(40);
        numerosOrdenadosDesc.add(20);
        numerosOrdenadosDesc.add(30);

        System.out.println(
                "Ordem decrescente: " + numerosOrdenadosDesc
        );
    }

    public static void imprimirSeparador() {
        System.out.println(
                "_____________________________________________________________"
        );
    }

    public static String verificarExistencia(
            Set<Integer> numeros,
            int numero
    ) {
        if (numeros.contains(numero)) {
            return "O número " + numero + " existe no conjunto.";
        } else {
            return "O número " + numero + " não existe no conjunto.";
        }
    }
}