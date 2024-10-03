package samueleCastaldo.Esercizio4;

public class Product {

    private long id;
    private String name;
    private String category;
    private double price;

    public Product(long id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String  getCategory() {
        return category;
    }

    public long  getId() {
        return id;
    }

    public String  getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double p) {
         this.price = p;
    }

    public String toString() {
        return "Product{id=" + id + ", name='" + name + "', category='" + category + "', price=" + price + "}";
    }

}
