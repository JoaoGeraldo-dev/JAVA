package exercicio_polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Programador());
        funcionarios.add(new Funcionario());
        funcionarios.add(new Gerente());

        for (Funcionario funcionario : funcionarios){
            funcionario.trabalhar();
        }



    }
}
