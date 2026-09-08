package exercicio_cartaoCredito;

public class Cartao {
    private String titular;
    private double limite;
    private double fatura;
    private boolean bloqueado;

    public Cartao(String titular, double limite){
            this.titular = titular;
            this.limite = limite;
    }

    public String getTitular(){
        return titular;
    }
    public double getLimite(){
        return limite;
    }
    public  double getFatura(){
        return fatura;
    }
    public boolean isBloqueado(){
        return bloqueado;
    }


    public void comprar(double valor){
        if(valor <= 0 || bloqueado){
            System.out.println("O cartao esta bloqueado ou o valor esta abaixo de 0");
        }else if(fatura + valor > limite){
            System.out.println("a compra fez a fatura ultrapassar o limite!!!!!");
        }else{
            fatura += valor;
        }
    }

    public void pagarFatura(double valor){
        if(valor > 0 && valor <= fatura){
            System.out.println("fatura paga com sucesso");
            fatura -= valor;
        }else{
            System.out.println("erro ao realizar pagamento da fatura!!");
        }
    }

    public void bloquear(){
         bloqueado = true;
    }

    public void desbloquear(){
         bloqueado = false;
    }

}
