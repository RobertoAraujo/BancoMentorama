package br.com.banco.mentorama.classes;

public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String nome, int idade, Enums sexo, String cpf) {
        super(nome, idade, sexo);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "nome='" + getNome() + "\n" +
                "idade=" + getIdade() + "\n" +
                "sexo=" + getSexo() + "\n" +
                "cpf='" + cpf + "\n" +
                '}';
    }
}
