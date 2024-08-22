package aaa_examples.design_patterns.decorator;

public class LuggageRack extends CarDecorator {

	public LuggageRack(Car_I carElement) {
		super(carElement);
	}
	
	public String addCarAccessory() {		 
		return super.addCarAccessory() + this.addLuggageRack();
	}
	
	private String addLuggageRack() {
		return "Adding Luggage Rack ";
	}
}
