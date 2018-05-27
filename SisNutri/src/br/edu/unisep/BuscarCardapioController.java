package br.edu.unisep;

import java.util.List;

import com.jfoenix.controls.JFXComboBox;
import br.edu.unisep.fx.controller.ModalController;
import br.edu.unisep.model.dao.PacienteDAO;
import br.edu.unisep.model.vo.CardapioVO;
import br.edu.unisep.model.vo.PacienteVO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class BuscarCardapioController extends ModalController {

	@FXML private JFXComboBox<PacienteVO> cmbPaciente;
	@FXML private TableView<CardapioVO> tbCardapio;
	@FXML private TableColumn<CardapioVO, String> colNomeCardapio;
	@FXML private TableColumn<CardapioVO, String> colNomePaciente;
	@FXML private TableColumn<CardapioVO, String> colData;
	
	private ObservableList<PacienteVO> pacientes;
	
	@Override
	protected void onModalInit() {
		pacientes = FXCollections.observableArrayList();
		List<PacienteVO> paciente = listarPaciente();
		pacientes.setAll(paciente);
		cmbPaciente.setItems(pacientes);
	}
	
	private List<PacienteVO> listarPaciente(){
		PacienteDAO dao = new PacienteDAO();
		List<PacienteVO> paciente = dao.listar();
		return paciente;
	}
	
	public void limpar(ActionEvent event) {
		cmbPaciente.getSelectionModel().clearSelection();
		tbCardapio.getSelectionModel().clearSelection();
	}
	
	public void cancelar(ActionEvent event) {
		closeModal();
	}
}
