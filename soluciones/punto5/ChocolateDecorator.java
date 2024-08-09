package punto5;

public class ChocolateDecorator extends HabitacionDecorator{

    public ChocolateDecorator(Habitacion habitacion) {
        super(habitacion);
    }

    @Override
    public double calcularPrecio() {
        System.out.println("Habitación con chocolate To'ak ");
        return super.calcularPrecio() + 50000;
    }
}
