package punto3;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Product pasta = new Food(1, "Pasta", 10.0);
        Product soda = new Beverage(2, "Soda", 5.0);
        Product cake = new Dessert(3, "Cake", 15.0);

        Order order1 = new OrderFood(1, "Jhon", "123 Main St", new Date());
        Order order2 = new OrderBeverage(2, "Jane", "456 Market St", new Date());
        Order order3 = new OrderDessert(3, "Jack", "789 Market St", new Date());

        order1.addProduct(pasta);
        order2.addProduct(soda);
        order3.addProduct(cake);

        order1.processOrder();
        System.out.println("\n==============\n");
        order2.processOrder();
        System.out.println("\n==============\n");
        order3.processOrder();
    }
}
