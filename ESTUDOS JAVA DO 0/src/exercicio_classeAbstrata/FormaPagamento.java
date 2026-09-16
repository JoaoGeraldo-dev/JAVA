package exercicio_classeAbstrata;

public abstract class FormaPagamento {
    private double valor;

    public FormaPagamento(double valor){
        this.valor = valor;
    }

    public double getValor(){
        return valor;
    }

    public abstract void pagar();
}
