package aaa_examples.design_patterns.decorator;

/*
 * Each car accessory class extends this class.
 * Instance of this class is container for next car accessory.
 * 
 * */
public abstract class CarDecorator implements Car_I {
	
	private Car_I carAccessory;
	
	public CarDecorator(Car_I carAccessory) {
		this.carAccessory = carAccessory;
	}
	
	@Override
	public String addCarAccessory() {
		return carAccessory.addCarAccessory();
	}

}
