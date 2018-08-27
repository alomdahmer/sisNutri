package br.edu.unisep;

import br.edu.unisep.fx.controller.AppController;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.Window;

public class SisNutriController extends AppController{

	@FXML private Button btnFechar;
	Stage stage;

	@Override
	protected void onInit() {

	}

	public void cadastrarPaciente(){
		openModal("NovoPaciente.fxml");
	}

	public void cadastrarProfissional(){
		openModal("NovoProfissional.fxml");
	}

	public void construirCardapio() {
		openModal("ConstruirCardapio.fxml");
	}

	public void buscarCardapio() {
		openModal("BuscarCardapio.fxml");
	}

	public void fecharJanela() {
		stage = (Stage) btnFechar.getScene().getWindow();
		stage.close();
	}

	public void minimizarJanela() {
		stage.setIconified(true);
	}

}
