import java.time.LocalDate;
import java.util.List;

public class Order {
    private int number;
    private List<Product> productList;
    private LocalDate openOrderDate;
    private LocalDate closeOrderDate;

    public Order(int number, List<Product> productList, LocalDate openOrderDate, LocalDate closeOrderDate) {
        this.number = number;
        this.productList = productList;
        this.openOrderDate = openOrderDate;
        this.closeOrderDate = closeOrderDate;
    }

    public int getNumber() {
        return number;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public LocalDate getOpenOrderDate() {
        return openOrderDate;
    }

    public LocalDate getCloseOrderDate() {
        return closeOrderDate;
    }
}
