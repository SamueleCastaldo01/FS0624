import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
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
        new Order(6, "Shipped", LocalDateTime.of(2021, 2, 5, 10, 0), LocalDateTime.of(2021, 2, 10, 10, 0), Arrays.asList(productList.get(0)), new Customer(6, "Frank", 2)),
                new Order(7, "Delivered", LocalDateTime.of(2021, 2, 15, 10, 0), LocalDateTime.of(2021, 2, 20, 10, 0), Arrays.asList(productList.get(1), productList.get(2)), new Customer(7, "Grace", 2)),
                new Order(8, "Processing", LocalDateTime.of(2021, 3, 1, 10, 0), LocalDateTime.of(2021, 3, 5, 10, 0), Arrays.asList(productList.get(3), productList.get(5)), new Customer(8, "Hannah", 2)),
                new Order(9, "Cancelled", LocalDateTime.of(2021, 3, 15, 10, 0), LocalDateTime.of(2021, 3, 20, 10, 0), Arrays.asList(productList.get(4)), new Customer(9, "Ivy", 3)),
                new Order(10, "Delivered", LocalDateTime.of(2021, 3, 25, 10, 0), LocalDateTime.of(2021, 3, 30, 10, 0), Arrays.asList(productList.get(6)), new Customer(10, "Jack", 2))
        );

        // Esercizio 1
        List<Product> expensiveBooks = productList.stream()
                .filter(product -> "Books".equals(product.getCategory()))   // Filtra per categoria "Books"
                .filter(product -> product.getPrice() > 100)                // Filtra per prezzo > 100
                .toList();

        System.out.println();
        System.out.println("Prodotti della categoria 'Books' con prezzo > 100:");
        expensiveBooks.forEach(System.out::println);

        //Esercizio 2 lista di ordini con prodotti, che appartengono alla categoria baby
        List<Order> expensiveOrder = orders.stream()
                .filter(order -> order.getProducts().stream().anyMatch(product -> "Baby".equals(product.getCategory())))
                .toList();
        //hai capito, bella sta cosa fa uno stream da dentro un altro stream dato che è un altra lista
        System.out.println();
        System.out.println("Esercizio 2, Ordini, che hanno la categoria baby: ");
        expensiveOrder.forEach(System.out::println);

        //esercizio 3
        //ottenere una lista di prodotti che appartengono alla categoria Boys, appliccare il 10% di sconto sul prezzo
        List<Product> scontoBoys = productList.stream()
                .filter(product -> "Boys".equals(product.getCategory()))
                .map(product -> {
                    double prezzoScontato = product.getPrice() *0.9;
                    Product prodottoScontato = new Product(product.getId(), product.getName(), product.getCategory(), prezzoScontato);
                    return prodottoScontato;
                })
                .toList();

        System.out.println();
        System.out.println("Esercizio 3, categoria Boys, sconto del 10%");
        scontoBoys.forEach(System.out::println);


        //esercizio 4
        //ottenere una lista di prodotti ordinati da clienti di livello tier 2, tra l'01-Feb-2021 e 01-Apr-2021
        LocalDateTime startDate = LocalDateTime.of(2021, 2, 1, 0, 0);
        LocalDateTime endDate = LocalDateTime.of(2021, 4, 1, 0, 0);
        List<Product> customTier = orders.stream()
                .filter(order -> )



    }
}