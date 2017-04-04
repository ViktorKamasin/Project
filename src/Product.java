
public class Product {
    private String name;
    private String description;
    private double price;
    private int remainingAmount;

    public Product(String name, String description, double price, int remainingAmount) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.remainingAmount = remainingAmount;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getRemainingAmount() {
        return remainingAmount;
    }
}
