package poo;
public class Main {
    public static void main(String[] args){

        Conta conta = new Conta();

        System.out.println("O nome do titular da conta é: " + conta.titular);
        System.out.println("O saldo inicial é: " + conta.saldo);
        System.out.println("Depositando...");
        conta.depositar(500);
        System.out.println("O saldo atual é: " + conta.saldo);



    }
}
