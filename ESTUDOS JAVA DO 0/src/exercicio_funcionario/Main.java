package exercicio_funcionario;

public class Main {
    public static void main(){
        Funcionario funcionario1 = new Funcionario("João", 1600);


        System.out.println("Nome do funcionario: " + funcionario1.getNome());
        System.out.println("Salario atual: " + funcionario1.getSalario());

        funcionario1.aumentarSalario(30);

        System.out.println("novo salario: " + funcionario1.getSalario());
    }
}
