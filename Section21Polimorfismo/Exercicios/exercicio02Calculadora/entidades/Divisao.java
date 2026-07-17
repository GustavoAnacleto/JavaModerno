package entidades;

public class Divisao extends Operacao {

    @Override
    public double calcular(double numeroA, double numeroB) {
        if (numeroB == 0) {
            System.out.println("Erro: divisão por zero não é permitida.");
            return Double.NaN;
        }

        return numeroA / numeroB;
    }
}