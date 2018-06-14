package OVERRIDING;

public class Fiat extends Car{
	public Fiat(String color, String model) {
		super(color, model);
		name = "Fiat";
	}
	
	@Override
	public String gearType(){
		return "Manuel";
	}
}
