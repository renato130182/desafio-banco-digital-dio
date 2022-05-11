package model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    @Getter @Setter
    private String nome;

    @Getter
    private final List<Conta> contas = new ArrayList<>();

    public Banco(String nome) {
        this.nome = nome;
    }

    public void addConta(Conta conta){
        this.contas.add(conta);
    }

    public void ListContas(){
        for (Conta conta : this.contas
             ){
                conta.imprimeDadosConta();
        }
    }

    public void totalSaldosContas(){
        double total = 0.0;
        for (Conta conta: this.contas
             ) {
            total += conta.saldo;
        }
        System.out.println("Saldo total: " + total);
    }

}
