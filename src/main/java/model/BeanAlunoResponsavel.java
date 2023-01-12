package model;

public class BeanAlunoResponsavel {
	
	private String nome;
	private String telefone;
	private String nic;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getNic() {
		return nic;
	}
	public void setNic(String nic) {
		this.nic = nic;
	}
	
	@Override
	public String toString() {
		return "BeanAlunoResponsavel [nome=" + nome + ", telefone=" + telefone + ", nic=" + nic + "]";
	}
	
	
	
}
