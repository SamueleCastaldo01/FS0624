package samuelecastaldo.entities;

public class Topping extends  MenuItem {
    private String name;
    private int calories;

    public Topping(String name, int calories, double price) {
        super(name, price);
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }


    @Override
    public String toString() {
        return "Topping{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                '}';
    }
}
