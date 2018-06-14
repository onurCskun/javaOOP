package ABSTRACTION;

abstract class Car { 
	private int mass;
    private  String color;
    private  int speed;
    private  int gear;
    
    public int getMass() {
    	return mass;
    }
    public void setMass(int newMass) {
    	mass = newMass;
    }
    public String getColor() {
    	return color;
    }
    public void setColor(String newColor) {
         color = newColor;
    }
    public int getGear() {
    	return gear;
    }
    public void setGear(int newGear) {
         gear = newGear;
    }
    public int getSpeed() {
    	return speed;
    }                                                  
    public void setSpeed(int newSpeed) {
    	speed = newSpeed;
    }
    public abstract int gasolineConsumedFactor();
    //Gasoline consumed per hour
    public int gasolineConsumedPH() {
    	 return getMass()*gasolineConsumedFactor();
    }
}
