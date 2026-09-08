package microExerciciosdeLogica;

public class MicroEx {
    private int temperatura = 20;
    private int combustivel = 40;
    private double saldo = 100;
    private int idade = 18;
    private boolean ingresso = true;
    private int velocidade;
    private double saldo2 = 1000;
    private double  limiteDiario = 500;
    private int assentosDisponiveis = 10;
    private double saldo3 = 150;
    private int idadeMinima = 18;

    public void aumentarTemperatura(int valor){
        if(valor <= 0){
            System.out.println("valor invalido");
        }else if(valor + temperatura > 30){
            System.out.println("temperatura maxima ecedida");
        }else{
            temperatura += valor;
        }
    }

    public void consumirCombustivel(int litros){
        if(litros <= 0){
            System.out.println("valor invalido");
        }else if(litros > combustivel){
            System.out.println("nao pode consumir mais combustivel doq ja existe");
        }else{
            combustivel -= litros;
        }
    }

    public void comprar(int quantidade, double precoUnitario){
        if (quantidade <= 0 && precoUnitario <= 0){
            System.out.println("ambos precisam ser maior que 0");
        }else if (quantidade * precoUnitario > saldo){
            System.out.println("saldo insuficiente");
        }else{
            double total = quantidade * precoUnitario;
            saldo = saldo - total;
        }
    }

    public void entrarEvento(int idadePessoa, boolean temIngresso){
        if (idadePessoa >= 18 && temIngresso){
            System.out.println("entrada permitida");
        }else{
            System.out.println("entrada bloqueada");
        }

    }

    public void verificarVelocidade(int valor){
        if(valor < 0){
            System.out.println("valor invalido");
        }else if(valor <= 60){
            System.out.println("velocidade permitida");
        }else if(valor <= 100){
            System.out.println("acima do permitido");
        }else{
            System.out.println("velocidade muito alta VRUMMMMMMMMMMMMMMMMMMMM");
        }
    }


    public void sacar(double valor){
        if(valor <= 0){
            System.out.println("valor invalido!!");
        }else if(valor > limiteDiario || valor > saldo2){
            System.out.println("o valor ultrapassa seu limite diario ou nao tem saldo suficiente");
        }else{
            System.out.println("saque feito com sucesso");
            saldo2 = saldo2 - valor;
        }

    }

    public void reservar(int quantidade){
        if(quantidade < 0){
            System.out.println("A quantidade precisa ser maior que zero");
        }else if(quantidade > assentosDisponiveis){
            System.out.println("voce nao pode reservar um numero maior doq o de acentos disponiveis");
        }else{
            assentosDisponiveis -= quantidade;
        }
    }

    



}
