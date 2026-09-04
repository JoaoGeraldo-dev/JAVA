package exercicio_carro;

public class Carro {
    private String modelo;
    private int velocidade;

    public Carro(String modelo){
        this.modelo = modelo;
    }

    public String getModelo(){
        return modelo;
    }

    public int getVelocidade(){
        return velocidade;
    }

    public void acelerar(int valor){
        if(valor <= 0){
            System.out.println("Valor invalido");
        }else if(velocidade + valor > 200){
            System.out.println("não pode ultrapassar 200KM");
        }else{
            velocidade = velocidade + valor;
        }
    }
    public void frear(int valor){
        if(valor <= 0){
            System.out.println("Valor invalido");
        }else if (velocidade - valor < 0){
            System.out.println("invalido. CARRO PARADO");
        }else{
            velocidade = velocidade - valor;
        }
    }
}
