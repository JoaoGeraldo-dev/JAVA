package view;

import java.util.Scanner;
import model.BlocoDeNotas;

public class AppBloco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BlocoDeNotas bloco = new BlocoDeNotas();
        int opcao;

        do {
            System.out.println("\n=== Menu Bloco de Notas ===");
            System.out.println("1) Inserir nota");
            System.out.println("2) Remover nota");
            System.out.println("3) Alterar nota");
            System.out.println("4) Listar todas as notas");
            System.out.println("5) Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite a nota: ");
                    String nota = scanner.nextLine();
                    bloco.inserirNota(nota);
                    System.out.println("Nota inserida.");
                    break;

                case 2:
                    bloco.imprimirNotas();
                    System.out.print("Digite o índice da nota a remover: ");
                    int indiceRemover = scanner.nextInt();
                    if (bloco.removerNota(indiceRemover)) {
                        System.out.println("Nota removida.");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 3:
                    bloco.imprimirNotas();
                    System.out.print("Digite o índice da nota a alterar: ");
                    int indiceAlterar = scanner.nextInt();
                    scanner.nextLine(); // Consumir quebra de linha
                    System.out.print("Digite a nova nota: ");
                    String novaNota = scanner.nextLine();
                    if (bloco.alterarNota(indiceAlterar, novaNota)) {
                        System.out.println("Nota alterada.");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 4:
                    System.out.println("\n--- Lista de Notas ---");
                    bloco.imprimirNotas();
                    break;

                case 5:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (opcao != 5);

        scanner.close();
    }
}
