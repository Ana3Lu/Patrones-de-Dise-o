package punto3;

public class OrderDessert extends Order
{
    public OrderDessert(int id, String type, String name, String direction, Date date, double total) {
        super(id, type, name, direction, date, total);
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
        return total;
    }
}