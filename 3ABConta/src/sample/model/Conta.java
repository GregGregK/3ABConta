package sample.model;

//Classe conta
public class Conta {
    //atributos
    String numAgencia;
    String numConta;
    double saldo;

    //método construtor
    public Conta(String agencia, String cc){
        numAgencia = agencia;
        numConta = cc;
        saldo = 100;
    }

    //métodos
    public double sacar(double valor){
        if (saldo >= valor){
            saldo -= valor;
            return valor;
        } else {
            return 0;
        }
    }

    public boolean depositar(double valor){
        if(valor > 0) {
            saldo += valor;
            return true;
        } else {
            return false;
        }
    }

    public String extrato(){
        return "Extrato\n\nAgência: " + numAgencia
                + " Conta Corrente: " + numConta
                + " Saldo: " + saldo;
    }
}
