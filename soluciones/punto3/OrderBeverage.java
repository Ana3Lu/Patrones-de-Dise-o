package punto3;

public class OrderBeverage extends Order
{
    private boolean withAlcohol;

    public OrderBeverage(int id, String type, String name, String direction, Date date, double total, boolean withAlcohol) {
        super(id, type, name, direction, date, total);
        this.withAlcohol = withAlcohol;
    }

    public boolean isWithAlcohol() {
        return withAlcohol;
    }

    @Override
    public String toString() {
        super.toString() + "\nWith alcohol: " + withAlcohol;
    }

    @Override
    protected boolean verifyDisponibility() {
        // verify availability
        return true;
    }

    @Override
    protected void prepareOrder() {
        // prepare beverage order
        System.out.println("Preparing " + getType() + " order for " + getName());
    }

    @Override
    protected double calculateCost() {
        // calculate cost
        return total;
    }
}