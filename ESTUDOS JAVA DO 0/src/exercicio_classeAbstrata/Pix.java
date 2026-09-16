package exercicio_classeAbstrata;

public class Pix extends FormaPagamento{
    public Pix(double valor){
        super(valor);
    }

    @Override
    public void pagar(){
        System.out.println("Pagamento feito com Pix");
    };
}
