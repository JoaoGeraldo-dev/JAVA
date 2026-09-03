package poo;

import java.sql.SQLOutput;

public class Conta {



    String titular = "João Geraldo";
    double saldo = 1000;

    void depositar(double valor){
        saldo = saldo + valor;
    }
}
