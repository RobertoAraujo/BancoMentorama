package br.com.banco.mentorama;

import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args, char opcaod) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("***** Banco Mentorama ** R$ **************");
		System.out.println("Menu de Opção para você Cliente amigo !");

		System.out.println(" 1 - Criar Conta ");
		System.out.println(" 2 - Sacar ");
		System.out.println(" 3 - Depositar");
		System.out.println(" 4 - Criar Cliente");
		System.out.println(" 5 - Transferir valores");
		System.out.println(" 6 - Mostrar montante disponivel nas contas");
		System.out.println(" 7 - sair");

		System.out.println(" Escolha a opção desejada :");

		System.out.println("Digita sua Opção : ");
		int opcao = entrada.nextInt();

		switch (opcao) {
		case 1:
			Scanner tconta = new Scanner(System.in);
			System.out.println("1 - Conta Corrente");
			System.out.println("2 - Conta Salario");
			System.out.println("3 - Conta Poupança");
			System.out.println("4 - Conta Juridica");
			System.out.println("Tipo de Conta");
			int val = tconta.nextInt();
			
			switch (val) {
			case 1:	
				 int opcao01 = 0;
				
				do {
					System.out.println("**************** Bem Vindo Abra Sua Conta *****************");
					
					@SuppressWarnings("resource")
					Scanner nomeContaCorrente= new Scanner(System.in);
					System.out.println("Digite o nome do Titular :");
					String recebNomeConta = nomeContaCorrente.next();
					
					@SuppressWarnings("resource")
					Scanner cpfContaCorrente = new Scanner(System.in);
					System.out.println("Digite o CPf :");
					String recebCpfConta = cpfContaCorrente.next();
	
					int digitoConta = new Random().nextInt(100) + 10;
					int contadousuario = new Random().nextInt(100) + 1188;
					System.out.println("Nome Do Titular: " + recebNomeConta + "  CPF DO Titular: " + recebCpfConta
							+ " Sua conta CC:" + contadousuario + "-" + digitoConta);
					
					@SuppressWarnings("resource")
					Scanner escolhas = new Scanner(System.in);
					System.out.println("Deseja criar um nova conta ?");
					 opcao01 = escolhas.nextInt();			
				} while ( opcao01 != 1);

				break;

			case 2:
				Scanner CriaConta2 = new Scanner(System.in);
				System.out.println("**************** Bem Vindo Abra Sua Conta *****************");
				System.out.println("Digite o nome do Titular :");
				String recebNomeConta2 = CriaConta2.next();
				System.out.println("Digite o CPf :");
				String recebCpfConta2 = CriaConta2.next();

				int digitoConta2 = new Random().nextInt(100) + 10;
				int contadousuario2 = new Random().nextInt(100) + 1188;
				System.out.println("Nome Do Titular: " + recebNomeConta2 + "  CPF DO Titular: " + recebCpfConta2
						+ " Sua conta CS:" + contadousuario2 + "-" + digitoConta2);
				break;

			case 3:
				Scanner CriaConta3 = new Scanner(System.in);
				System.out.println("**************** Bem Vindo Abra Sua Conta *****************");
				System.out.println("Digite o nome do Titular :");
				String recebNomeConta3 = CriaConta3.next();
				System.out.println("Digite o CPf :");
				String recebCpfConta3 = CriaConta3.next();

				int digitoConta3 = new Random().nextInt(100) + 10;
				int contadousuario3 = new Random().nextInt(100) + 1188;
				System.out.println("Nome Do Titular: " + recebNomeConta3 + "  CPF DO Titular : " + recebCpfConta3
						+ " Sua conta CP :" + contadousuario3 + "-" + digitoConta3);
				break;
			case 4:
				Scanner CriaConta4 = new Scanner(System.in);
				System.out.println("**************** Bem Vindo Abra Sua Conta *****************");
				System.out.println("Digite o nome do Titular :");
				String recebNomeConta4 = CriaConta4.next();
				System.out.println("Digite o CNPJ :");
				String recebCpfConta4 = CriaConta4.next();

				int digitoConta4 = new Random().nextInt(100) + 10;
				int contadousuario4 = new Random().nextInt(100) + 1188;
				System.out.println("Nome Do Titular: " + recebNomeConta4 + "  CPF DO Titular : " + recebCpfConta4
						+ " Sua conta CP :" + contadousuario4 + "-" + digitoConta4);
				break;

			default:
				if (opcao >= 5) {

					System.out.println("opa numero fora da opção :");
				}
				break;
			}
			System.out.println(val);
			break;
		case 2:

			break;
		case 3:

			break;
		case 4:

			break;
		case 5:

			break;
		case 6:

			break;
		case 7:
			System.out.println("Você saiu do menu !!! ");
			break;
		}

		entrada.close();

	}

}
