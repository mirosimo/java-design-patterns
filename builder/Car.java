package aaa_examples.design_patterns.builder;

public class Car {
	private final int id;
	private final String brand;
	private final String type;
	private final int numberDoors;
	private final String bodyWorkType;
	
	public Car(Builder builder) {
		this.id = builder.id;
		this.brand = builder.brand;
		this.type = builder.type;
		this.numberDoors = builder.numberDoors;
		this.bodyWorkType = builder.bodyWorkType;
	}
	
	/*public static Builder builder() {
		return new Builder();
	}*/
	
	public static class Builder {
		private int id;
		private String brand;
		private String type;
		private int numberDoors;
		private String bodyWorkType;
		
		public Builder setId(int id) {
			this.id = id;
			return this;
		}
		
		public Builder setBrand(String brand) {
			this.brand = brand;
			return this;
		}
		
		public Builder setType(String type) {
			this.type = type;
			return this;
		}
		
		public Builder setNumberDoors(int numberDoors) {
			this.numberDoors = numberDoors;
			return this;
		}
		
		public Builder setBodyWorkType(String bodyWorkType) {
			this.bodyWorkType = bodyWorkType;
			return this;
		}
		
		public Car build() {
			return new Car(this);
		}
		
	}
	
	
	/* Getters ... */
	public int getId() {
		return id;
	}

	public String getBrand() {
		return brand;
	}

	public String getType() {
		return type;
	}

	public int getNumberDoors() {
		return numberDoors;
	}

	public String getBodyWorkType() {
		return bodyWorkType;
	}
	
}
