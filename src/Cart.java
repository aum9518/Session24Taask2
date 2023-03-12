import java.util.LinkedList;
import java.util.List;

public class Cart {
    private LinkedList<Product> list;

    public Cart() {
    }

    public Cart(LinkedList<Product> list) {
        this.list = list;
    }

    public List<Product> getList() {
        return list;
    }

    public void setList(LinkedList<Product> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "list=" + list +
                '}';
    }
}
