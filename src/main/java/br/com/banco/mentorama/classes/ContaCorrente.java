package br.com.banco.mentorama.classes;

import java.io.Serializable;

public class ContaCorrente extends Conta implements Serializable {
    private static final long serialVersionUID = 1L;
    private double chequeEspecial;

    public ContaCorrente(int numeroAgencia, int numerocConta, String titular, double saldo, double chequeEspecial) {
        super(titular, numeroAgencia, numerocConta, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "titular=" + getTitular() + "\n" +
                "numeroAgencia=" + getNumeroAgencia() + "\n" +
                "numeroConta=" + getNumerocConta() + "\n" +
                "saldo" + getSaldo() + "\n" +
                "chequeEspecial=" + chequeEspecial + "\n" +
                '}';
    }
}
