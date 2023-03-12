import java.time.LocalDate;
import java.util.Comparator;

public class Product {
    private String name;
    private int price;
    private int quantity;
    private LocalDate expiration;
    private boolean alcoholStatus;

    public Product(String name, int price, int quantity, LocalDate expiration, boolean alcoholStatus) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.expiration = expiration;
        this.alcoholStatus = alcoholStatus;
    }

    public Product() {
    }
    public static Comparator<Product>compareByName = new Comparator<Product>() {
        @Override
        public int compare(Product o1, Product o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getExpiration() {
        return expiration;
    }

    public void setExpiration(LocalDate expiration) {
        this.expiration = expiration;
    }

    public boolean isAlcoholStatus() {
        return alcoholStatus;
    }

    public void setAlcoholStatus(boolean alcoholStatus) {
        this.alcoholStatus = alcoholStatus;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", expiration=" + expiration +
                ", alcoholStatus=" + alcoholStatus +
                '}';
    }
}
