package exercicio_produto;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;


        public Produto(String nome, double preco){
            this.nome = nome;
            this.preco = preco;
        }


    public String getNome() {
        return nome;
    }

    public int getEstoque() {
        return estoque;
    }

    public double getPreco() {
        return preco;
    }

    public void adicionarEstoque(int quantidade){
            if (quantidade <= 0){
                System.out.println("valor invalido!!!!");
            }else{
                estoque = estoque + quantidade;
            }
    }

    public void vender(int quantidade){
            if(quantidade <= 0){
                System.out.println("Valor invalido!!!");
            }else if(quantidade > estoque){
                System.out.println("Valor invalido!!!");
        }else {
                estoque = estoque - quantidade;
            }
    }

}
