public class BurgerTester {
    public static void main(String[] args) {
        BurgerTools burger = new BurgerTools();
        burger.mostPopularTopping = "cheese";
        burger.averageDaysBeforeExpiration = 60;
        burger.temperatureWhenCooked = 220;

        System.out.println(burger.mostPopularTopping);
        System.out.println(burger.averageDaysBeforeExpiration);
        System.out.println(burger.temperatureWhenCooked);

        burger.grill();
    }
}
