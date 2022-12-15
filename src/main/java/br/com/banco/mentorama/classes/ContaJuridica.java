package br.com.banco.mentorama.classes;

import java.io.Serializable;

public class ContaJuridica extends Conta implements Serializable {
    private static final long serialVersionUID = 1L;
    private String cnpj;
    private String razaoSocial;

    public ContaJuridica(String titular, int numeroAgencia, int numerocConta, double saldo, String cnpj, String razaoSocial) {
        super(titular, numeroAgencia, numerocConta, saldo);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    public String toString() {
        return "ContaJuridica{" +
                "titular=" + getTitular() + "\n" +
                "numeroAgencia=" + getNumeroAgencia() + "\n" +
                "numeroConta=" + getNumerocConta() + "\n" +
                "saldo" + getSaldo() + "\n" +
                "cnpj='" + cnpj + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                '}';
    }
}
