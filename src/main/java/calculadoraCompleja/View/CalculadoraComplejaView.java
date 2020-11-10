package calculadoraCompleja.View;

import calculadoraCompleja.utils.ImaginativeLabel;
import calculadoraCompleja.utils.Label_Sum;
import calculadoraCompleja.utils.TextField_Operator;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Separator;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class CalculadoraComplejaView extends HBox{
	
	private VBox SecundarioVBox_comboBox;
	private VBox SecundarioVBox_Operation;
	private VBox SecundarioVBox_Equal;
	
	private ComboBox<String> Operator_ComboBox;
	private HBox Separator_Operation_HBox_1;
	private HBox Separator_Operation_HBox_2;
	private Separator separator_H;
	private HBox Separator_Operation_HBox_3;
	
	private Button button_equal;
	
	private TextField_Operator left_TextField_1;
	private TextField_Operator right_TextField_1;
	private TextField_Operator left_TextField_2;
	private TextField_Operator right_TextField_2;
	private TextField_Operator left_TextField_3;
	private TextField_Operator right_TextField_3;
	
	public CalculadoraComplejaView() {
		super();
		
		//Primer VBox
		Operator_ComboBox= new ComboBox<String>();
		Operator_ComboBox.getItems().addAll("+","-","*","/");
		Operator_ComboBox.getSelectionModel().selectFirst();
		
		//Segundo VBox
		//Primer HBox dentro de VBox
		left_TextField_1 = new TextField_Operator();
		right_TextField_1 = new TextField_Operator();
		
		Separator_Operation_HBox_1 = new HBox();
		Separator_Operation_HBox_1.setAlignment(Pos.BASELINE_CENTER);
		Separator_Operation_HBox_1.setSpacing(5);
		Separator_Operation_HBox_1.getChildren().addAll(left_TextField_1,new Label_Sum(),right_TextField_1,new ImaginativeLabel());
		
		//Segundo HBox dentro de VBox
		left_TextField_2 = new TextField_Operator();
		right_TextField_2 = new TextField_Operator();
		
		Separator_Operation_HBox_2 = new HBox();
		Separator_Operation_HBox_2.setAlignment(Pos.BASELINE_CENTER);
		Separator_Operation_HBox_2.setSpacing(5);
		Separator_Operation_HBox_2.getChildren().addAll(left_TextField_2,new Label_Sum(),right_TextField_2,new ImaginativeLabel());
		
		//Separator dentro de VBox
		separator_H= new Separator();
		
		//Tercero HBox dentro de VBox
		left_TextField_3= new TextField_Operator();
		left_TextField_3.setEditable(false);
		
		right_TextField_3 = new TextField_Operator();
		right_TextField_3.setEditable(false);
		
		Separator_Operation_HBox_3 = new HBox();
		Separator_Operation_HBox_3.setAlignment(Pos.BASELINE_CENTER);
		Separator_Operation_HBox_3.setSpacing(5);
		Separator_Operation_HBox_3.getChildren().addAll(left_TextField_3,new Label_Sum(),right_TextField_3,new ImaginativeLabel());
		
		//Botón Igual
		button_equal= new Button("=");
		
		//Declarando las VBox
		SecundarioVBox_comboBox= new VBox();
		SecundarioVBox_comboBox.setAlignment(Pos.CENTER);
		SecundarioVBox_comboBox.getChildren().addAll(Operator_ComboBox);
		
		SecundarioVBox_Operation= new VBox();
		SecundarioVBox_Operation.setAlignment(Pos.CENTER);
		SecundarioVBox_Operation.setSpacing(5);
		SecundarioVBox_Operation.getChildren().addAll(Separator_Operation_HBox_1,Separator_Operation_HBox_2,Separator_Operation_HBox_3);
		
		SecundarioVBox_Equal= new VBox();
		SecundarioVBox_Equal.setAlignment(Pos.CENTER);
		SecundarioVBox_Equal.setSpacing(5);
		SecundarioVBox_Equal.getChildren().addAll(button_equal);
		
		setSpacing(5);
		setAlignment(Pos.CENTER);
		getChildren().addAll(SecundarioVBox_comboBox,SecundarioVBox_Operation,SecundarioVBox_Equal);
	}

	public StringProperty getOperator_ComboBox() {
		StringProperty aux = new SimpleStringProperty();
		aux.set(Operator_ComboBox.getValue());
		return aux;
	}

	public void setOperator_ComboBox(ComboBox<String> operator_ComboBox) {
		Operator_ComboBox = operator_ComboBox;
	}

	public TextField_Operator getLeft_TextField_1() {
		return left_TextField_1;
	}

	public void setLeft_TextField_1(TextField_Operator left_TextField_1) {
		this.left_TextField_1 = left_TextField_1;
	}

	public TextField_Operator getRight_TextField_1() {
		return right_TextField_1;
	}

	public void setRight_TextField_1(TextField_Operator right_TextField_1) {
		this.right_TextField_1 = right_TextField_1;
	}

	public TextField_Operator getLeft_TextField_2() {
		return left_TextField_2;
	}

	public void setLeft_TextField_2(TextField_Operator left_TextField_2) {
		this.left_TextField_2 = left_TextField_2;
	}

	public TextField_Operator getRight_TextField_2() {
		return right_TextField_2;
	}

	public void setRight_TextField_2(TextField_Operator right_TextField_2) {
		this.right_TextField_2 = right_TextField_2;
	}

	public TextField_Operator getLeft_TextField_3() {
		return left_TextField_3;
	}

	public void setLeft_TextField_3(TextField_Operator left_TextField_3) {
		this.left_TextField_3 = left_TextField_3;
	}

	public TextField_Operator getRight_TextField_3() {
		return right_TextField_3;
	}

	public void setRight_TextField_3(TextField_Operator right_TextField_3) {
		this.right_TextField_3 = right_TextField_3;
	}

	public Button getButton_equal() {
		return button_equal;
	}
	
}
