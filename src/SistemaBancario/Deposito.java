package SistemaBancario;

public class Deposito extends OperacaoBancaria{

    @Override
    public void executar() {

        System.out.printf("Depósito feito no valor de R$%.2f\n", getValor());

    }

    public Deposito(double valor) {
        super(valor);
    }
}
