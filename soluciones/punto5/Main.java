package punto5;

public class Main {
    public static void main(String[] args) {
        Habitacion habitacion = new HabitacionBasica();

        habitacion = new FlowerDecorator(habitacion);

        habitacion = new WineDecorator(habitacion);

        habitacion = new ChocolateDecorator(habitacion);

        System.out.println("Total: " + habitacion.calcularPrecio());
    }
}
