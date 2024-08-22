package aaa_examples.design_patterns.decorator;

public class BycycleRack extends CarDecorator {
	public BycycleRack(Car_I carElement) {
		super(carElement);
	}
	
	public String addCarAccessory() {		 
		return super.addCarAccessory() + this.addBycycleRack();
	}
	
	private String addBycycleRack() {
		return "Adding Bycycle Rack ";
	}
}
