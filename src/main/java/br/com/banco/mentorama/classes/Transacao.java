package br.com.banco.mentorama.classes;

public interface Transacao {
    public static final Conta conta = new Conta();

    public default void SacarDinheiro(){
        double valor = 0;
        conta.setSaldo(conta.getSaldo()-valor);
        System.out.println(valor);
    }
    public default void depostioDinheiro(){
        double valor = 0;
        conta.setSaldo(conta.getSaldo()+valor);
        System.out.println(valor);
    }

    public default void VerValor(){
        double valor = 0;
        conta.setSaldo(conta.getSaldo());
        System.out.println(valor);
    }
}
