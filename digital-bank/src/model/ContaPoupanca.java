package model;

public class ContaPoupanca extends  Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }
    @Override
    public void imprimirEstrato(Conta conta) {
        System.out.println("Estrato conta poupança:");
        super.imprimeDadosConta();
    }

}
