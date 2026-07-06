public class SomarNumeros {

    public static void main(String[] args) {

        int tamanho = 1000;
        int[] numeros = new int[tamanho];
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
            soma += numeros[i];
        }

        System.out.println("Soma dos números de 1 até 1000: " + soma);
    }
}