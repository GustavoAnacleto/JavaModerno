import entidades.Personagem;

public class Aplicacao {
    public static void main(String[] args) {

        Personagem p1 = new Personagem("Goku", 100);

        System.out.println("=== Passagem por Valor ===");
        System.out.println("Nivel de poder antes: " + p1.getNivelPoder());
        p1.tentarAumentarNivelPoder(p1.getNivelPoder());
        System.out.println("Nivel de poder depois: " + p1.getNivelPoder());

        System.out.println("\n=== Passagem por Referencia ===");
        System.out.println("Nome antes: " + p1.getNome());
        p1.mudarNome(p1, "Vegeta");
        System.out.println("Nome depois: " + p1.getNome());

        System.out.println("\n=== Aumentando Nivel de Poder de Verdade ===");
        System.out.println("Nivel de poder antes: " + p1.getNivelPoder());
        p1.aumentarNivelPoder(50);
        System.out.println("Nivel de poder depois: " + p1.getNivelPoder());
    }
}