package br.com.banco.mentorama.classes;

import java.io.Serializable;

public class ContaPoupanca extends Conta implements Serializable {
    private static final long serialVersionUID = 1L;
    private int diaDeAniversario;

    public ContaPoupanca(String titular, int numeroAgencia, int numerocConta, double saldo, int diaDeAniversario) {
        super(titular, numeroAgencia, numerocConta, saldo);
        this.diaDeAniversario = diaDeAniversario;
    }

    public int getDiaDeAniversario() {
        return diaDeAniversario;
    }

    public void setDiaDeAniversario(int diaDeAniversario) {
        this.diaDeAniversario = diaDeAniversario;
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "titular=" + getTitular() + "\n" +
                "numeroAgencia=" + getNumeroAgencia() + "\n" +
                "numeroConta=" + getNumerocConta() + "\n" +
                "saldo" + getSaldo() + "\n" +
                "diaDeAniversario=" + diaDeAniversario +
                '}';
    }
}
