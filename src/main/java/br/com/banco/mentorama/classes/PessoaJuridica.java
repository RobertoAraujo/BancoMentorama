package br.com.banco.mentorama.classes;

public class PessoaJuridica extends Pessoa{

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String cnpj;
	private String razaoSocial;
	
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
