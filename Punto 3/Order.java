public abstract class Order
{
    private String name;
    private String direction;
    private String date;
    private double total;

    
    public Order(String name, String direction, String date, double total)
    {
        this.name = name;
        this.direction = direction;
        this.date = date;
        this.total = total;
    }

    public final void templateMethod() {
        takeOrder();
        if (verifyDisponibility()) {
            preparateOrder();
            calculateCost();
            deliverOrder();
        } else {
            System.out.println("Cancelled order");
        }
    }

    protected void takeOrder() {
        // take order
        System.out.println("Order taken");
    }

    protected boolean verifyDisponibility() {
        // verify disponibility
        return true;
    }

    protected abstract void prepareOrder();
    protected abstract double calculateCost();

    protected abstract void deliverOrder() {
        // deliver order
        System.out.println("Order is being delivered");
    }

    public String getName() {
        return name;
    }

    public String getDirection() {
        return direction;
    }

    public String getDate() {
        return date;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return name + " " + direction + " " + date + " " + price;
    }
}