public abstract class Order
{
    private int id;
    private String type;
    private String name;
    private String direction;
    private Date date;
    private double total;

    public Order(int id, String type, String name, String direction, Date date, double total) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.direction = direction;
        this.date = date;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getDirection() {
        return direction;
    }

    public Date getDate() {
        return date;
    }

    public double getTotal() {
        return total;
    }

    public String toString() {
        return "ID: " + id + "\nType: " + type + "\nName: " + name + "\nDirection: " + direction + "\nDate: " + date + "\nTotal: " + total;}

    // template method
    public final void processOrder() {
        takeOrder();
        if (verifyDisponibility()) {
            preparateOrder();
            calculateCost();
            deliverOrder();
        } else {
            System.out.println("Cancelled order of type " + getType() + "  due to not being available");
        }
    }

    protected void takeOrder() {
        // take order
        System.out.println("Order taken for " + getName() + " of type " + getType());
    }

    protected abstract boolean verifyDisponibility();
    protected abstract void prepareOrder();
    protected abstract double calculateCost();

    protected abstract void deliverOrder() {
        // deliver order
        System.out.println("Order is being delivered to " + getDirection() + " for " + getName() + " of type " + getType());
    }
}