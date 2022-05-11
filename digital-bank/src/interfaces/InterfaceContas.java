package interfaces;
import model.Conta;

public interface InterfaceContas{
     void sacar(double valor);
     void depositar(double valor);
     void tranferir(double valor, Conta contaDestino);

     void imprimirEstrato(Conta conta);
}