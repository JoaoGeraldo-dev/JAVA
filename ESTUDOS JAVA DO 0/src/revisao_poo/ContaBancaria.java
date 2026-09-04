package revisao_poo;

public class ContaBancaria {
    private String titular;
    private int numeroConta;
    private double saldo;



    public ContaBancaria(String titular, int numeroConta){
        this.titular = titular;
        this.numeroConta = numeroConta;
    }


    public String getTitular(){
        return titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }else{
            System.out.println("Esse é um valor negativo. FALHA NO DEPOSITO");
        }
    }
    public double mostrarSaldo (){
       return saldo;
    }

    public void transferir(ContaBancaria contaDestino, double valor){
       if(valor <= 0){
           System.out.println("transferencia invalida");
       }else if(valor > saldo){
           System.out.println("a conta nao possui o valor solicitado para transferencia");
       }else{
           saldo -= valor;
           contaDestino.depositar(valor);
           System.out.println("valor valido para deposito, deposito de: " + valor +" feito com sucesso!");

       }

    }

    public void sacar(double valor) {
        if (valor > saldo ) {
            System.out.println("a conta nao possui o valor solicitado para saque");
        } else if(valor <= 0) {
            System.out.println("Saque invalido");
        }else{
            saldo = saldo - valor;
            System.out.println("Saque no valor de " + valor + " foi realizado com sucesso!!");
        }
    }

}
