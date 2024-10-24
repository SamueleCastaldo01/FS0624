package samuelecastaldo.provadb.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "toppings")
public class Toppings {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private int calories;
    private double price;
    @ManyToOne
    @JoinColumn(name = "pizza_id")
    private Pizza pizza;

    public Toppings() {}

    public Toppings(String name, int calories, double price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String toString() {
        return "Toppings{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                ", pizza=" + pizza +
                '}';
    }
}
