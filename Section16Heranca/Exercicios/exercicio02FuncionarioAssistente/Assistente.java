public class Assistente extends Funcionario {

    @Override
    public double ganhoAnual() {
        return super.ganhoAnual() + 1000;
    }
}