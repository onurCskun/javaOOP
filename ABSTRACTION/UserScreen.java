package ABSTRACTION;

public class UserScreen {
	public void show(Car[] cars) {
		for (int i = 0; i < cars.length; i++) {
			Car car = cars[i];
			System.out.println("Mass : " + car.getMass());
			System.out.println("Color : " + car.getColor());
			System.out.println("Speed : " + car.getSpeed());
			System.out.println("Gear : " + car.getGear());
			System.out.println("Gasoline consumed per hour : " + car.gasolineConsumedPH());
		}
	}
}
