package punto3;

import java.util.Date;

public abstract class Order
{
    private int id;
    private String type;
    private String name;
    private String direction;
    private Date date;
    private int quantity;
    private double total;

    public Order(int id, String type, String name, String direction, Date date, int quantity) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.direction = direction;
        this.date = date;
        this.quantity = quantity;
        this.total = calculateCost();
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

    public int getQuantity() {
        return quantity;
    }

    public double getTotal() {
        return total;
    }

    public String toString() {
        return "ID: " + id + "\nType: " + type + "\nName: " + name + "\nDirection: " + direction + "\nDate: " + date + "\nQuantity: " + quantity + "\nTotal: " + total;}

    // template method
    public final void processOrder() {
        takeOrder();
        if (verifyDisponibility()) {
            prepareOrder();
            calculateCost();
            deliverOrder();
        } else {
            System.out.println("Cancelled order of type " + getType() + "  due to not being available");
        }
    }

    protected void takeOrder() {
        // take order
        System.out.println("punto3.Order taken for " + getName() + " of type " + getType());
    }

    protected abstract boolean verifyDisponibility();
    protected abstract void prepareOrder();
    protected abstract double calculateCost();

    protected void deliverOrder() {
        // deliver order
        System.out.println("punto3.Order is being delivered to " + getDirection() + " for " + getName() + " of type " + getType());
    }
}