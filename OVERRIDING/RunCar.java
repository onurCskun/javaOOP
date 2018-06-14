package OVERRIDING;

public class RunCar {

	public static void main(String[] args) {
		Car c = new Car("Grey", "2016");
		System.out.println(c.getName() + " " + c.getColor() + " " + c.getModel() + " " + c.gearType() + " " + c.fuelType());
		Opel a = new Opel("Black", "2015");
		System.out.println(a.getName() + " " + a.getColor() + " " + a.getModel() + " " + a.gearType() + " " + a.fuelType());
		Fiat b = new Fiat("Red", "2014");
		System.out.println(b.getName() + " " + b.getColor() + " " + b.getModel() + " " + b.gearType() + " "  + b.fuelType());
	}

}
