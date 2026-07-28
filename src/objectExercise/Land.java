package objectExercise;

public class Land extends Property {
	private double area;

	Land(String name, String ownerNames, String type, int price, double area) {
		super(name, ownerNames, type, price);
		this.area = area;
	}

	public double getArea() {
		return this.area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public void greeting() {
		super.greeting();
		System.out.println("広さ：" + this.area + "㎡");
	    System.out.println("=============================");
	}
}
