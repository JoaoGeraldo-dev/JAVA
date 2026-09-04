package exercicio_funcionario;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
    public String getNome(){
        return nome;
    }

    public double getSalario(){
        return salario;
    }

    public void aumentarSalario(double percentual){
        if(percentual > 0){
            salario = salario + (salario*percentual)/100;

        }else{
            System.out.println("O percentual precisa ser maior que 0");
        }


    }

}
