package exercicio_classeAbstrata;

public class Main {
    public static void main(String[] args){
        FormaPagamento pagamento1 = new Pix(100);
        FormaPagamento pagamento2 = new Cartao(250);

        pagamento1.pagar();
        pagamento2.pagar();

    }
}
