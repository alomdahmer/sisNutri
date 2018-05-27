package br.edu.unisep.model.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="alimentos_cardapios", schema="public")
public class AlimentoCardapioVO {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cardapio")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="id_carpadio", referencedColumnName="id_cardapio")
	private CardapioVO cardapio;
	
	@OneToOne
	@JoinColumn(name="id_alimento", referencedColumnName="id_alimento")
	private AlimentoVO alimento;
	
	@Column(name="qtd_alimento")
	private Double quantidadeAlimento;
	
		
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public CardapioVO getCardapio() {
		return cardapio;
	}

	public void setCardapio(CardapioVO cardapio) {
		this.cardapio = cardapio;
	}

	public AlimentoVO getAlimento() {
		return alimento;
	}

	public void setAlimento(AlimentoVO alimento) {
		this.alimento = alimento;
	}

	public Double getQuantidadeAlimento() {
		return quantidadeAlimento;
	}

	public void setQuantidadeAlimento(Double quantidadeAlimento) {
		this.quantidadeAlimento = quantidadeAlimento;
	}
}
