package acorn;

public class Food {

	String name;
	String price;
	
	
	
	
	public Food(String name, String price) {
		super();
		this.name = name;
		this.price = price;
	}


	String getName() {
		return name;
	}


	void setName(String name) {
		this.name = name;
	}


	String getPrice() {
		return price;
	}


	void setPrice(String price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Food [name=" + name + ", price=" + price + "]";
	}


}

