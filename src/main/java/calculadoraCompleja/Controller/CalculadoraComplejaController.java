package calculadoraCompleja.Controller;

import calculadoraCompleja.Model.CalculadoraComplejaModel;
import calculadoraCompleja.View.CalculadoraComplejaView;
import calculadoraCompleja.utils.CalculadoraCompleja;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.util.converter.NumberStringConverter;

public class CalculadoraComplejaController {
	
	//view Done
	private CalculadoraComplejaView view = new CalculadoraComplejaView();
	
	//model Done
	
	private CalculadoraComplejaModel model = new CalculadoraComplejaModel();
	
	private StringProperty Selected_ComboBox = new SimpleStringProperty();
	
	private CalculadoraCompleja primerComplejo;
	
	private CalculadoraCompleja segundoComplejo;
	
	private CalculadoraCompleja resultado;
	
	public CalculadoraComplejaController() {
		
		//Bindings default sample -> bindBidirectional(view,model)
		Bindings.bindBidirectional(view.getOperator_ComboBox(),model.getOperator_comboBox());
		
		Bindings.bindBidirectional(view.getLeft_TextField_1().textProperty(),model.getLeft_TextField_1(),new NumberStringConverter());
		Bindings.bindBidirectional(view.getRight_TextField_1().textProperty(),model.getRight_TextField_1(),new NumberStringConverter());
		primerComplejo = new CalculadoraCompleja();
		
		Bindings.bindBidirectional(view.getLeft_TextField_2().textProperty(),model.getLeft_TextField_2(),new NumberStringConverter());
		Bindings.bindBidirectional(view.getRight_TextField_2().textProperty(),model.getRight_TextField_2(),new NumberStringConverter());
		segundoComplejo = new CalculadoraCompleja();
		
		Bindings.bindBidirectional(view.getLeft_TextField_3().textProperty(),model.getLeft_TextField_3(),new NumberStringConverter());
		Bindings.bindBidirectional(view.getRight_TextField_3().textProperty(),model.getRight_TextField_3(),new NumberStringConverter());
		view.getLeft_TextField_3().setDisable(true);
		view.getRight_TextField_3().setDisable(true);
		
		
		//Distintos setOnAction()
		view.getButton_equal().setOnAction(e -> Operations());
		
	}
	
	public void Operations() {
		view.getLeft_TextField_3().setDisable(false);
		view.getRight_TextField_3().setDisable(false);
		
		primerComplejo.setReal(model.getLeft_TextField_1().get());
		primerComplejo.setImaginario(model.getRight_TextField_1().get());
		
		segundoComplejo.setReal(model.getLeft_TextField_2().get());
		segundoComplejo.setImaginario(model.getRight_TextField_2().get());
		
		System.out.println(primerComplejo.toString());
		System.out.println(segundoComplejo.toString());
		switch(view.getOperator_ComboBox().get()) {
			case "+": 
				resultado = primerComplejo.add(segundoComplejo);
			break;
			case "-":
				resultado = primerComplejo.subtract(segundoComplejo);
			break;
			case "*":
				resultado = primerComplejo.multiply(segundoComplejo);
			break;
			case "/":
				resultado = primerComplejo.divide(segundoComplejo);
			break;
		}
		
		model.getLeft_TextField_3().set(resultado.getReal());
		model.getRight_TextField_3().set(resultado.getImaginario());
	}
	
	public CalculadoraComplejaView getView() {
		return view;
	}

}
