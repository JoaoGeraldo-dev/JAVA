package exercicio_livro;

public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public boolean isDisponivel(){
     return disponivel;
    }

    public void emprestar(){
        if (!disponivel){
            System.out.println("livro indisponivel para emprestimo");
        }else{
            System.out.println("emprestimo de livro feito com sucesso!!");
            disponivel = false;
        }
    }

    public void devolver(){
        if (!disponivel){
            System.out.println("devolução feita com sucesso");
            disponivel = true;
        }else{
            System.out.println("Livro ja esta disponivel");
        }
    }


}
