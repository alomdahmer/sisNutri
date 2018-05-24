package br.edu.unisep.model.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pacientes")
public class PacienteVO {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_pacientes")
	private Integer id;

	@Column(name = "nome_paciente")
	private String nome;

	@Column(name = "endereco_paciente")
	private String endereco;

	@Column(name = "bairro_paciente")
	private String bairro;

	@Column(name = "cep_paciente")
	private String cep;

	@Column(name = "cidade_paciente")
	private String cidade;

	@Column(name = "estado_paciente")
	private String estado;

	@Column(name = "telefone_paciente")
	private String telefone;

	@Column(name = "celular_paciente")
	private String celeular;

	@Column(name = "peso")
	private Double peso;

	@Column(name = "altura")
	private Double altura;

	@Column(name = "idade")
	private Integer idade;

	@Column(name = "sexo")
	private String sexo;

	@Override
	public String toString() {
		return nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCeleular() {
		return celeular;
	}

	public void setCeleular(String celeular) {
		this.celeular = celeular;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


}
