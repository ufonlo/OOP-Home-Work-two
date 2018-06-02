package JavaOOPHome.HomeWorld2.task1Menu;

public class MenuRunner {
    public static void main(String[] args) {
        Menu firstMenu = new Menu("First menu");
        Menu secondMenu = new Menu("Second menu");
        Dish oneDish = new Dish("Borch", "Smetana", 39);
        Dish twoDish = new Dish("Ragu", "Hleb", 40);
        Dish threeDish = new Dish("Sup", "lavash", 35);
        Dish foureDish = new Dish("Makaronu", "Kotleta", 20);

        firstMenu.addDish(oneDish);
        firstMenu.addDish(twoDish);
        firstMenu.addDish(foureDish);

        System.out.println(firstMenu.toString());
        System.out.println("Chipest is " + firstMenu.getCheapestDish().getName());

        secondMenu.addDish(twoDish);
        secondMenu.addDish(threeDish);
        secondMenu.addDish(foureDish);

        System.out.println(secondMenu.toString());
        System.out.println("Chipest is " + secondMenu.getCheapestDish().getName());

    }
}
