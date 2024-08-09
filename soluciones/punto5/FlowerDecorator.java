package punto5;

public class FlowerDecorator extends HabitacionDecorator{
    public FlowerDecorator(Habitacion habitacion) {
        super(habitacion);
    }

    @Override
    public double calcularPrecio() {
        System.out.println("Habitación con tulipanes");
        return super.calcularPrecio() + 100000;
    }
}
