package br.com.banco.mentorama.classes;

import java.io.Serializable;

public class ContaSalario extends Conta implements Serializable {
    private static final long serialVersionUID = 1L;
    private String fontePagadora;

    public ContaSalario(String titular, int numeroAgencia, int numerocConta, double saldo, String fontePagadora) {
        super(titular, numeroAgencia, numerocConta, saldo);
        this.fontePagadora = fontePagadora;
    }

    public String getFontePagadora() {
        return fontePagadora;
    }

    public void setFontePagadora(String fontePagadora) {
        this.fontePagadora = fontePagadora;
    }

    @Override
    public String toString() {
        return "ContaSalario{" +
                "titular=" + getTitular() + "\n" +
                "numeroAgencia=" + getNumeroAgencia() + "\n" +
                "numeroConta=" + getNumerocConta() + "\n" +
                "saldo" + getSaldo() + "\n" +
                "fontePagadora='" + fontePagadora + '\'' +
                '}';
    }
}
