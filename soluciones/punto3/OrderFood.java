package punto3;

import java.util.Date;

public class OrderFood extends Order
{
    public OrderFood(int id, String type, String name, String direction, Date date, int quantity) {
        super(id, type, name, direction, date, quantity);
    }

    @Override
    protected boolean verifyDisponibility() {
        // verify availability
        return true;
    }

    @Override
    protected void prepareOrder() {
        // prepare order
        System.out.println("Preparing " + getType() + " order for " + getName());
    }

    @Override
    protected double calculateCost() {
        // calculate cost
        return 0.0;
    }
}