import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
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

        // Esercizio 1
        List<Product> expensiveBooks = productList.stream()
                .filter(product -> "Books".equals(product.getCategory()))   // Filtra per categoria "Books"
                .filter(product -> product.getPrice() > 100)                // Filtra per prezzo > 100
                .toList();

        System.out.println("Prodotti della categoria 'Books' con prezzo > 100:");
        expensiveBooks.forEach(System.out::println);

    }
}