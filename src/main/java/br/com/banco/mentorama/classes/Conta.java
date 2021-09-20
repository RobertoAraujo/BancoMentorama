package br.com.banco.mentorama.classes;

import java.io.Serializable;

public class Conta implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String titular;
	private int numeroAgencia;
	private int numerocConta;
	
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numeroAgencia;
		result = prime * result + numerocConta;
		result = prime * result + ((titular == null) ? 0 : titular.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numeroAgencia != other.numeroAgencia)
			return false;
		if (numerocConta != other.numerocConta)
			return false;
		if (titular == null) {
			if (other.titular != null)
				return false;
		} else if (!titular.equals(other.titular))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Conta [titular=" + titular + ", numeroAgencia=" + numeroAgencia + ", numerocConta=" + numerocConta
				+ "]";
	}
	
	
	
}
