package sameuelecastaldo.entities;

import java.util.List;

public class Pizza {
    private String name;
    private double price;
    private int calories;
    private List<Topping> topping;

    public Pizza(String name, double price, int calories, List<Topping> topping) {
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.topping = topping;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public List<Topping> getTopping() {
        return topping;
    }

    public void setTopping(List<Topping> topping) {
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", calories=" + calories +
                ", topping=" + topping +
                '}';
    }
}
