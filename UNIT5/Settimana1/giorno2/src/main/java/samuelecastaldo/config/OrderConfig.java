package samuelecastaldo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import samuelecastaldo.entities.MenuItem;
import samuelecastaldo.entities.Order;
import samuelecastaldo.entities.Pizza;
import samuelecastaldo.entities.Tavolo;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class OrderConfig {

    @Value("${seat.price:0.0}")
    private double coverCharge;

    @Bean
    public Tavolo getTable() {
        return new Tavolo(1, 4);
    }

    @Bean
    public Order getOrder(Tavolo tavolo, List<Pizza> pizze) {
        // Creare una lista di MenuItem, assicurandosi che gli oggetti Pizza siano trattati come MenuItem
        List<MenuItem> itemsOrdine = new ArrayList<>();
        pizze.add(new Pizza("Margherita", 8.50, 250));
        pizze.add(new Pizza("Pepperoni", 9.00, 300));
        // Creazione dell'ordine passando la lista corretta di MenuItem
        Order order = new Order(1, tavolo, itemsOrdine, 3, coverCharge);
        return order;
    }
}
