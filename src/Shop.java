import java.util.LinkedList;
import java.util.List;

public class Shop {
    private String name;
    private String address;
    private LinkedList<Person> list;

    public Shop(String name, String address, LinkedList<Person> list) {
        this.name = name;
        this.address = address;
        this.list = list;
    }

    public Shop() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LinkedList<Person> getList() {
        return list;
    }

    public void setList(LinkedList<Person> list) {
        this.list = list;
    }
}
