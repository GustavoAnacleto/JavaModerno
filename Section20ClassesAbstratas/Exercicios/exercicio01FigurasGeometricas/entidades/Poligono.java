package entidades;

public class Poligono extends FiguraGeometrica {

    double[] lados;

    public Poligono(double[] lados) {
        this.lados = lados;
    }

    public boolean isRegular() {
        for (int i = 1; i < lados.length; i++) {
            if (lados[i] != lados[0]) {
                return false;
            }
        }
        return true;
    }

    public String tipoPoligono() {
        return isRegular() ? "Regular" : "Irregular";
    }

    @Override
    public double calcularArea() {
        if (isRegular()) {
            int n = lados.length;
            double lado = lados[0];
            return (n * Math.pow(lado, 2)) / (4 * Math.tan(Math.PI / n));
        } else {
            
            return 0;
        }
    }

    @Override
    public double calcularPerimetro() {
        double soma = 0;
        for (double lado : lados) {
            soma += lado;
        }
        return soma;
    }
}