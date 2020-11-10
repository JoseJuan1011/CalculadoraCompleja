package calculadoraCompleja.utils;

import javafx.beans.property.SimpleDoubleProperty;

public class ComplexDoubleProperty extends SimpleDoubleProperty {

	public ComplexDoubleProperty() {
		// TODO Auto-generated constructor stub
	}

	public ComplexDoubleProperty(double initialValue) {
		super(initialValue);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void set(double value){
        if (value<=0) {
        	super.set(value);
        }
        else if (value>0) {
        	super.set(value);
        }
    }
	
	@Override
	public void setValue(Number value){
		if (value.doubleValue()<=0) {
        	super.set(value.doubleValue());
        }
        else if (value.doubleValue()>0) {
        	super.set(value.doubleValue());
        }
	}

}
