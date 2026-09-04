package exercicio_produto;

public class Main {
    public static void main(String[] args){

        Produto produto1 = new Produto("feijao",14.90);

        System.out.println("Produto: " + produto1.getNome());
        System.out.println("Preço: " +produto1.getPreco());

        produto1.adicionarEstoque(10);
        produto1.adicionarEstoque(5);
        produto1.vender(20);
        produto1.vender(3);

        System.out.println("Estoque final: " + produto1.getEstoque());

    }
}
