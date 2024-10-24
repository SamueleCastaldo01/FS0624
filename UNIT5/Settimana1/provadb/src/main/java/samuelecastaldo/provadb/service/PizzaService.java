package samuelecastaldo.provadb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import samuelecastaldo.provadb.entities.Pizza;
import samuelecastaldo.provadb.repositories.PizzaRepository;

import java.util.List;

@Service
public class PizzaService {

    private final PizzaRepository pizzaRepository;

    @Autowired
    public PizzaService(PizzaRepository pizzaRepository) {  // Constructor injection
        this.pizzaRepository = pizzaRepository;
    }

    public List<Pizza> getAllPizzas() {
        return pizzaRepository.findAll();
    }

    public Pizza savePizza(Pizza newPizza) {
        return pizzaRepository.save(newPizza);

    }

}
