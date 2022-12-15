package br.com.banco.mentorama.classes;

import java.io.Serializable;
import java.util.Objects;

public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;
    private String nome;
    private int idade;
    private Enums sexo;

    public Pessoa(String nome, int idade, Enums sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Enums getSexo() {
        return sexo;
    }

    public void setSexo(Enums sexo) {
        this.sexo = sexo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return idade == pessoa.idade && Objects.equals(nome, pessoa.nome) && sexo == pessoa.sexo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade, sexo);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo=" + sexo +
                '}';
    }
}
