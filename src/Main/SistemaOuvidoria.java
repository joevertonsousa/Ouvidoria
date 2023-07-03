package Main;

import application.*;

import java.util.Scanner;

public class SistemaOuvidoria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ouvidoria ouvidoria = new Ouvidoria(5);

        while (true) {
            System.out.print("\nOuvidoria\n"
                    + "\nDigite a sua opção desejada\n"
                    + "1) Inserir uma Manifestação\n"
                    + "2) Listar Manifestações\n"
                    + "3) Sair\n"
                    + "\nEscolha sua opção: ");
            
            while (!sc.hasNextInt()) {
                System.out.println("\nEntrada inválida! Por favor, digite um número.");
                sc.next();
                System.out.print("\nEscolha sua opção: ");
            }
            
            int opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1: {
                    if (ouvidoria.isCheia()) {
                        System.out.println("\nNão é possível adicionar mais manifestações, a ouvidoria está cheia.");
                        continue;
                    }
                    System.out.print("\nInforme seu nome: ");
                    String nome = sc.nextLine();
                    Pessoa pessoa = new Pessoa(nome);

                    int tipo;
                    while (true) {
                        System.out.print("\nEscolha o tipo de manifestação:\n"
                                + "1) Reclamação\n"
                                + "2) Elogio\n"
                                + "3) Sugestão\n"
                                + "\nEscolha sua opção: ");
                        
                        while (!sc.hasNextInt()) {
                            System.out.println("\nEntrada inválida! Por favor, digite um número.");
                            sc.next();
                            System.out.print("\nEscolha o tipo de manifestação:\n"
                                + "1) Reclamação\n"
                                + "2) Elogio\n"
                                + "3) Sugestão\n"
                                + "\nEscolha sua opção: ");
                        }

                        tipo = sc.nextInt();
                        sc.nextLine();

                        if (tipo < 1 || tipo > 3) {
                            System.out.println("\nTipo de manifestação inválido. Tente novamente.");
                        } else {
                            break;
                        }
                    }

                    System.out.print("\nNos Informe Sobre seu posicionamento: ");
                    String descricao = sc.nextLine();
                    while (descricao.length() < 3) {
                        System.out.println("\nPor favor, dê mais detalhes.");
                        System.out.print("\nNos Informe Sobre seu posicionamento com mais detalhes: ");
                        descricao = sc.nextLine();
                    }

                    Manifestacao manifestacao;

                    switch (tipo) {
                        case 1:
                            manifestacao = new Reclamacao(pessoa, descricao);
                            break;
                        case 2:
                            manifestacao = new Elogio(pessoa, descricao);
                            break;
                        case 3:
                            manifestacao = new Sugestao(pessoa, descricao);
                            break;
                        default:
                            continue;
                    }

                    ouvidoria.adicionarManifestacao(manifestacao);
                    System.out.println("\nManifestação cadastrada com sucesso.");
                    break;
                }
                case 2: {
                    int tipo;
                    while (true) {
                        System.out.print("\nListar Manifestações:\n"
                                + "1) Reclamação\n" 
                                + "2) Elogio\n" 
                                + "3) Sugestão\n"
                                + "4) Todas\n"
                                + "\nEscolha sua opção: ");
                        
                        while (!sc.hasNextInt()) {
                            System.out.println("\nEntrada inválida! Por favor, digite um número.");
                            sc.next();
                            System.out.print("\nListar Manifestações:\n"
                                + "1) Reclamação\n" 
                                + "2) Elogio\n" 
                                + "3) Sugestão\n"
                                + "4) Todas\n"
                                + "\nEscolha sua opção: ");
                        }

                        tipo = sc.nextInt();
                        sc.nextLine();

                        if (tipo < 1 || tipo > 4) {
                            System.out.println("\nTipo de manifestação inválido. Tente novamente.");
                        } else {
                            break;
                        }
                    }

                    if (tipo == 4) {
                        ouvidoria.listarManifestacoes();
                    } else {
                        int count = ouvidoria.listarManifestacoesPorTipo(tipo);
                        if (count == 0) {
                            System.out.println("\nNão há manifestações deste tipo no momento.");
                        }
                    }
                    break;
                }
                case 3:
                    sc.close();
                    System.out.println("\nAgradecemos por usar nosso sistema de Ouvidoria!");
                    System.exit(0);
                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
