package objectExercise;

public class Property {
	private String name;
	private String ownerNames;
	private String type;
	private int price;

	Property(String name, String ownerNames, String type, int price) {
		this.name = name;
		this.ownerNames = ownerNames;
		this.type = type;
		this.price = price;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwnerNames() {
		return this.ownerNames;
	}

	public void setOwnerNames(String ownerNames) {
		this.ownerNames = ownerNames;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void greeting() {
	    System.out.println("=============================");
		System.out.println("物件名：" + this.name);
		System.out.println("物件所有者名：" + this.ownerNames);
		System.out.println("物件種別：" + this.type);
		System.out.println("物件価格：" + this.price + "円");
	}

}
