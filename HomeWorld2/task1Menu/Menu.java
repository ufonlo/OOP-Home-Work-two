package JavaOOPHome.HomeWorld2.task1Menu;

import java.util.ArrayList;

public class Menu {
    private final String name;
    private final ArrayList<Dish> dishes = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public Dish getCheapestDish() {
        int chipestDishIndex = 0;
        int index = 0;
        for (Dish dish : dishes) {
            if (dish.getPrice() < dishes.get(chipestDishIndex).getPrice()) {
                chipestDishIndex = index;
            }
            index++;
        }
        return dishes.get(chipestDishIndex);
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return "Menu{" +
                "dishes = " + dishes +
                '}';
    }
}
