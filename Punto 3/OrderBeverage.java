public class OrderBeverage extends Order
{
    public OrderBeverage(String name, String direction, String date, double total)
    {
        super(name, direction, date, total);
    }

    @Override
    protected void prepareOrder() {
        // prepare order
        System.out.println("Order prepared");
    }

    @Override
    protected double calculateCost() {
        // calculate cost
        return total;
    }
}