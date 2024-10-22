package samuelecastaldo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import samuelecastaldo.config.OrderConfig;
import samuelecastaldo.entities.MenuItem;
import samuelecastaldo.entities.Order;
import samuelecastaldo.entities.Pizza;
import samuelecastaldo.entities.Tavolo;

import java.util.List;

@Component
public class OrderRunner implements CommandLineRunner {

    @Autowired
    private OrderConfig orderConfig; // Assuming OrderConfig holds your Order bean

    @Autowired
    private List<Pizza> pizze; // Assumendo che tu abbia un bean per le pizze

    @Autowired
    private Tavolo tavolo; // Assumendo che tu abbia un bean per i tavoli

    @Value("${seat.price:0.0}")
    private double coverCharge;

    @Override
    public void run(String... args) throws Exception {
        // Creazione dell'ordine
        List<MenuItem> itemsOrdine = List.of(pizze.get(0), pizze.get(1)); // Aggiungi le pizze che desideri
        Order order = new Order(1, tavolo, itemsOrdine, 2, coverCharge); // 2 coperti come esempio

        // Stampa dei dettagli dell'ordine
        System.out.println("Dettagli dell'Ordine:");
        System.out.println(order.toString());
        System.out.println("Importo Totale: " + order.getImportoTotale());
    }
}
