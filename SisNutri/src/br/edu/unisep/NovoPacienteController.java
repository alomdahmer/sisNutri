package br.edu.unisep;

import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;

import br.edu.unisep.fx.annotation.OnlyNumber;
import br.edu.unisep.fx.annotation.Required;
import br.edu.unisep.fx.controller.ModalController;
import br.edu.unisep.fx.message.AlertUtils;
import br.edu.unisep.model.dao.PacienteDAO;
import br.edu.unisep.model.vo.PacienteVO;
import javafx.fxml.FXML;

public class NovoPacienteController extends ModalController{

	@Required(campo = "Nome")
	@FXML private JFXTextField txtNome;

	@Required(campo = "Endereço")
	@FXML private JFXTextField txtEndereco;

	@Required(campo = "Bairro")
	@FXML private JFXTextField txtBairro;

	@Required(campo = "Cidade")
	@FXML private JFXTextField txtCidade;

	@OnlyNumber(isDecimal=false)
	@Required(campo = "CEP")
	@FXML private JFXTextField txtCep;

	@Required(campo = "Estado")
	@FXML private JFXTextField txtEstado;

	@OnlyNumber(isDecimal=false)
	@Required(campo = "Telefone")
	@FXML private JFXTextField txtTelefone;

	@OnlyNumber(isDecimal=false)
	@Required(campo = "Celular")
	@FXML private JFXTextField txtCelular;

	@OnlyNumber(isDecimal=true,decimalCount=2)
	@Required(campo = "Peso")
	@FXML private JFXTextField txtPeso;

	@OnlyNumber(isDecimal=true, decimalCount=2)
	@Required(campo = "Altura")
	@FXML private JFXTextField txtAltura;

	@OnlyNumber(isDecimal=false)
	@Required(campo = "Idade")
	@FXML private JFXTextField txtIdade;

	@FXML private JFXRadioButton rdMasculino;

	@FXML private JFXRadioButton rdFemino;

	@Override
	protected void onModalInit() {

	}

	public void salvar() {
		if (validate()) {
		PacienteVO paciente = new PacienteVO();
		paciente.setNome(txtNome.getText());
		paciente.setEndereco(txtEndereco.getText());
		paciente.setBairro(txtBairro.getText());
		paciente.setCidade(txtCidade.getText());
		paciente.setCep(txtCep.getText());
		paciente.setEstado(txtEstado.getText());
		paciente.setTelefone(txtTelefone.getText());
		paciente.setCeleular(txtCelular.getText());
		paciente.setPeso(Double.parseDouble(txtPeso.getText()));
		paciente.setAltura(Double.parseDouble(txtAltura.getText()));
		paciente.setIdade(Integer.parseInt(txtIdade.getText()));
		if (rdMasculino.isSelected()) {
			paciente.setSexo("m");
		} else {
			paciente.setSexo("f");
		}
		PacienteDAO dao = new PacienteDAO();
		dao.salvar(paciente);
		AlertUtils.exibirInfo("Paciente cadastrado com sucesso!!");
		closeModal();
		}
	}

	public void limparCampo() {

		txtNome.clear();
		txtCidade.clear();
		txtCep.clear();
		txtEndereco.clear();
		txtEstado.clear();
		txtBairro.clear();
		txtTelefone.clear();
		txtCelular.clear();
		txtPeso.clear();
		txtAltura.clear();
		txtIdade.clear();

		rdMasculino.setSelected(true);

		txtNome.requestFocus();

	}

	public void cancelar() {
		closeModal();
	}

}
