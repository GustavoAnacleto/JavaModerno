
import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
    public static void main(String[] args) {

        Map<String, Integer> mapa = new HashMap<>();

        mapa.put("Java", 20); // Adicionando elementos
        mapa.put("Python", 10);
        mapa.put("C++", 15);

        // Verificando se o mapa contém uma chave
        System.out.println("Contém 'Java'? " + mapa.containsKey("Java")); // true

        // Obtendo o valor associado a uma chave
        System.out.println("Valor associado a 'Java': " + mapa.get("Java")); // 20

        mapa.put("JavaScript", 25); // Adicionando mais elementos
        mapa.put("Ruby", 5);

        // Imprime sem ordem --> {Java=20, Python=10, C++=15, JavaScript=25, Ruby=5}
        System.out.println("Mapa completo: " + mapa);

        mapa.remove("Python"); // Removendo um elemento

        // Imprime --> {Java=20, C++=15, JavaScript=25, Ruby=5}
        System.out.println("Mapa após remoção: " + mapa);

        mapa.put("Java", 30); // Atualizando o valor associado a uma chave

        // {Java=30, C++=15, JavaScript=25, Ruby=5}
        System.out.println("Mapa após atualização: " + mapa);

        mapa.clear(); // Limpando o mapa
        System.out.println("Mapa após limpar: " + mapa);  // {}
    }
}