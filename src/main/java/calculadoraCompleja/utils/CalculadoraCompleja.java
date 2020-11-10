package calculadoraCompleja.utils;
import javafx.beans.property.DoubleProperty;

public class CalculadoraCompleja {

	private DoubleProperty real = new ComplexDoubleProperty();
	private DoubleProperty imaginario = new ComplexDoubleProperty();
	
	public CalculadoraCompleja() {}
	
	public CalculadoraCompleja(double real, double imaginario) {
		super();
		setReal(real);
		setImaginario(imaginario);
	}

	public final DoubleProperty realProperty() {
		return this.real;
	}

	public final double getReal() {
		return this.realProperty().get();
	}

	public final void setReal(final double real) {
		this.realProperty().set(real);
	}

	public final DoubleProperty imaginarioProperty() {
		return this.imaginario;
	}

	public final double getImaginario() {
		return this.imaginarioProperty().get();
	}

	public final void setImaginario(final double imaginario) {
		this.imaginarioProperty().set(imaginario);
	}
	
	@Override
	public String toString() {
		return getReal() + "+" + getImaginario() + "i";
	}
	
	public CalculadoraCompleja add(CalculadoraCompleja c) {
		CalculadoraCompleja r = new CalculadoraCompleja();
		r.realProperty().bind(realProperty().add(c.realProperty()));
		r.imaginarioProperty().bind(imaginarioProperty().add(c.imaginarioProperty()));
		return r;
	}
	
	public CalculadoraCompleja subtract(CalculadoraCompleja c) {
		CalculadoraCompleja r = new CalculadoraCompleja();
		r.realProperty().bind(realProperty().subtract(c.realProperty()));
		r.imaginarioProperty().bind(imaginarioProperty().subtract(c.imaginarioProperty()));
		return r;
	}
	
	public CalculadoraCompleja multiply(CalculadoraCompleja c) {
		CalculadoraCompleja r = new CalculadoraCompleja();
		
		DoubleProperty ac = new ComplexDoubleProperty();
		DoubleProperty bd = new ComplexDoubleProperty();
		DoubleProperty ad = new ComplexDoubleProperty();
		DoubleProperty cb = new ComplexDoubleProperty();
		
		DoubleProperty i = new ComplexDoubleProperty();
		DoubleProperty real = new ComplexDoubleProperty();
		
		//First Step
		ac.bind(realProperty().multiply(c.realProperty()));
		bd.bind(imaginarioProperty().multiply(c.imaginarioProperty()).multiply(-1));
		ad.bind(realProperty().multiply(c.imaginarioProperty()));
		cb.bind(imaginarioProperty().multiply(c.realProperty()));
		
		//Second Step
		real.bind(ac.add(bd));
		i.bind(ad.add(cb));
		
		//Third Step
		r.setReal(real.get());
		r.setImaginario(i.get());
		
		return r;
	}
	
	public CalculadoraCompleja divide(CalculadoraCompleja c) {
		CalculadoraCompleja r = new CalculadoraCompleja();
		
		CalculadoraCompleja dividendo;
		Double divisor;
		
		CalculadoraCompleja multiplicado = new CalculadoraCompleja(c.getReal(),-c.getImaginario());
		
		dividendo = this.multiply(multiplicado);
		divisor = (multiplicado.getReal()*multiplicado.getReal())+(multiplicado.getImaginario()*multiplicado.getImaginario());
		
		r.setReal(dividendo.getReal()/divisor);
		r.setImaginario(dividendo.getImaginario()/divisor);
		
		return r;
	}
	
	
	public static void main(String[] args) {
		CalculadoraCompleja a = new CalculadoraCompleja(3, 2);
		CalculadoraCompleja b = new CalculadoraCompleja(1, 2);
		
		CalculadoraCompleja c = a.divide(b);
		
		System.out.println(c.toString());		
		
	}

}