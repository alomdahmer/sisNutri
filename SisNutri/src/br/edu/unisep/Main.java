package br.edu.unisep;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("SisNutri.fxml"));
			Scene scene = new Scene(root);
			//Image imageAplication = new Image(getClass().getResourceAsStream("br.edu.unisep.img/Icone.png"));
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			//primaryStage.getIcons().add(imageAplication);
			primaryStage.setResizable(false);
			primaryStage.setTitle("SisNutri");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
