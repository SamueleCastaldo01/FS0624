import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private long id;
    private String status;
    private LocalDateTime orderDate;
    private LocalDateTime deliveryDate;
    private List<Product> products;
    private Customer customer;

    public Order(long id, String status, LocalDateTime orderDate, LocalDateTime deliveryDate, List<Product> products, Customer customer) {
        this.id = id;
        this.status = status;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.products = products;
        this.customer = customer;
    }

}
