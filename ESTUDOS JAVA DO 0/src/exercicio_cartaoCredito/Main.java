package exercicio_cartaoCredito;

public class Main {
    public static void main(String[] args){

        Cartao cartao1 = new Cartao("João", 1000);

        System.out.println("O limite do cartao é: " + cartao1.getLimite());
        cartao1.comprar(300);
        cartao1.comprar(500);
        cartao1.comprar(300);
        System.out.println("A fatura atual é de: " + cartao1.getFatura());

        cartao1.pagarFatura(200);
        System.out.println("Fatura após pagamento: " + cartao1.getFatura());

        cartao1.bloquear();
        cartao1.comprar(100);

        System.out.println("Fatura depois da tentativa com cartão bloqueado: "
                + cartao1.getFatura());

        cartao1.desbloquear();
        cartao1.comprar(100);

        System.out.println("Fatura final: " + cartao1.getFatura());






    }
}
