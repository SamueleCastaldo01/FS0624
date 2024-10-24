package samuelecastaldo.provadb.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "pizze")
public class Pizza {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private int calories;
    private double price;
    @OneToMany(mappedBy = "pizza", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Toppings> toppings;

    public Pizza() {}

    public Pizza(String name, int calories, double price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
        this.toppings = new ArrayList<>();
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

    public List<Toppings> getToppings() {
        return toppings;
    }

    public void setToppings(List<Toppings> toppings) {
        this.toppings = toppings;
    }

    public Pizza(long id, String name, int calories, double price, List<Toppings> toppings) {
        this.id = id;
        this.name = name;
        this.calories = calories;
        this.price = price;
        this.toppings = toppings;
    }
}
