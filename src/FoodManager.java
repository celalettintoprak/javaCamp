public class FoodManager {
	
	public void cookMeal(Meals meal) {
		
		System.out.println("\n" + "********** SİPARİŞ DURUMU **********");
		
		if (meal.category == "Food") {
			System.out.println(meal.name + " yemeğiniz pişirildi...");
		}
		else if (meal.category == "Dessert") {
			System.out.println(meal.name + " tatlınız hazırlandı...");
		}
		else if (meal.category == "Soup") {
			System.out.println(meal.name + " çorbanız pişirildi...");
		}
		else {
			System.out.println(meal.name + " siparişiniz hazırlanmıştır. Afiyet olsun...");
		}
	}
	
	public void orderMeal(Meals meal, Chefs chef) {
		
		System.out.println("\n" + "********** YENİ SİPARİŞ **********");
		System.out.println(meal.name + " siparişiniz alınmıştır. "
		+ chef.name + " " + chef.surname + " ustamız en kısa sürede siparişinizi hazırlayacaktır...");
		
	}
	
}