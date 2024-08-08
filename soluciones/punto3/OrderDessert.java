package punto3;

import java.util.Date;

public class OrderDessert extends Order
{
    public OrderDessert(int id, String nameUser, String address, Date date) {
        super(id, "Dessert", nameUser, address, date);
    }

    @Override
    protected boolean verifyDisponibility() {
        // verify availability
        return true;
    }

    @Override
    protected void prepareOrder() {
        // prepare order
        System.out.println("Preparing " + getType() + " order for " + getNameUser());
    }

    @Override
    protected double calculateCost() {
        // calculate cost
        return 0.0;
    }
}