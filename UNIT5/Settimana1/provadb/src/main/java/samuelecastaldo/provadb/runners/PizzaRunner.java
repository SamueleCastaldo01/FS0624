package samuelecastaldo.provadb.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import samuelecastaldo.provadb.entities.Pizza;
import samuelecastaldo.provadb.repositories.PizzaRepository;
import samuelecastaldo.provadb.service.PizzaService;

import java.util.List;

@Component
public class PizzaRunner implements CommandLineRunner {

    @Autowired
    private PizzaService pizzaService;


    @Override
    public void run(String... args) throws Exception {
        Pizza margherita = new Pizza("margherita", 250, 5.0);
        Pizza peperoni = new Pizza("peperoni", 300, 6.5);

        pizzaService.savePizza(margherita);
        pizzaService.savePizza(peperoni);

        List<Pizza> pizzas = pizzaService.getAllPizzas();
        pizzas.forEach(System.out::println);

    }
}
