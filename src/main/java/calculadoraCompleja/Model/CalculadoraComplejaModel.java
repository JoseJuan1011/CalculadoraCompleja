package calculadoraCompleja.Model;

import calculadoraCompleja.utils.ComplexDoubleProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class CalculadoraComplejaModel {
	
	private StringProperty Operator_comboBox;
	private DoubleProperty left_TextField_1;
	private DoubleProperty right_TextField_1;
	private DoubleProperty left_TextField_2;
	private DoubleProperty right_TextField_2;
	private DoubleProperty left_TextField_3;
	private DoubleProperty right_TextField_3;
	
	public CalculadoraComplejaModel() {
		Operator_comboBox = new SimpleStringProperty();
		left_TextField_1 = new ComplexDoubleProperty();
		right_TextField_1 = new ComplexDoubleProperty();
		left_TextField_2 = new ComplexDoubleProperty();
		right_TextField_2 = new ComplexDoubleProperty();
		left_TextField_3 = new ComplexDoubleProperty();
		right_TextField_3 = new ComplexDoubleProperty();
	}
	
	//Operator_ComboBox
	
	public StringProperty getOperator_comboBox() {
		return Operator_comboBox;
	}

	public void setOperator_comboBox(StringProperty operator_comboBox) {
		Operator_comboBox = operator_comboBox;
	}
	
	//Left_TextField_1

	public DoubleProperty getLeft_TextField_1() {
		return left_TextField_1;
	}

	public void setLeft_TextField_1(DoubleProperty left_TextField_1) {
		this.left_TextField_1 = left_TextField_1;
	}

	//right_TextField_1
	public DoubleProperty getRight_TextField_1() {
		return right_TextField_1;
	}

	public void setRight_TextField_1(DoubleProperty right_TextField_1) {
		this.right_TextField_1 = right_TextField_1;
	}
	
	//Left_TextField_2
	public DoubleProperty getLeft_TextField_2() {
		return left_TextField_2;
	}

	public void setLeft_TextField_2(DoubleProperty left_TextField_2) {
		this.left_TextField_2 = left_TextField_2;
	}

	//Right_TextField_2
	public DoubleProperty getRight_TextField_2() {
		return right_TextField_2;
	}


	public void setRight_TextField_2(DoubleProperty right_TextField_2) {
		this.right_TextField_2 = right_TextField_2;
	}

	//Left_TextField_3
	public DoubleProperty getLeft_TextField_3() {
		return left_TextField_3;
	}


	public void setLeft_TextField_3(DoubleProperty left_TextField_3) {
		this.left_TextField_3 = left_TextField_3;
	}

	//Right_TextField_3
	public DoubleProperty getRight_TextField_3() {
		return right_TextField_3;
	}


	public void setRight_TextField_3(DoubleProperty right_TextField_3) {
		this.right_TextField_3 = right_TextField_3;
	}
}
