package model;

public class ContaCorrente extends  Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }
    @Override
    public void imprimirEstrato(Conta conta) {
        System.out.println("Estrato conta corrente:");
        super.imprimeDadosConta();
    }


}
