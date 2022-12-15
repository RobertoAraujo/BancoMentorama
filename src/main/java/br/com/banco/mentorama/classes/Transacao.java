package br.com.banco.mentorama.classes;

public interface Transacao {
    public static final Conta conta = new Conta();

    public default double sacarDinheiro(double valorDoSaque){
        double valor = 0;
        conta.setSaldo(conta.getSaldo()-valor);
        System.out.println(valor);
        return valorDoSaque;
    }
    public default double depostioDinheiro(double novoValor){
        double valor = 100;
        conta.setSaldo(conta.getSaldo()+valor);
        System.out.println(valor);
        return novoValor;
    }

    public default void VerValor(){
        double valor = 0;
        conta.setSaldo(conta.getSaldo());
        System.out.println(valor);
    }
    public default double transfereValor(double novoValor){
        double valor = 0;
        conta.setSaldo(conta.getSaldo());
        System.out.println(valor);
        return novoValor;
    }

    public default double verValorBancoFinanceiro(double novoValor){
        double valor = 0;
        conta.setSaldo(conta.getSaldo());
        System.out.println(valor);
        return novoValor;
    }
}
