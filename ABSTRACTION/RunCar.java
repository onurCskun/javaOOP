package ABSTRACTION;

public class RunCar {

	public static void main(String[] args) {
		Car ford = new Ford();
		ford.setMass(1000);
		ford.setColor("Red");
		ford.setSpeed(120);
		ford.setGear(3);
		
		Car mercedes = new Mercedes();
		mercedes.setMass(1500);
		mercedes.setColor("black");
		mercedes.setSpeed(150);
		mercedes.setGear(5);
		
		Car cars[] = new Car[] {ford,mercedes};
        UserScreen screen = new UserScreen();
        screen.show(cars);
	}
}
