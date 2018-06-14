package OVERRIDING;

public class Opel extends Car {
	public Opel(String color, String model) {
		super(color, model);
		name = "Opel";
	}
	
	@Override
	public String fuelType(){
		return "Diesel";
	}
}
