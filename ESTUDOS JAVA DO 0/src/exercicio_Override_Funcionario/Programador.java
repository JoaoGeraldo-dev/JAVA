package exercicio_Override_Funcionario;

public class Programador extends Funcionario{
    @Override
    public void trabalhar(){
        super.trabalhar();
        System.out.println("Funcionario esta programando");
    }
}
