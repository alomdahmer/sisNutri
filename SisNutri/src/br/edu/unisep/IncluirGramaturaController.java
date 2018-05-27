package br.edu.unisep;

import com.jfoenix.controls.JFXTextField;

import br.edu.unisep.fx.controller.ModalController;
import br.edu.unisep.model.vo.AlimentoCardapioVO;
import javafx.fxml.FXML;

public class IncluirGramaturaController extends ModalController {
	@FXML private JFXTextField txtGramatura;
	private AlimentoCardapioVO origem;

	@Override
	protected void onModalInit() {
		
	}
	
	private AlimentoCardapioVO retornar(AlimentoCardapioVO alimento) {
		
		
		return alimento; 
	}

	public AlimentoCardapioVO getOrigem() {
		return origem;
	}

	public void setOrigem(AlimentoCardapioVO origem) {
		this.origem = origem;
	}

	public JFXTextField getTxtGramatura() {
		return txtGramatura;
	}

	public void setTxtGramatura(JFXTextField txtGramatura) {
		this.txtGramatura = txtGramatura;
	}
	
}
