public class Meals {
	int cookingTime;
	String id, category, name;
	double price;
	
	public Meals() {
		
	}
	
	public Meals(String id, int cookingTime, String category, String name, double price) {
		super();
		this.id = id;
		this.cookingTime = cookingTime;
		this.category = category;
		this.name = name;
		this.price = price;
	}
}