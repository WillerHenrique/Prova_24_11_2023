package br.com.av2.estruturadedados;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int escolha;

        String caminhoArquivo = "caminho/do/seu/arquivo.txt";

        ArvoreAVL tree = new ArvoreAVL();

        do {

            System.out.println("<1> Inserir");
            System.out.println("<2> Excluir");
            System.out.println("<3> Pesquisar");
            System.out.println("<4> Caminhamento em pré-ordem");
            System.out.println("<5> Sair");
            System.out.print("Escolha uma opção: ");

            escolha = ler.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Opção 1 selecionada: Inserir");

                    try (Scanner scanner = new Scanner(new File(caminhoArquivo))) {
                        // Assumindo que o arquivo tem um único valor por linha.
                        while (scanner.hasNextInt()) {
                            int valorInserir = scanner.nextInt();

                            tree.root = tree.insert(tree.root, valorInserir);

                            System.out.println("Valor " + valorInserir + " inserido na árvore AVL.");
                        }
                    } catch (FileNotFoundException e) {
                        System.err.println("Erro ao ler o arquivo: " + e.getMessage());
                    }
                    break;

                case 2:
                    System.out.println("Opção 2 selecionada: Excluir");
                    // Implemente a lógica de exclusão aqui
                    break;
                case 3:
                    System.out.println("Opção 3 selecionada: Pesquisar");
                    // Implemente a lógica de pesquisa aqui
                    break;
                case 4:
                    System.out.println("Opção 4 selecionada: Caminhamento em pré-ordem");
                    // Implemente a lógica de caminhamento em pré-ordem aqui
                    break;
                case 5:
                    System.out.println("Saindo do programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        } while (escolha != 5);

        ler.close();
    }
}