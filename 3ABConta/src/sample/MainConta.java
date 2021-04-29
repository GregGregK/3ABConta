package sample;

import sample.model.Conta;

public class MainConta {
    public static void main(String[] args){
        Conta conta = new Conta("12345-67", "98765");
        System.out.println(conta.extrato());
        conta.depositar(1000.60);
        conta.sacar(50);
        System.out.println(conta.extrato());

        Conta conta2 = new Conta("3456-78", "6543");
        System.out.println(conta2.extrato());
        conta2.depositar(3000.89);
        conta2.sacar(30);
        System.out.println(conta2.extrato());
    }
}
