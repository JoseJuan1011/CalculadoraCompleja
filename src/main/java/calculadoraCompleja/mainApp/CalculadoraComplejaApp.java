package calculadoraCompleja.mainApp;

import calculadoraCompleja.Controller.CalculadoraComplejaController;
import calculadoraCompleja.View.CalculadoraComplejaView;
import calculadoraCompleja.utils.ImaginativeLabel;
import calculadoraCompleja.utils.Label_Sum;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CalculadoraComplejaApp extends Application {
	
	//view Done
	
	//Model Done
	
	//Controller
	CalculadoraComplejaController controller;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		controller = new CalculadoraComplejaController();
		
		Scene scene = new Scene(controller.getView(), 420, 200);
		
		primaryStage.setTitle("Cambio de Divisa");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
