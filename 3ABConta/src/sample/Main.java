package sample;

import sample.model.Conta;
import sample.model.Veiculo;

public class Main {

    public static void main(String[] args) {
        createConta();
        createVeiculo();
        createVeiculoLoop();

    }

   static void createConta(){
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

    static  void createVeiculo(){
        Veiculo veiculo = new Veiculo("A5E7F8BR");
        System.out.println(veiculo.consultarPlaca());
        System.out.println("Velocidade: " + veiculo.consultarVelocidade());
        System.out.println("Nova Velocidade: " + veiculo.acelerar(15));
        System.out.println("Nova Velocidade: " + veiculo.acelerar(15));
        System.out.println("Freindo... velocidade: " + veiculo.freiar(5));
        System.out.println("Freindo... velocidade: " + veiculo.freiar(8));
        System.out.println("Freindo... velocidade: " + veiculo.freiar(13));
        System.out.println("Freindo... velocidade: " + veiculo.freiar(10));

    }

    static  void createVeiculoLoop(){
        Veiculo v2 = new Veiculo("F8R2A52");
        v2.acelerar(1);
        int iAcelerador = 0;
        while (v2.consultarVelocidade()< 200){
            iAcelerador++;
            v2.acelerar(iAcelerador);
            System.out.println("Acelerando " + v2.consultarVelocidade());
        }

        while (v2.consultarVelocidade()> 0){
            iAcelerador--;
            v2.freiar(iAcelerador * 2);

            System.out.println("Freiando: " + v2.consultarVelocidade());
        }

    }

    static  void createCliente(){

   }
}