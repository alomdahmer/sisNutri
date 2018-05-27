package br.edu.unisep;

import java.util.List;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXTextField;
import br.edu.unisep.fx.annotation.OnlyNumber;
import br.edu.unisep.fx.controller.ModalController;
import br.edu.unisep.model.dao.AlimentoDAO;
import br.edu.unisep.model.dao.NutricionistaDAO;
import br.edu.unisep.model.dao.PacienteDAO;
import br.edu.unisep.model.vo.AlimentoVO;
import br.edu.unisep.model.vo.CardapioVO;
import br.edu.unisep.model.vo.AlimentoCardapioVO;
import br.edu.unisep.model.vo.NutricionistaVO;
import br.edu.unisep.model.vo.PacienteVO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;

public class ConstruirCardapioController extends ModalController {

	@FXML private JFXComboBox<PacienteVO> cmbPaciente;
	@FXML private JFXComboBox<NutricionistaVO> cmbNutricionista;
	@FXML private JFXDatePicker dtdata;
	
	@FXML private JFXTextField txtnome;
	@OnlyNumber(isDecimal=true, allowsNegative=false, decimalCount=2)
	@FXML private JFXTextField txtenergia;
	@OnlyNumber(isDecimal=true, allowsNegative=false, decimalCount=2)
	@FXML private JFXTextField txttoleranciaEnergia;
	@OnlyNumber(isDecimal=true, allowsNegative=false, decimalCount=2)
	@FXML private JFXTextField txtlipidios;
	@OnlyNumber(isDecimal=true, allowsNegative=false, decimalCount=2)
	@FXML private JFXTextField txttoleranciaLipidios;
	@OnlyNumber(isDecimal=true, allowsNegative=false, decimalCount=2)
	@FXML private JFXTextField txtcarboidratos;
	@OnlyNumber(isDecimal=true, allowsNegative=false, decimalCount=2)
	@FXML private JFXTextField txttoleranciaCarboidratos;
	@OnlyNumber(isDecimal=true, allowsNegative=false, decimalCount=2)
	@FXML private JFXTextField txtproteinas;
	@OnlyNumber(isDecimal=true, allowsNegative=false, decimalCount=2)
	@FXML private JFXTextField txttoleranciaProteinas;
	
	@FXML private JFXListView<AlimentoVO> listAlimento;
	@FXML private TableView<AlimentoVO> tblAlimento;
	@FXML private Label lblEnergia;
	@FXML private Label lblCarboidrato;
	@FXML private Label lblLipidios;
	@FXML private Label lblProteinas;
	@FXML private Label lblAlerta;
	
	private ObservableList<PacienteVO> pacientes;
	private ObservableList<NutricionistaVO> nutricionistas;
	private ObservableList<AlimentoVO> alimentos;
	private ObservableList<AlimentoCardapioVO> alimentoCardapio;
	
	CardapioVO cardapio = new CardapioVO();
	
	@Override
	protected void onModalInit() {
		pacientes = FXCollections.observableArrayList();
		nutricionistas = FXCollections.observableArrayList();
		alimentos = FXCollections.observableArrayList();
		List<PacienteVO> paciente = listarPaciente();
		List<NutricionistaVO> nutricionista = listarNutricionista();
		List<AlimentoVO> alimento = listarAlimentos();
		pacientes.setAll(paciente);
		cmbPaciente.setItems(pacientes);
		nutricionistas.setAll(nutricionista);
		cmbNutricionista.setItems(nutricionistas);
		alimentos.setAll(alimento);
		listAlimento.setItems(alimentos);
	}
	
	private List<PacienteVO> listarPaciente(){
		PacienteDAO dao = new PacienteDAO();
		List<PacienteVO> paciente = dao.listar();
		return paciente;
	}
	
	private List<NutricionistaVO> listarNutricionista(){
		NutricionistaDAO dao = new NutricionistaDAO();
		List<NutricionistaVO> nutricionista = dao.listar();
		return nutricionista;
	}
	
	private List<AlimentoVO> listarAlimentos(){
		AlimentoDAO dao = new AlimentoDAO();
		List<AlimentoVO> alimentos = dao.listar();
		return alimentos;
	}
	
	public void limparTela() {
		cmbPaciente.getSelectionModel().clearSelection();
		cmbNutricionista.getSelectionModel().clearSelection();
		dtdata.setValue(null);
		txtenergia.clear();
		txttoleranciaEnergia.clear();
		txtlipidios.clear();
		txttoleranciaLipidios.clear();
		txtcarboidratos.clear();
		txttoleranciaCarboidratos.clear();
		txtproteinas.clear();
		txttoleranciaProteinas.clear();
		tblAlimento.setItems(null);
		lblEnergia.setText("");
		lblCarboidrato.setText("");
		lblLipidios.setText("");
		lblProteinas.setText("");
		lblAlerta.setText("");
	}
	
	public void dragStart(MouseEvent event) {
		Dragboard db = listAlimento.startDragAndDrop(TransferMode.MOVE);
		ClipboardContent content = new ClipboardContent();
		content.putString(String.valueOf(listAlimento.getSelectionModel().getSelectedIndex()));
		db.setContent(content);
		event.consume();
	}
	
	public void dragOver(DragEvent event) {
		event.acceptTransferModes(TransferMode.MOVE);
		event.consume();
	}
	
	public void dragDrop(DragEvent event) {
		Dragboard db = event.getDragboard();
		int pos = Integer.parseInt(db.getString());
		AlimentoVO alimento = alimentos.remove(pos); //remoção ocorre a partir do observableList
		
		//Cria um objeto ExercícioVO para associar o exercício ao treino
		AlimentoCardapioVO aliCard = new AlimentoCardapioVO();
		aliCard.setAlimento(alimento);
		aliCard.setCardapio(cardapio);
		
		alimentoCardapio.add(aliCard);
		cardapio.getAlimentos().add(aliCard);
		openModal("IncluirGramatura.fxml", null);
	}
	
	public void cancelar() {
		closeModal();
	}

}
