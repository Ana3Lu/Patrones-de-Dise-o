package punto5;

public abstract class HabitacionDecorator implements Habitacion {
    private Habitacion habitacion;

    public HabitacionDecorator(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    @Override
    public double calcularPrecio() {
        return habitacion.calcularPrecio();
    }
}
