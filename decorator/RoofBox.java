package aaa_examples.design_patterns.decorator;

public class RoofBox extends CarDecorator {
	public RoofBox(Car_I carAccessory) {
		super(carAccessory);
	}
	
	public String addCarAccessory() {		 
		return super.addCarAccessory() + this.addRoofBox();
	}
	
	private String addRoofBox() {
		return "Adding Roof Box ";
	}
}
