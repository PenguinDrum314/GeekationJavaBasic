package objectExercise;

public class Apartment extends Property {
	private int layout;

	Apartment(String name, String ownerNames, String type, int price, int layout) {
		super(name, ownerNames, type, price);
		this.layout = layout;
	}

	public int getLayout() {
		return this.layout;
	}

	public void setLayout(int layout) {
		this.layout = layout;
	}

	public void greeting() {
		super.greeting();
		System.out.println("間取り：" + this.layout + "LDK");
	    System.out.println("=============================");
	}
}
