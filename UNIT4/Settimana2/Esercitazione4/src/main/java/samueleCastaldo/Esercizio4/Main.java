package samueleCastaldo.Esercizio4;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;
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
        Map<Customer, Double> esercizio2 = orders.stream()
                .collect(Collectors.groupingBy(
                        order -> order.getCustomer(),  // Raggruppa per cliente
                        Collectors.summingDouble(order -> order.getProducts().stream()
                                .mapToDouble(product ->product.getPrice())  //qui vado ad usare il mapTo ,Somma il prezzo di tutti i prodotti dell'ordine
                                .sum()  // Somma per ogni ordine
                        )
                ));

        System.out.println();
        esercizio2.forEach((customer, totalValue) -> {
            System.out.println("Cliente: " + customer.getName() + ", Totale ordini: " + totalValue);
        });


        //Esercizio 3
        //dato un elenco di prodotti, trova i prodotti più costosi.
       List<Product> esercizio3 = productList.stream().sorted(Comparator.comparingDouble(Product::getPrice).reversed()).limit(5).toList();
       System.out.println();
       esercizio3.forEach(System.out::println);

       //Esercizio 4
       //dato un elenco di ordini, calcola la media degli importi degli ordini.
        double esercizio4 = orders.stream().mapToDouble(order -> order.getProducts().stream()
                .mapToDouble(product -> product.getPrice()).sum() // va a fare la somma di tutti i prodotti di quel ordine
        ).average().orElse(0.0);   //e qui alla fine farà la media della somma di tutti gli ordini

        System.out.println();
        System.out.println("la media degli ordini: " + esercizio4);

        //esercizio 5
        //dato un elenco di prodotti, raggruppa i prodotti per categoria e calcola la somma degli importi per ogni categoria
        Map<String, Double> esercizio5 = productList.stream().collect(Collectors.groupingBy(
                product -> product.getCategory(),
                Collectors.summingDouble(product -> product.getPrice())
        ));

        System.out.println();
        esercizio5.forEach((category, somma) -> System.out.println(category + " somma: " + somma));

        //esercizio 6

    }
}