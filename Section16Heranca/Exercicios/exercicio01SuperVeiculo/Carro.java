public class Carro extends Veiculo {

    @Override
    public void acelerar() {
        super.acelerar();
        System.out.println("Carro acelerando!");
    }

    public void ligarArCondicionado() {
        System.out.println("Ar-condicionado ligado!");
    }
}