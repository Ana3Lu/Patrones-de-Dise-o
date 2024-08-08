package punto3;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Order order1 = new OrderFood(1, "Food", "Pepito", "Calle 123", new Date(), 5);
        Order order2 = new OrderBeverage(2, "Beverage", "Coca Cola", "Calle 132", new Date(), 3, true);
        Order order3 = new OrderDessert(3, "Dessert", "Tiramisu", "Calle 123", new Date(), 2);

        order1.processOrder();
        order2.processOrder();
        order3.processOrder();


    }
}
