package br.edu.unisep.model.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="alimentos",schema="public")
public class AlimentoVO {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_alimento")
	private Integer id;
	
	@Column(name="ds_alimento")
	private String descricao;
	
	@Column(name="umidade")
	private Double umidade;
	
	@Column(name="kcal")
	private Double kcal;
	
	@Column(name="kj")
	private Double kj;
	
	@Column(name="proteina")
	private Double proteina;
	
	@Column(name="lipidios")
	private Double lipidios;
	
	@Column(name="colesterol")
	private Double colesterol;
	
	@Column(name="carboidratos")
	private Double carboidratos;
	
	@Column(name="fibra_alimentar")
	private Double fibraAlimentar;
	
	@Column(name="cinzas")
	private Double cinzas;
	
	@Column(name="calcio")
	private Double calcio;
	
	@Column(name="magnesio")
	private Double magnesio;
	
	@Column(name="manganes")
	private Double manganes;
	
	@Column(name="fosforo")
	private Double fosforo;
	
	@Column(name="ferro")
	private Double ferro;
	
	@Column(name="sodio")
	private Double sodio;
	
	@Column(name="potassio")
	private Double potassio;
	
	@Column(name="cobre")
	private Double cobre;
	
	@Column(name="zinco")
	private Double zinco;
	
	@Column(name="retinol")
	private Double retinol;
	
	@Column(name="re")
	private Double re;
	
	@Column(name="rae")
	private Double rae;
	
	@Column(name="tiamina")
	private Double tiamina;
	
	@Column(name="riboflavina")
	private Double riboflavina;
	
	@Column(name="piridoxina")
	private Double piridoxina;
	
	@Column(name="niacina")
	private Double niacina;
	
	@Column(name="vitaminac")
	private Double vitaminac;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getUmidade() {
		return umidade;
	}
	public void setUmidade(Double umidade) {
		this.umidade = umidade;
	}
	public Double getKcal() {
		return kcal;
	}
	public void setKcal(Double kcal) {
		this.kcal = kcal;
	}
	public Double getKj() {
		return kj;
	}
	public void setKj(Double kj) {
		this.kj = kj;
	}
	public Double getProteina() {
		return proteina;
	}
	public void setProteina(Double proteina) {
		this.proteina = proteina;
	}
	public Double getLipidios() {
		return lipidios;
	}
	public void setLipidios(Double lipidios) {
		this.lipidios = lipidios;
	}
	public Double getColesterol() {
		return colesterol;
	}
	public void setColesterol(Double colesterol) {
		this.colesterol = colesterol;
	}
	public Double getCarboidratos() {
		return carboidratos;
	}
	public void setCarboidratos(Double carboidratos) {
		this.carboidratos = carboidratos;
	}
	public Double getFibraAlimentar() {
		return fibraAlimentar;
	}
	public void setFibraAlimentar(Double fibraAlimentar) {
		this.fibraAlimentar = fibraAlimentar;
	}
	public Double getCinzas() {
		return cinzas;
	}
	public void setCinzas(Double cinzas) {
		this.cinzas = cinzas;
	}
	public Double getCalcio() {
		return calcio;
	}
	public void setCalcio(Double calcio) {
		this.calcio = calcio;
	}
	public Double getMagnesio() {
		return magnesio;
	}
	public void setMagnesio(Double magnesio) {
		this.magnesio = magnesio;
	}
	public Double getManganes() {
		return manganes;
	}
	public void setManganes(Double manganes) {
		this.manganes = manganes;
	}
	public Double getFosforo() {
		return fosforo;
	}
	public void setFosforo(Double fosforo) {
		this.fosforo = fosforo;
	}
	public Double getFerro() {
		return ferro;
	}
	public void setFerro(Double ferro) {
		this.ferro = ferro;
	}
	public Double getSodio() {
		return sodio;
	}
	public void setSodio(Double sodio) {
		this.sodio = sodio;
	}
	public Double getPotassio() {
		return potassio;
	}
	public void setPotassio(Double potassio) {
		this.potassio = potassio;
	}
	public Double getCobre() {
		return cobre;
	}
	public void setCobre(Double cobre) {
		this.cobre = cobre;
	}
	public Double getZinco() {
		return zinco;
	}
	public void setZinco(Double zinco) {
		this.zinco = zinco;
	}
	public Double getRetinol() {
		return retinol;
	}
	public void setRetinol(Double retinol) {
		this.retinol = retinol;
	}
	public Double getRe() {
		return re;
	}
	public void setRe(Double re) {
		this.re = re;
	}
	public Double getRae() {
		return rae;
	}
	public void setRae(Double rae) {
		this.rae = rae;
	}
	public Double getTiamina() {
		return tiamina;
	}
	public void setTiamina(Double tiamina) {
		this.tiamina = tiamina;
	}
	public Double getRiboflavina() {
		return riboflavina;
	}
	public void setRiboflavina(Double riboflavina) {
		this.riboflavina = riboflavina;
	}
	public Double getPiridoxina() {
		return piridoxina;
	}
	public void setPiridoxina(Double piridoxina) {
		this.piridoxina = piridoxina;
	}
	public Double getNiacina() {
		return niacina;
	}
	public void setNiacina(Double niacina) {
		this.niacina = niacina;
	}
	public Double getVitaminac() {
		return vitaminac;
	}
	public void setVitaminac(Double vitaminac) {
		this.vitaminac = vitaminac;
	}
	
	@Override
	public String toString() {
		return this.descricao;
	}
}

