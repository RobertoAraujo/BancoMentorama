package br.com.banco.mentorama.classes;

public class ContaSalario extends Conta{

	private static final long serialVersionUID = 1L;
	
	private String fontePagadora;

	public String getFontePagadora() {
		return fontePagadora;
	}

	public void setFontePagadora(String fontePagadora) {
		this.fontePagadora = fontePagadora;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((fontePagadora == null) ? 0 : fontePagadora.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContaSalario other = (ContaSalario) obj;
		if (fontePagadora == null) {
			if (other.fontePagadora != null)
				return false;
		} else if (!fontePagadora.equals(other.fontePagadora))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ContaSalario [fontePagadora=" + fontePagadora + "]";
	}
	
	

}
