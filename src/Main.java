import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("rice",350,30, LocalDate.of(2023,3,28),false);
        Product product2 = new Product("Sok",180,2,LocalDate.of(2023,3,11),false);
        Product product3 = new Product("Arak", 380,4,LocalDate.of(2023,3,1),false);
        Product product4 = new Product("Kartoshka",40,10,LocalDate.of(2023,9,19),false);
        Product product5 = new Product("Alma",30,5,LocalDate.of(2023,4,12),false);
        Product product6 = new Product("Cocacola",120,2,LocalDate.of(2023,5,23),false);
        Product product7 = new Product("chocolate",500,1,LocalDate.of(2023,8,12),false);
        Product product8 = new Product("Piva",250,2,LocalDate.of(2023,7,23),false);
        Product product9 = new Product("Roll",80,4,LocalDate.of(2023,8,23),false);
        Product product10 = new Product("Et",650,4,LocalDate.of(2023,2,23),false);
        LinkedList<Product> list = new LinkedList<>(Arrays.asList(product1,product2,product3,product4,product5,product6));
        LinkedList<Product> list1 = new LinkedList<>(Arrays.asList(product7,product8,product9,product10,product1,product6));

        Cart cart = new Cart(list);
        Cart cart1 = new Cart(list1);

        Passport passport1=new Passport("Abdugani uulu","Manas",LocalDate.of(2004,10,31),Gender.MALE);
        Passport passport2=new Passport("Alisherov","Erik",LocalDate.of(2004,4,23),Gender.MALE);
        Passport passport3=new Passport("Tynybekova","Aisuluu",LocalDate.of(1993,8,26),Gender.FEMALE);
        Passport passport4=new Passport("Niyazov","Torogeldi",LocalDate.of(2006,8,26),Gender.MALE);
        Passport passport5=new Passport("Tilekov","Bek",LocalDate.of(1995,8,26),Gender.MALE);
        Passport passport6=new Passport("Daniarov","Juma",LocalDate.of(1995,8,26),Gender.MALE);
        Passport passport7=new Passport("Myktybekov","Sabyr",LocalDate.of(1995,8,26),Gender.MALE);
        Passport passport8=new Passport("Abylova","Roza",LocalDate.of(1995,8,26),Gender.FEMALE);

        Person person1 = new Person(passport1,cart,11000);
        Person person2 = new Person(passport2,cart1,3000);
        Person person3 = new Person(passport3,cart1,3000);
        Person person4 = new Person(passport4,cart1,3000);
        Person person5 = new Person(passport5,cart1,3000);
        Person person6 = new Person(passport6,cart1,3000);
        Person person7 = new Person(passport7,cart1,3000);
        Person person8 = new Person(passport8,cart1,3000);


        LinkedList<Person>people = new LinkedList<>(Arrays.asList(person2,person1,person3,person4,person5,person6,person7,person8));

        Shop shop = new Shop("Globus","Ahunbaev 123",people);
      //  Collections.sort(list,Product.compareByName);
        Collections.sort(shop.getList(),Person.sortByName);
        Collections.sort(people,Person.sortByAge);

        ActionAbleImpl actionAble = new ActionAbleImpl();
        actionAble.inShop1(shop);
        //actionAble.expiration(person1);
      // actionAble.buyProduct(person1);
      //  actionAble.inShop(shop);
        //System.out.println(list);
       /* int age = Period.between(person1.getPassport().getDateOfBirth(), LocalDate.now()).getYears();
        System.out.println(age);
        System.out.println(person1.getPassport().getDateOfBirth().getDayOfYear());*/

    }
}