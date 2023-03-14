import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class ActionAbleImpl implements Actionable {

    public void inShop(Shop shop) {
        for (Person person : shop.getList()) {
            expiration(person);
        }
    }
    public  void inShop1(Shop shop){
        for (Person a:shop.getList()) {
            /*String name = new Scanner(System.in).nextLine();
            if (a.getPassport().getLastName().equals(name)){
                buyProduct(a);
            }*/
            buyProduct(a);
        }

    }

    @Override
    public void expiration(Person person) {

        int counter = 0;
        try {
            for (Product c : person.getCart().getList()) {
                if (c.getExpiration().getYear() >= LocalDate.now().getYear()) {
                    if (c.getExpiration().getDayOfYear() <= LocalDate.now().getDayOfYear()) {
                        System.out.println(person.getCart().getList());
                        person.getCart().getList().remove(c);
                        System.out.println(person.getCart().getList());
                        throw new Exception("expiration date has expired " + c);
                    } else {
                        counter++;
//                       System.out.println(counter+" product expiration date is ok.");
                    }
                } else {
                    System.out.println(person.getCart().getList());
                    person.getCart().getList().remove(c);
                    System.out.println(person.getCart().getList());
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void buyProduct(Person person) {
        try {
            System.out.println("Person: " + person.getPassport());
            System.out.println("Producty: " + person.getCart().getList());
            System.out.println("Money: " + person.getMoney());
            int total = 0;
            int totsl1 = 0;
            for (Product a : person.getCart().getList()) {
                if (a.isAlcoholStatus()) {
                    int age = Period.between(person.getPassport().getDateOfBirth(), LocalDate.now()).getYears();
                    for (Product b : person.getCart().getList()) {
                        total = b.getPrice() * b.getQuantity();
                        totsl1 += total;
                    }
                    System.out.println(totsl1);
                    if (age >= 17) {
                        if (person.getPassport().getDateOfBirth().getDayOfYear() >= 304) {
                            System.out.println("Satylsyn");
                            if (person.getMoney() < totsl1) {
                                System.out.println("Akchanyz jetpedi bir nerseni alyp salaylyby?");
                                String answeer = new Scanner(System.in).nextLine();
                                if (answeer.equals("ooba")) {
                                    System.out.println("Emneni?");
                                    String question = new Scanner(System.in).nextLine();
                                    for (int i = 0; i < person.getCart().getList().size(); i++) {
                                        if (question.equals(person.getCart().getList().get(i).getName())) {
                                            System.out.println("Kancha shtuk?");
                                            int number = new Scanner(System.in).nextInt();
                                            for (Product x : person.getCart().getList()) {
                                                if (number < person.getCart().getList().get(i).getQuantity()) {
                                                    System.out.println(person.getCart().getList().get(i));
                                                    person.getCart().getList().get(i).setQuantity(person.getCart().getList().get(i).getQuantity() - number);
                                                    System.out.println(person.getCart().getList().get(i));
                                                    int num1 = person.getCart().getList().get(i).getQuantity() * person.getCart().getList().get(i).getPrice();
                                                    System.out.println(num1);
                                                    totsl1 -= num1;
                                                    System.out.println(totsl1);
                                                    if (person.getMoney() < totsl1) {
                                                        System.out.println("Akchanyz dagyn ele jetpeit dagyn bir nerseni alyp salynyz");
                                                        String secondOne = new Scanner(System.in).nextLine();
                                                        for (int j = 0; j < person.getCart().getList().size(); j++) {
                                                            if (person.getCart().getList().get(j).getName().equals(secondOne)) {
                                                                System.out.println(person.getCart().getList().get(j));
                                                                int total1 = totsl1 - (person.getCart().getList().get(j).getPrice() * person.getCart().getList().get(j).getQuantity());
                                                                person.getCart().getList().remove(person.getCart().getList().get(j));
                                                                if (person.getMoney() > total1) {
                                                                    System.out.println("Iygiliktuu tolonndu");
                                                                } else {
                                                                    throw new Exception("Balansty toluktanyz suranych");
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        throw new Exception("Tuura jazynyz...");
                                                    }
                                                    break;


                                                }
                                            }

                                        }
                                    }

                                }
                            }
                        } else {
                            System.out.println("Saatylbasyn");
                        }

                    } else {
                        System.out.println("Satylbasyn");
                        person.getCart().getList().remove(a);
                        System.out.println(person.getPassport());
                        System.out.println(person.getPassport().getDateOfBirth().getYear());


                    }
                }else {
                    for (Product b : person.getCart().getList()) {
                        total = b.getPrice() * b.getQuantity();
                        totsl1 += total;
                        if (person.getMoney() < totsl1) {
                            System.out.println("Akchanyz jetpedi bir nerseni alyp salaylyby?");
                            String answeer = new Scanner(System.in).nextLine();
                            if (answeer.equals("ooba")) {
                                System.out.println("Emneni?");
                                String question = new Scanner(System.in).nextLine();
                                for (int i = 0; i < person.getCart().getList().size(); i++) {
                                    if (question.equals(person.getCart().getList().get(i).getName())) {
                                        System.out.println("Kancha shtuk?");
                                        int number = new Scanner(System.in).nextInt();
                                        for (Product x : person.getCart().getList()) {
                                            if (number < person.getCart().getList().get(i).getQuantity()) {
                                                System.out.println(person.getCart().getList().get(i));
                                                person.getCart().getList().get(i).setQuantity(person.getCart().getList().get(i).getQuantity() - number);
                                                System.out.println(person.getCart().getList().get(i));
                                                int num1 = person.getCart().getList().get(i).getQuantity() * person.getCart().getList().get(i).getPrice();
                                                System.out.println(num1);
                                                totsl1 -= num1;
                                                System.out.println(totsl1);
                                                if (person.getMoney() < totsl1) {
                                                    System.out.println("Akchanyz dagyn ele jetpeit dagyn bir nerseni alyp salynyz");
                                                    String secondOne = new Scanner(System.in).nextLine();
                                                    for (int j = 0; j < person.getCart().getList().size(); j++) {
                                                        if (person.getCart().getList().get(j).getName().equals(secondOne)) {
                                                            System.out.println(person.getCart().getList().get(j));
                                                            int total1 = totsl1 - (person.getCart().getList().get(j).getPrice() * person.getCart().getList().get(j).getQuantity());
                                                            person.getCart().getList().remove(person.getCart().getList().get(j));
                                                            if (person.getMoney() > total1) {
                                                                System.out.println("Iygiliktuu tolonndu");
                                                            } else {
                                                                throw new Exception("Balansty toluktanyz suranych");
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    throw new Exception("Tuura jazynyz...");
                                                }
                                                break;


                                            }
                                        }

                                    }
                                }

                            }
                        }
                    }
                }
            }


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


