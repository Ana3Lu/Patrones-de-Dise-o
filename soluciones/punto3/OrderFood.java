package punto3;

import java.util.Date;

public class OrderFood extends Order
{
    public OrderFood(int id, String nameUser, String address, Date date) {
        super(id, "Food", nameUser, address, date);
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