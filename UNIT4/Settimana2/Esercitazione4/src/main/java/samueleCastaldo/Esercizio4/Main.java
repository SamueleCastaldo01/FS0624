package samueleCastaldo.Esercizio4;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//una cosa importante da imparare in questo è caso è imparare tutti i metodi, per la ricerca per una lista

public class Main {
    public static void main(String[] args) {
        //lista prodotti
        List<Product> productList = Arrays.asList(
                new Product(1, "Java Programming", "Books", 120.50),
                new Product(2, "Python Programming", "Books", 80.00),
                new Product(3, "Baby Shampoo", "Baby", 15.75),
                new Product(4, "Lego Set", "Boys", 60.00),
                new Product(5, "Teddy Bear", "Baby", 25.00),
                new Product(6, "Football", "Boys", 35.50),
                new Product(7, "Data Science Handbook", "Books", 150.00),
                new Product(8, "Baby Blanket", "Baby", 30.00),
                new Product(9, "Basketball Jersey", "Boys", 55.00),
                new Product(10, "Cooking Book", "Books", 200.00)
        );

        //lista ordini
        List<Order> orders = Arrays.asList(
                new Order(1, "Shipped", LocalDateTime.now(), LocalDateTime.now().plusDays(5), Arrays.asList(productList.get(3), productList.get(5)), new Customer(1, "Alice", 1)),
                new Order(2, "Processing", LocalDateTime.now(), LocalDateTime.now().plusDays(3), Arrays.asList(productList.get(3), productList.get(2), productList.get(6)), new Customer(2, "Bob", 2)),
                new Order(3, "Delivered", LocalDateTime.now(), LocalDateTime.now().plusDays(2), Arrays.asList(productList.get(1), productList.get(7)), new Customer(3, "Charlie", 1)),
                new Order(4, "Delivered", LocalDateTime.now(), LocalDateTime.now().plusDays(1), Arrays.asList(productList.get(4), productList.get(8)), new Customer(4, "David", 2)),
                new Order(5, "Cancelled", LocalDateTime.now(), LocalDateTime.now().plusDays(4), Arrays.asList(productList.get(3), productList.get(2)), new Customer(5, "Eva", 3)),
                new Order(6, "Delivered", LocalDateTime.now().plusDays(1), LocalDateTime.now().plusDays(3), Arrays.asList(productList.get(0), productList.get(1)), new Customer(1, "Alice", 1)),
                new Order(7, "Shipped", LocalDateTime.of(2021, 2, 5, 10, 0), LocalDateTime.of(2021, 2, 10, 10, 0), Arrays.asList(productList.get(2), productList.get(6)), new Customer(2, "Bob", 2)),
                new Order(8, "Delivered", LocalDateTime.of(2021, 2, 15, 10, 0), LocalDateTime.of(2021, 2, 20, 10, 0), Arrays.asList(productList.get(1), productList.get(2)), new Customer(7, "Grace", 2)),
                new Order(9, "Processing", LocalDateTime.of(2021, 3, 1, 10, 0), LocalDateTime.of(2021, 3, 5, 10, 0), Arrays.asList(productList.get(3), productList.get(5)), new Customer(8, "Hannah", 2)),
                new Order(10, "Shipped", LocalDateTime.of(2021, 3, 5, 10, 0), LocalDateTime.of(2021, 3, 10, 10, 0), Arrays.asList(productList.get(4)), new Customer(1, "Alice", 1)),
                new Order(11, "Delivered", LocalDateTime.of(2021, 3, 25, 10, 0), LocalDateTime.of(2021, 3, 30, 10, 0), Arrays.asList(productList.get(6)), new Customer(2, "Bob", 2)),
                new Order(12, "Delivered", LocalDateTime.now(), LocalDateTime.now().plusDays(5), Arrays.asList(productList.get(7), productList.get(8)), new Customer(9, "Ivy", 3)),
                new Order(13, "Cancelled", LocalDateTime.now(), LocalDateTime.now().plusDays(3), Arrays.asList(productList.get(2), productList.get(4)), new Customer(4, "David", 2)),
                new Order(14, "Shipped", LocalDateTime.of(2021, 2, 15, 10, 0), LocalDateTime.of(2021, 2, 20, 10, 0), Arrays.asList(productList.get(1), productList.get(5)), new Customer(2, "Bob", 2)),
                new Order(15, "Processing", LocalDateTime.now(), LocalDateTime.now().plusDays(2), Arrays.asList(productList.get(0)), new Customer(3, "Charlie", 1))
        );

       //Esercizio 1
        Map<Customer, List<Order>> esercizio1 = orders.stream().collect(Collectors.groupingBy(order -> order.getCustomer()));
        esercizio1.forEach((customer, orderList) -> {
            System.out.println("Cliente: " + customer.getName());
            orderList.forEach(order -> System.out.println("  Ordine: " + order.getId() + ", Stato: " + order.getStatus()));
        });

        //Esercizio 2
        //dato un elenco di ordini, calcola il totale delle vendite per ogni cliente.
        //crea una mappa in cui la chiave è il cliente e il valore è l'importo totale dei suoi acquisti


    }
}