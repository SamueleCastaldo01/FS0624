package samuelecastaldo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import samuelecastaldo.entities.*;


import java.util.ArrayList;
import java.util.List;

@Configuration
public class MenuConfig {

    @Bean
    public List<Pizza> getPizze(){
        List<Pizza> pizze = new ArrayList<>();
        Pizza margherita = new Pizza("Pizza margherita", 5.99, 1104);
        Pizza hawaiian = new Pizza("Hawaiian pizza", 6.99, 1024);
        Pizza salamiPizza = new Pizza("Salami pizza", 6.99, 1024);

        margherita.addTopping(new Topping("Cheese", 92, 0.69));
        margherita.addTopping(new Topping("Tomato", 92, 0.69));

        pizze.add(margherita);
        pizze.add(hawaiian);
        pizze.add(salamiPizza);
        return pizze;
    }

    @Bean
    public List<Topping> getToppings(){
        List<Topping> toppings = new ArrayList<>();
        Topping cheese = new Topping("Cheese", 92, 0.69);
        Topping ham = new Topping("Ham", 35, 0.99 );
        Topping onions = new Topping("Onions", 22, 0.69 );
        Topping pineapple = new Topping("Pineapple", 24, 0.79);
        Topping salami = new Topping("Salami", 86, 0.99 );

        toppings.add(cheese);
        toppings.add(ham);
        toppings.add(onions);
        toppings.add(pineapple);
        toppings.add(salami);
        return toppings;
    }


    @Bean
    public List<Drink> getDrinks() {
        List<Drink> drinks = new ArrayList<>();
        Drink cheese = new Drink("Lemonade", 128, 1.29);
        Drink water = new Drink("Water", 0, 1.29);
        Drink wine = new Drink("Wine", 607, 7.49);

        drinks.add(cheese);
        drinks.add(water);
        drinks.add(wine);
        return drinks;
    }

    @Bean
    public Menu getMenu(List<Pizza> pizze, List<Topping> toppings, List<Drink> drinks) {
        Menu menu = new Menu(pizze, toppings, drinks);

        return menu;
    }





}
