public class RestaurantTest {
    public static void main(String[] args) {
        RestaurantDish dish = new RestaurantDish();
        dish.costInCents = 5000;
        dish.nameOfDish = "Salad Suprise";
        dish.wouldRecommend = true;

        System.out.println(dish.costInCents);
        System.out.println(dish.nameOfDish);
        System.out.println(dish.wouldRecommend);

        dish.eat();
    }
}
