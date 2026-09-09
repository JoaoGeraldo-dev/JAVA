package exercicio_Override_Funcionario;



public class Main {
    public static void main(String[] args){

        Funcionario funcionario1 = new Funcionario();
        Programador programador1 = new Programador();
        Gerente gerente1 = new Gerente();

        funcionario1.trabalhar();
        gerente1.trabalhar();
        programador1.trabalhar();

    }
}
