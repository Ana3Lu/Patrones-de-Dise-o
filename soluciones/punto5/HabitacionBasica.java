package punto5;

public class HabitacionBasica implements Habitacion {
    private final double precio;

    public HabitacionBasica() {
        this.precio = 400000;
    }

    @Override
    public double calcularPrecio() {
        System.out.println("habitación básica");
        return this.precio;
    }
}
