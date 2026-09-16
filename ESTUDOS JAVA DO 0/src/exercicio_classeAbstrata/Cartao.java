package exercicio_classeAbstrata;

public class Cartao extends FormaPagamento {

    public Cartao(double valor){
        super(valor);
    }

    @Override
    public void pagar(){
        System.out.println("Pagamento feito com cartao");

    };


}
