package revisao_poo;



public class Main {
    public static void main(String[] args){

        ContaBancaria conta1 = new ContaBancaria("João", 1001);
        ContaBancaria conta2 = new ContaBancaria("Pedro", 1002);


        conta1.depositar(1000);
        conta1.depositar(500);
        conta1.sacar(-200);
        conta1.sacar(2000);
        conta1.sacar(300);

        conta1.transferir(conta2,600);
       
        System.out.println("Saldo João: " + conta1.mostrarSaldo());
        System.out.println("Saldo destino: " + conta2.mostrarSaldo());


    }
}
