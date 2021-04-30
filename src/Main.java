
public class Main {

	public static void main(String[] args) {
		
		// Chefs id, age, name, surname, salary
		
		Chefs chef1 = new Chefs("C01", 32, "Mustafa", "Eligüzel", 3750);
		Chefs chef2 = new Chefs("C02", 43, "Ali Faik", "Kamberli", 4490);
		Chefs chef3 = new Chefs("C03", 28, "Şükrü", "Erguvan", 2980);
		Chefs chef4 = new Chefs("C04", 53, "Kamil", "Dörtdivan", 6125);
		
		// Meals id, cookingTime, category, name, price

		Meals food1 = new Meals("F01", 90, "Food", "Karnıyarık", 45);
		Meals food2 = new Meals("F02", 120, "Food", "Kuru Fasülye", 30);
		Meals food3 = new Meals("F03", 60, "Food", "Tepsi Kebabı", 120);
		
		Meals dessert1 = new Meals("D01", 30, "Dessert", "Künefe", 90.5);
		Meals dessert2 = new Meals("D02", 70, "Dessert", "Fıstıklı Baklava", 170);
		Meals dessert3 = new Meals("D03", 20, "Dessert", "Güllaç", 50.25);
		
		Meals soup1 = new Meals("S01", 65, "Soup", "Mercimek Çorbası", 25);
		Meals soup2 = new Meals("S02", 115, "Soup", "Kelle Paça", 45);
		Meals soup3 = new Meals("S03", 85, "Soup", "Düğün Çorbası", 37.5);
		
		Chefs[] chefs = {chef1, chef2, chef3, chef4};
		Meals[] foods = {food1, food2, food3};
		Meals[] desserts = {dessert1, dessert2, dessert3};
		Meals[] soups = {soup1, soup2, soup3};
		
		FoodManager foodManager = new FoodManager();
		foodManager.cookMeal(food1);
		foodManager.orderMeal(dessert3, chef1);
		
		System.out.println("\n" + "********** NE VEREYİM ABİME... **********");
		
		System.out.println("\n" + "YEMEKLER:");
		for (Meals food : foods) {
			System.out.println(food.id + ". " + food.name + ", Pişme Süresi: " + food.cookingTime + " dk."
					+ " - " + food.price + " TL");
		}
		
		System.out.println("\n" + "TATLILAR:");
		for (Meals dessert : desserts) {
			System.out.println(dessert.id + ". " + dessert.name + ", Pişme Süresi: " + dessert.cookingTime + " dk."
					+ " - " + dessert.price + " TL");
		}
		
		System.out.println("\n" + "ÇORBALAR:");
		for (Meals soup : soups) {
			System.out.println(soup.id + ". " + soup.name + ", Pişme Süresi: " + soup.cookingTime + " dk."
					+ " - " + soup.price + " TL");
		}
		
	}

}
