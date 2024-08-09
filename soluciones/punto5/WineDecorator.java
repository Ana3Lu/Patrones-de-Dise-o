package punto5;

public class WineDecorator extends HabitacionDecorator {

    public WineDecorator(Habitacion habitacion) {
        super(habitacion);
    }

    @Override
    public double calcularPrecio() {
        return super.calcularPrecio() + 200000;
    }
}

