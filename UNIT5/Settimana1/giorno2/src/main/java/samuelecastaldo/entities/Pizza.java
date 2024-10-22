package samuelecastaldo.entities;

import java.util.ArrayList;
import java.util.List;

public class Pizza extends MenuItem {
    private int calories; // Elimina name e price da qui

    private List<Topping> toppings; // Corretto: naming in linea con la convenzione

    // Costruttore principale
    public Pizza(String name, double price, int calories) {
        super(name, price); // Richiama il costruttore della superclasse
        this.calories = calories;
        this.toppings = new ArrayList<>();
    }

    // Costruttore secondario
    public Pizza(String name, double price) {
        super(name, price);
        this.calories = 0; // Imposta un valore di default per le calorie
        this.toppings = new ArrayList<>();
    }

    // Getters e Setters
    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public List<Topping> getToppings() {
        return toppings; // Corretto: restituisce la lista di topping
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + getName() + '\'' + // Usa il metodo getName() della superclasse
                ", price=" + getPrice() + // Usa il metodo getPrice() della superclasse
                ", calories=" + calories +
                ", toppings=" + toppings +
                '}';
    }
}
