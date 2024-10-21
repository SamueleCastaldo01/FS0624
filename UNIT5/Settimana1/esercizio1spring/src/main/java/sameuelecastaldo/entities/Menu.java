package sameuelecastaldo.entities;

import java.util.List;

public class Menu {
    private List<Pizza> pizze;
    private  List<Topping> toppings;
    private List<Drink> drinks;

    public Menu(List<Pizza> pizze, List<Topping> toppings, List<Drink> drinks) {
        this.pizze = pizze;
        this.toppings = toppings;
        this.drinks = drinks;
    }

    public List<Pizza> getPizze() {
        return pizze;
    }

    public void setPizze(List<Pizza> pizze) {
        this.pizze = pizze;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<Drink> drinks) {
        this.drinks = drinks;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "pizze=" + pizze +
                ", toppings=" + toppings +
                ", drinks=" + drinks +
                '}';
    }
}
