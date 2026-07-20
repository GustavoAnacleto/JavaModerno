package entidades;
public class Caixa<T> {

    private T[] elementos;

    public Caixa(int capacidade) {
    	elementos = (T[]) //Faz o casting para tratar esse array como um array do tipo genérico T
    				 new Object[capacidade]; //Cria um array com a quantidade de posições informada.
    }

    public void adicionar(T elemento, int indice){
    	elementos[indice] = elemento;
    }

    public T obter(int indice) {
    	return elementos[indice];
    }
}