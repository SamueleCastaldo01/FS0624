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

    public List<Product> getProducts() {
        return products;
    }

    public long getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public LocalDateTime getDeliveryDate() {
        return deliveryDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public void setDeliveryDate(LocalDateTime deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String toString() {
        return "Order{id=" + id + ", status='" + status + "', products=" + products + "}";
    }

}
