package br.edu.unisep.model.vo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="cardapios", schema="public")
public class CardapioVO {

	@Id
	@Column(name="id_cardapio")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idCardapio;
	
	@OneToOne
	@JoinColumn(name="id_nutricionista",referencedColumnName="id_nutricionista")
	private NutricionistaVO nutricionista;
	
	@Column(name="ds_nome")
	private String nome;
	
	@OneToOne
	@JoinColumn(name="id_paciente",referencedColumnName="id_paciente") 	
	private PacienteVO paciente;
	
	@OneToMany(mappedBy="cardapio", cascade=CascadeType.ALL)
	private List<AlimentoCardapioVO> alimentos;

	public Integer getIdCardapio() {
		return idCardapio;
	}

	public void setIdCardapio(Integer idCardapio) {
		this.idCardapio = idCardapio;
	}

	public NutricionistaVO getNutricionista() {
		return nutricionista;
	}

	public void setNutricionista(NutricionistaVO nutricionista) {
		this.nutricionista = nutricionista;
	}

	public PacienteVO getPaciente() {
		return paciente;
	}

	public void setPaciente(PacienteVO paciente) {
		this.paciente = paciente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<AlimentoCardapioVO> getAlimentos() {
		return alimentos;
	}

	public void setAlimentos(List<AlimentoCardapioVO> alimentos) {
		this.alimentos = alimentos;
	}

	@Override
	public String toString() {
		return this.nome;
	}
}
