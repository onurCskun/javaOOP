package INTERFACE;

public class RunMusic {
	public static void main(String[] args){
		Music m1 = new Rock();
		Music m2 = new House();
		Music m3 = new Pop();
		System.out.println("m1 : " + m1.getMusicType() + "\n" + "m2 : " + m2.getMusicType() + "\n" + "m3 : " + m3.getMusicType());
	}
}