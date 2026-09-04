package exercicio_livro;

public class Main {
    public static void main(String[] args){
        Livro livro1 = new Livro("O Hobbit", "J.R.R. Tolkien");

        System.out.println("Título: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("Disponível? " + livro1.isDisponivel());

        livro1.emprestar();
        System.out.println("Disponível após empréstimo? " + livro1.isDisponivel());

        livro1.emprestar();

        livro1.devolver();
        System.out.println("Disponível após devolução? " + livro1.isDisponivel());

        livro1.devolver();


    }
}
