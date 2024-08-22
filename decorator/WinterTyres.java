package aaa_examples.design_patterns.decorator;

public class WinterTyres extends CarDecorator {
	public WinterTyres(Car_I carAccessory) {
		super(carAccessory);
	}
	
	public String addCarAccessory() {		 
		return super.addCarAccessory() + this.addWinterTyres();
	}
	
	private String addWinterTyres() {
		return "Adding Winter Tyres ";
	}
}
