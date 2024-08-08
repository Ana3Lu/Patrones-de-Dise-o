package punto3;

import java.util.Date;
import java.util.ArrayList;

public abstract class Order
{
    private int id;
    private String type;
    private String nameUser;
    private String address;
    private Date date;
    private double total;
    private ArrayList<Product> products;

    public Order(int id, String type, String nameUser, String address, Date date) {
        this.id = id;
        this.type = type;
        this.nameUser = nameUser;
        this.address = address;
        this.date = date;
        this.total = calculateCost();
        this.products = new ArrayList<Product>();
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getNameUser() {
        return nameUser;
    }

    public String getAddress() {
        return address;
    }

    public Date getDate() {
        return date;
    }

    public double getTotal() {
        return total;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public String toString() {
        return "ID: " + id + "\nType: " + type + "\nName user: " + nameUser + "\nAddress: " + address + "\nDate: " + date + "\nTotal: " + total + "\nProducts: " + products;
    }

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
        System.out.println("Order taken for " + getNameUser() + " of type " + getType());
    }

    protected abstract boolean verifyDisponibility();
    protected abstract void prepareOrder();
    protected abstract double calculateCost();

    protected void deliverOrder() {
        // deliver order
        System.out.println("Order is being delivered to " + getAddress() + " for " + getNameUser());
    }
}