package INHERITANCE;

public class RunBox {

	public static void main(String[] args) {
		BoxQuality box = new BoxQuality();
		box.setBox("cartboard",1,1,2);
		box.CalculateV();
		System.out.println(box.material);
		
		BoxQuality box2 = new BoxQuality();
		box2.setBox("glass", 0.2, 0.2, 0.2);
		box2.CalculateV();
		System.out.println(box2.material);
		System.out.println(
					"sdfhdfh " + box2.x + "sdfhsdfhsdf " + box2.y + " dsfhşsdfh  " + box2.material + " sdg "
				);
	}

}
