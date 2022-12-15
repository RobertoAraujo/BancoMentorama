package br.com.banco.mentorama.classes;

public class PessoaJuridica extends Pessoa {
    private static final long serialVersionUID = 1L;

    private int id;
    private String cnpj;
    private String razaoSocial;

    public PessoaJuridica(String nome, int idade, Enums sexo, int id, String cnpj, String razaoSocial) {
        super(nome, idade, sexo);
        this.id = id;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return "PessoaJuridica{" +
                "id=" + id +
                "nome='" + getNome() + "\n" +
                "idade=" + getIdade() + "\n" +
                "sexo=" + getSexo() + "\n" +
                ", cnpj='" + cnpj + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                '}';
    }
}
