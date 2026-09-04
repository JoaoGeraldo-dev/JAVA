package exercicio_aluno;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    private double media;

    public Aluno(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }


    public double getMedia(){
        return media;
    }

    public void adicionarNota1 (double nota){
        if(nota >= 0 && nota <= 10){
            nota1 = nota;
        }
    }

    public void adicionarNota2(double nota){
        if(nota >= 0 && nota <= 10){
            nota2 = nota;
        }
    }

    public String verificarSituacao(){
        if(media >= 7){
            return "Aprovado";
        } else if (media >= 5 && media < 7){
            return "Recuperação";
        }else{
            return "Reprovado";
        }
    }


    public void calcularMedia(){
        media = (nota1 + nota2)/2;
    }
}
