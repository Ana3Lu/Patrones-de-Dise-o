package punto3;

import java.util.Date;

public class OrderBeverage extends Order
{
    public OrderBeverage(int id, String nameUser, String address, Date date) { 
        super(id, "Beverage", nameUser, address, date);
    }

    @Override
    protected boolean verifyDisponibility() {
        // verify availability
        return true;
    }

    @Override
    protected void prepareOrder() {
        // prepare beverage order
        System.out.println("Preparing " + getType() + " order for " + getNameUser());
    }

    @Override
    protected double calculateCost() {
        // calculate cost
        return 0.0;
    }
}