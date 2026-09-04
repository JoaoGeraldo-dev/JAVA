package exercicio_aluno;

public class Main {
    public static void main(String[] args){

        Aluno aluno1 = new Aluno("João");

        System.out.println("Aluno: " + aluno1.getNome());
        aluno1.adicionarNota1(10);
        aluno1.adicionarNota2(5);
        aluno1.calcularMedia();
        System.out.println("Média: " + aluno1.getMedia());
        System.out.println("Situação: " + aluno1.verificarSituacao());

    }
}
