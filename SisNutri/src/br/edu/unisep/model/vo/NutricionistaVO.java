package br.edu.unisep.model.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nutricionistas")
public class NutricionistaVO {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_nutricionista")
	private Integer id;

	@Column(name = "nome_nutri")
	private String nome;

	@Column(name = "endereco_nutri")
	private String endereco;

	@Column(name = "bairro_nutri")
	private String bairro;

	@Column(name = "cep_nutri")
	private String cep;

	@Column(name = "cidade_nutri")
	private String cidade;

	@Column(name = "estado_nutri")
	private String estado;

	@Column(name = "telefone_nutri")
	private String telefone;

	@Column(name = "telefone_celular_nutri")
	private String celular;

	@Column(name = "cfn_nutri")
	private String cfn;

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

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCfn() {
		return cfn;
	}

	public void setCfn(String cfn) {
		this.cfn = cfn;
	}


}
