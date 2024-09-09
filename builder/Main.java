package aaa_examples.design_patterns.builder;

public class Main {

	public static void main(String[] args) {		
		Car car = new Car.Builder()
				.setId(1)
				.setBrand("BMW")
				.setType("X2")
				.setBodyWorkType("Sedan")
				.setNumberDoors(4)				
				.build();
		
		System.out.println("CAR Info");
		System.out.println(car.getId());
		System.out.println(car.getBrand());
		System.out.println(car.getType());
		System.out.println("Number of doors: " + car.getNumberDoors());
		System.out.println("Bodywork type: " + car.getBodyWorkType());
	}
	
	

}
