//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] numeros = {12, 7, 25, 8, 18, 3, 10, 21};
        int menor = numeros[0];
        int maior = numeros[0];
        int soma = 0;
        double media = 0;
        int qtdePar = 0;
        int qtdeimp = 0;

        for (int i = 0; i < numeros.length; i++){
            soma = soma + numeros[i];


            if(numeros[i] > maior){
                maior = numeros[i];
            } else if (numeros[i] < menor) {
                menor = numeros[i];
            }
            if(numeros[i] % 2 == 1){
                qtdeimp = qtdeimp + 1;
            }else{
                qtdePar = qtdePar + 1;
            }

        }
        media = (double)soma / numeros.length;
        System.out.println("A soma dos numeros é: " + soma);
        System.out.println("A media dos numeros é: " + media);
        System.out.println("O maior numero é: " + maior);
        System.out.println("O menor numero é: " + menor);
        System.out.println("A quantidade de numeros pares é: " + qtdePar);
        System.out.println("A quantidade de numeros impares é: " + qtdeimp);

    }
}