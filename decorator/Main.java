package aaa_examples.design_patterns.decorator;

public class Main {

	public static void main(String[] args) {
		Car_I carVariant_1 = new RoofBox(new LuggageRack(new Car()));
		String txt = carVariant_1.addCarAccessory();
		System.out.println(txt);
	}

}
