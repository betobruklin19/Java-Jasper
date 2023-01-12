package model;

import java.sql.Date;

public class Aluno {
	
	private Long id;
	private String nome;
	private Date data_nascimento;
	private String cpf;
	private String rg;
	private Date rg_data_emissao;
	private int rg_orgao_expedidor;
	private String nome_mae;
	private String nome_pai;
	private String telefone;
	private int sexo_id;
	private int raca_cor_id;
	private String email;
	private String nis;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getData_nascimento() {
		return data_nascimento;
	}
	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public Date getRg_data_emissao() {
		return rg_data_emissao;
	}
	public void setRg_data_emissao(Date rg_data_emissao) {
		this.rg_data_emissao = rg_data_emissao;
	}
	public int getRg_orgao_expedidor() {
		return rg_orgao_expedidor;
	}
	public void setRg_orgao_expedidor(int rg_orgao_expedidor) {
		this.rg_orgao_expedidor = rg_orgao_expedidor;
	}
	public String getNome_mae() {
		return nome_mae;
	}
	public void setNome_mae(String nome_mae) {
		this.nome_mae = nome_mae;
	}
	public String getNome_pai() {
		return nome_pai;
	}
	public void setNome_pai(String nome_pai) {
		this.nome_pai = nome_pai;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public int getSexo_id() {
		return sexo_id;
	}
	public void setSexo_id(int sexo_id) {
		this.sexo_id = sexo_id;
	}
	public int getRaca_cor_id() {
		return raca_cor_id;
	}
	public void setRaca_cor_id(int raca_cor_id) {
		this.raca_cor_id = raca_cor_id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNis() {
		return nis;
	}
	public void setNis(String nis) {
		this.nis = nis;
	}
	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + ", data_nascimento=" + data_nascimento + ", cpf=" + cpf + ", rg="
				+ rg + ", rg_data_emissao=" + rg_data_emissao + ", rg_orgao_expedidor=" + rg_orgao_expedidor
				+ ", nome_mae=" + nome_mae + ", nome_pai=" + nome_pai + ", telefone=" + telefone + ", sexo_id="
				+ sexo_id + ", raca_cor_id=" + raca_cor_id + ", email=" + email + ", nis=" + nis + "]";
	}
	
	
	
}
