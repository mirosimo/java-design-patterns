package aaa_examples.design_patterns.decorator;

public abstract class CarDecorator implements Car_I {
	public static String param;
	private Car_I additionalElement;
	
	public CarDecorator(Car_I additionalElement) {
		this.additionalElement = additionalElement;
	}
	
	@Override
	public String addCarAccessory() {
		return additionalElement.addCarAccessory();
	}

}
