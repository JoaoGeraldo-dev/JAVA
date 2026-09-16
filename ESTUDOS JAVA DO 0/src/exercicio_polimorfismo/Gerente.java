package exercicio_polimorfismo;

public class Gerente extends Funcionario {
    @Override
    public void trabalhar(){
        System.out.println("gerenciando projetos");
    }
}
