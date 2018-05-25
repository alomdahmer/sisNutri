package br.edu.unisep;

import br.edu.unisep.fx.controller.AppController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class SisNutriController extends AppController{

	@FXML private Button btnFechar;
	
	@Override
	protected void onInit() {
		// TODO Auto-generated method stub
	}

	public void cadastrarPaciente(){
		openModal("NovoPaciente.fxml",null);
	}

	public void cadastrarProfissional(){
		openModal("NovoProfissional.fxml",null);
	}
	
	public void fecharJanela() {
		Stage stage = (Stage) btnFechar.getScene().getWindow();
		stage.close();
	}

}
