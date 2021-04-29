package sample;

import sample.model.Veiculo;

public class MainVelocidade {
    public static void main(String [] args){
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
}
