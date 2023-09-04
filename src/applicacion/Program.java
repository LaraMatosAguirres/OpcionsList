package applicacion;

import java.util.Scanner;

import entities.Opcions;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Opcions opcao = new Opcions(); 
		
		
		System.out.println("Digite somente o número para escolher uma das opções a baixo: ");
		
		while (true) {
		System.out.printf("1 - Lavanderia%n2 - Limpeza%n3 - Economia do Lar%n4 - Jogos e Lazer%n5 - Leitura e conhecimento%n");
			if (sc.hasNextInt()) {
				opcao.opcao = sc.nextInt();
				opcao.caso(true);
				break;
			} else {
			System.out.println(opcao + " é uma resposta inválida, por favor digite novamente uma opção valida");
			sc.nextLine();
			}
	}
	
		if (opcao.opcao == 1||opcao.opcao == 2 ||opcao.opcao == 3||opcao.opcao == 4||opcao.opcao == 5) {
			while(true) {
				System.out.println("Digite Sim ou Não:");
				opcao.sn = sc.next();
					if(opcao.sn.equals("Sim")||opcao.sn.equals("sim")||opcao.sn.equals("SIM")||opcao.sn.equals("sIm")||opcao.sn.equals("siM")) {
						opcao.sim();
						break;
					}else if(opcao.sn.equals("Não")||opcao.sn.equals("Nao")||opcao.sn.equals("NÃO")||opcao.sn.equals("NAO")||opcao.sn.equals("não")||opcao.sn.equals("nao")||opcao.sn.equals("nÃo")||opcao.sn.equals("nAo")||opcao.sn.equals("nãO")||opcao.sn.equals("naO")) {
						opcao.nao();
						break;
					} else {
						System.out.println(opcao.sn + " é uma resposta inválida, por favor digite novamente.");
				}
		}
		} 
		sc.close();
	}

}


