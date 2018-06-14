package OVERRIDING;
public class Car {
	protected String name = "Mercedes";
	private String color;
	private String model;
	public Car(String color, String model){
		this.setColor(color);
		this.setModel(model);
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String fuelType(){
		return "Gasoline";
	}
	public String gearType(){
		return "Auto";
	}
	public String getName() {
		return name;
	}
	
}
