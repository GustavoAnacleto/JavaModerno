import entidades.FiguraGeometrica;
import entidades.Retangulo;
import entidades.Circulo;
import entidades.Quadrado;
import entidades.Poligono;

public class Aplicacao {
    public static void main(String[] args) {

        FiguraGeometrica retangulo = new Retangulo(5, 3);
        FiguraGeometrica circulo = new Circulo(4);
        FiguraGeometrica quadrado = new Quadrado(6);

        double[] ladosRegular = {4, 4, 4, 4, 4, 4};
        Poligono poligonoRegular = new Poligono(ladosRegular);

        double[] ladosIrregular = {3, 5, 4, 6, 2};
        Poligono poligonoIrregular = new Poligono(ladosIrregular);

        System.out.println("Retângulo - Área: " + retangulo.calcularArea() 
            + ", Perímetro: " + retangulo.calcularPerimetro());
        System.out.println("Círculo - Área: " + circulo.calcularArea() 
            + ", Perímetro: " + circulo.calcularPerimetro());
        System.out.println("Quadrado - Área: " + quadrado.calcularArea() 
            + ", Perímetro: " + quadrado.calcularPerimetro());

        System.out.println("Polígono 1 (" + poligonoRegular.tipoPoligono() 
            + ") - Área: " + poligonoRegular.calcularArea() + ", Perímetro: " + poligonoRegular.calcularPerimetro());
        System.out.println("Polígono 2 (" + poligonoIrregular.tipoPoligono() 
            + ") - Área: " + poligonoIrregular.calcularArea()
            + "\nÁrea não calculada: polígono irregular exige coordenadas dos vértices ou outro método." 
            + "\n, Perímetro: " + poligonoIrregular.calcularPerimetro());
    }
}