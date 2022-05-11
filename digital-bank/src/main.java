import model.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digital bank");
        Banco banco = new Banco("Novo Banco");
        Cliente cliente = new Cliente("Renato");
        Conta cc = new ContaCorrente(cliente);
        Conta cp = new ContaPoupanca(cliente);
        banco.addConta(cc);
        banco.addConta(cp);
        banco.ListContas();
        cc.depositar(1500);
        cp.depositar(2000);
        banco.totalSaldosContas();


    }
}