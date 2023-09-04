package entities;

import java.util.Scanner;

public class Opcions {
	
	Scanner sc = new Scanner(System.in);

	public int opcao;
	public String sn;
	public String opcaoSelecionada;

	public void caso(boolean v) {
		do {
			
			v = true;
			
				switch (opcao) {
				case 1:
					System.out.println("Você selecionou a opção lavanderia, gostaria de receber mais opções sobre esse assunto?");
					opcaoSelecionada = "Lavanderia";
					v = true;
					break;
				case 2:
					System.out.println("Você digitou a opção Limpeza, gostaria de receber mais opções sobre esse assunto? Digite Sim ou Não:");
					opcaoSelecionada = "Limpeza";
					v = true;
					break;
				case 3:
					System.out.println("Você digitou a opção Economia do Lar, gostaria de receber mais opções sobre esse assunto? Digite Sim ou Não:");
					opcaoSelecionada = "Economia do Lar";
					v = true;
					break;	
				case 4:
					System.out.println("Você digitou a opção Jogos e Lazer, gostaria de receber mais opções sobre esse assunto? Digite Sim ou Não:");
					opcaoSelecionada = "Jogos e Lazer";
					v = true;
					break;
				case 5:
					System.out.println("Você digitou a opção Leitura e Conhecimento, gostaria de receber mais opções sobre esse assunto? Digite Sim ou Não:");
					opcaoSelecionada = "Leitura e Conhecimento";
					v = true;
					break;
				default:
					System.out.println("A opção digitada é inválida, por favor digitee uma opção válida:");
					while(true) {
					System.out.printf("1 - Lavanderia%n2 - Limpeza%n3 - Economia do Lar%n4 - Jogos e Lazer%n5 - Leitura e conhecimento%n");
						if(sc.hasNextInt()) {
							opcao = sc.nextInt();
							break;
						} else {
							System.out.println(opcao + " é inválida, por favor digite novamente:");
							sc.nextLine();
						}
					}
					v = false;		
				}
			}while(v == false);	
		}

	public void sim() {
		if (opcaoSelecionada == "Lavanderia") {
			System.out.println("Você digitou sim para ter mais opções sobre lavanderia");
		} else if (opcaoSelecionada == "Limpeza") {
			System.out.println("Você digitou sim para ter mais opções sobre limpeza");
		} else if (opcaoSelecionada == "Economia do Lar") {
			System.out.println("Você digitou sim para ter mais opções sobre economia do lar");
		} else if (opcaoSelecionada == "Jogos e Lazer") {
			System.out.println("Você digitou sum para ter mais opções sobre jogos e lazer");
		} else if (opcaoSelecionada == "Leitura e Conhecimento") {
			System.out.println("Você digitou sim para ter mais opções sobre leitura e conhecimento");
		}
	}
	
	public void nao() {
		System.out.println("Obrigada por interagir, o programa se encerra aqui.");
	}
}
