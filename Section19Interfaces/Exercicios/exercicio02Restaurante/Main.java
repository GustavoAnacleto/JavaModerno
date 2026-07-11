import entidades.*;

public class Main {
	public static void main(String[] args) {
		Pedido pedido = new Pedido(5);

		pedido.adicionarItem("Hamburguer", 15.50);
		pedido.adicionarItem("Batata frita", 10.50);
		pedido.adicionarItem("Refrigerante", 5.50);

		System.out.println("Total do pedido: " + pedido.calcularTotal());

	}
}