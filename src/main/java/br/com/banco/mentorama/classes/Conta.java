package br.com.banco.mentorama.classes;

import java.io.Serializable;
import java.util.Objects;

public class Conta implements Serializable, Transacao {
    private static final long serialVersionUID = 1L;

    private String titular;
    private int numeroAgencia;
    private int numerocConta;
    private double saldo;

    public Conta(String titular, int numeroAgencia, int numerocConta, double saldo) {
        this.titular = titular;
        this.numeroAgencia = numeroAgencia;
        this.numerocConta = numerocConta;
        this.saldo = saldo;
    }

    public Conta() {

    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public int getNumerocConta() {
        return numerocConta;
    }

    public void setNumerocConta(int numerocConta) {
        this.numerocConta = numerocConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Conta)) return false;
        Conta conta = (Conta) o;
        return getNumeroAgencia() == conta.getNumeroAgencia() && getNumerocConta() == conta.getNumerocConta() && Double.compare(conta.getSaldo(), getSaldo()) == 0 && getTitular().equals(conta.getTitular());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitular(), getNumeroAgencia(), getNumerocConta(), getSaldo());
    }

    @Override
    public String toString() {
        return "Conta{" + "titular='" + titular + '\'' + ", numeroAgencia=" + numeroAgencia +
                ", numerocConta=" + numerocConta + ", saldo=" + saldo + '}';
    }
}
