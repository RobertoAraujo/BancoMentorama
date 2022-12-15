package br.com.banco.mentorama;

import br.com.banco.mentorama.classes.Conta;
import br.com.banco.mentorama.classes.ContaCorrente;
import br.com.banco.mentorama.classes.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteClasse {
    public static void main(String[] args) {
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

        System.out.println(" Escolha a Opção desejada :");

        System.out.println("Digita sua Opção : ");
        int opcao = entrada.nextInt();

        ArrayList<Conta> contaArrayList = new ArrayList<>();
        Conta conta = new Conta();
        ContaCorrente contaCorrente1 = new ContaCorrente(1244, 34, "Banco Marcelo", 1000.00D, 500D);
        ContaCorrente contaCorrente2 = new ContaCorrente(1244, 34, "Banco Jair", 1000.00D, 500D);
        ContaCorrente contaCorrente3 = new ContaCorrente(1244, 34, "Banco Carlos", 1000.00D, 500D);

        ContaPoupanca contaPoupanca1 = new ContaPoupanca("Roberto", 12, 1244, 1000.00D, 23);
        ContaPoupanca contaPoupanca2 = new ContaPoupanca("Raimunda", 12, 1244, 1000.00D, 23);
        ContaPoupanca contaPoupanca3 = new ContaPoupanca("Miguel", 12, 1244, 1000.00D, 23);
        List<Conta> contas06 = List.of(contaCorrente1, contaCorrente2, contaCorrente3, contaPoupanca1, contaPoupanca2, contaPoupanca3);
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

                        } while (opcao01 != 1);

                        break;

                    case 2:

                        break;

                    case 3:

                        break;
                    case 4:

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
                Scanner saque = new Scanner(System.in);
                System.out.println("**************** Bem Vindo ao Modulo de Sacar *****************");
                System.out.println("Digite o nome valor que deseja Sacar :");
                double saque02 = saque.nextDouble();
                System.out.println("você esta na conta do:" + contaCorrente2.getTitular());
                if (contaCorrente2.getSaldo() > saque02) {
                    System.out.println("Não e possivel sacar valor do saque maior que valor em conta");
                } else {
                    double valorDoSaque = conta.sacarDinheiro(contaCorrente2.getSaldo() - saque02);
                    double atulizaValor = contaCorrente2.getSaldo() - valorDoSaque;
                    System.out.println("Total em sua Contas: R$ " + atulizaValor);
                    System.out.println("Valor Transferido com sucesso: R$ " + valorDoSaque);
                }
                break;
            case 3:
                Conta contas03 = new Conta();
                Scanner depositar = new Scanner(System.in);
                System.out.println("**************** Bem Vindo ao Modulo de Deposito de Valores *****************");
                System.out.println("Digite o nome valor que deseja Depositar :");
                double depositar03 = depositar.nextDouble();
                ContaPoupanca contaPoupanca03 = new ContaPoupanca("Miguel", 12, 1244, 1000.00D, 23);
                List<Double> conta03 = List.of(contaPoupanca03.getSaldo());
                if (depositar03 <= 0) {
                    System.out.println("Não e possivel Depositar valor menor que 0 !!!!!!!!!!!!");
                }
                if (depositar03 < contas03.getSaldo()) {
                    System.out.println("Opa o seu saldo e de: " + contas03.getSaldo());
                } else {
                    boolean addValor = conta03.add(contaPoupanca03.getSaldo() + depositar03);
                    System.out.println("Deposito bem sucedido seu novo saldo e de :" + "Agencia: " + contas03.getNumerocConta() + "Conta: " +
                            contas03.getNumerocConta() + "Valor: " + addValor);
                }
                break;
            case 4:
                System.out.println("**************** Bem Vindo ao Modulo Criar Cleinte *****************");
                break;

            case 5:
                Scanner transfere = new Scanner(System.in);
                System.out.println("**************** Bem Vindo ao Modulo de Deposito de Valores *****************");
                System.out.println("Digite o nome valor que deseja Depositar :");
                double transfere05 = transfere.nextDouble();
                System.out.println("você esta na conta do:" + contaCorrente1.getTitular());
                double valorTransferido = conta.transfereValor(contaCorrente1.getSaldo() + transfere05);
                double atulizaValorComSaque = contaCorrente1.getSaldo() - transfere05;
                System.out.println("Total em sua Contas: R$ " + atulizaValorComSaque);
                System.out.println("Valor Transferido com sucesso: R$ " + valorTransferido);
                break;
            case 6:
                System.out.println("**************** Bem Vindo a Modulo Financeiro *****************");
                double contacorrenteV = conta.verValorBancoFinanceiro(contaCorrente1.getSaldo() + contaCorrente2.getSaldo() + contaCorrente3.getSaldo());
                double contaPoupancaV = conta.verValorBancoFinanceiro(contaPoupanca1.getSaldo() + contaPoupanca2.getSaldo() + contaPoupanca3.getSaldo());
                double resultadoFinanceiro = contacorrenteV + contaPoupancaV;
                System.out.println("Total de Contas: " + contas06.size());
                System.out.println(resultadoFinanceiro);
                break;

            case 7:
                System.out.println("Você saiu do menu !!! ");
                break;
        }
        entrada.close();
    }

}
