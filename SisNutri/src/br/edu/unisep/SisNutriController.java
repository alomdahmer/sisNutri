package br.edu.unisep;

import br.edu.unisep.fx.controller.AppController;

public class SisNutriController extends AppController{

	@Override
	protected void onInit() {
		// TODO Auto-generated method stub

	}

	public void cadastrarPaciente(){
		openModal("NovoPaciente.fxml");
	}

	public void cadastrarProfissional(){
		openModal("NovoProfissional.fxml");
	}

}
