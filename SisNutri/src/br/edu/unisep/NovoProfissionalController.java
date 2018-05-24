package br.edu.unisep;

import com.jfoenix.controls.JFXTextField;

import br.edu.unisep.fx.annotation.OnlyNumber;
import br.edu.unisep.fx.annotation.Required;
import br.edu.unisep.fx.controller.ModalController;
import br.edu.unisep.model.dao.NutricionistaDAO;
import br.edu.unisep.model.vo.NutricionistaVO;
import javafx.fxml.FXML;

public class NovoProfissionalController extends ModalController{

	@Required(campo = "Nome")
	@FXML private JFXTextField txtNome;

	@Required(campo = "Endereço")
	@FXML private JFXTextField txtEndereco;

	@Required(campo = "Bairro")
	@FXML private JFXTextField txtBairro;

	@Required(campo = "Cidade")
	@FXML private JFXTextField txtCidade;

	@Required(campo = "CEP")
	@OnlyNumber(isDecimal=false)
	@FXML private JFXTextField txtCep;

	@Required(campo = "Estado")
	@FXML private JFXTextField txtEstado;

	@Required(campo = "Telefone")
	@OnlyNumber(isDecimal=false)
	@FXML private JFXTextField txtTelefone;

	@Required(campo = "CFN")
	@FXML private JFXTextField txtCfn;

	@Required(campo = "Celular")
	@OnlyNumber(isDecimal=false)
	@FXML private JFXTextField txtCelular;

	@Override
	protected void onModalInit() {

	}

	public void salvar(){

		NutricionistaVO nutricionista = new NutricionistaVO();

		nutricionista.setNome(txtNome.getText());
		nutricionista.setEndereco(txtEndereco.getText());
		nutricionista.setBairro(txtBairro.getText());
		nutricionista.setCidade(txtCidade.getText());
		nutricionista.setCep(txtCep.getText());
		nutricionista.setEstado(txtEstado.getText());
		nutricionista.setTelefone(txtTelefone.getText());
		nutricionista.setCfn(txtCfn.getText());
		nutricionista.setCelular(txtCelular.getText());

		NutricionistaDAO dao = new NutricionistaDAO();

		dao.salvar(nutricionista);

		closeModal();
	}

	public void limparCampo(){
		txtNome.clear();
		txtEndereco.clear();
		txtBairro.clear();
		txtCidade.clear();
		txtCep.clear();
		txtEstado.clear();
		txtCelular.clear();
		txtTelefone.clear();
		txtCfn.clear();

		txtNome.requestFocus();
	}

	public void cancelar() {
		closeModal();
	}


}
