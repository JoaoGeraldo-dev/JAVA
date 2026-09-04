package exercicio_carro;

public class Main {
    public static void main(String[] args){

        Carro carro1 = new Carro("fiesta");

        System.out.println("Modelo: " + carro1.getModelo());

        carro1.acelerar(200);
        carro1.acelerar(1);
        carro1.frear(200);
        System.out.println("A velocidade final é: " + carro1.getVelocidade());


    }
}
