import java.util.Comparator;

public class Person {
    private Passport passport;
    private Cart cart;
    private int money;

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Person(Passport passport, Cart cart, int money) {
        this.passport = passport;
        this.cart = cart;
        this.money = money;
    }

    public Person() {
    }
    public static Comparator<Person> sortByName = new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getPassport().getLastName().compareTo(o2.getPassport().getLastName());
        }
    };
    public static Comparator<Person> sortByAge = new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getPassport().getAge()-o2.getPassport().getAge();
        }
    };

    @Override
    public String toString() {
        return "Person{" +
                "passport=" + passport +
                ", cart=" + cart +
                ", money=" + money +
                '}';
    }
}
