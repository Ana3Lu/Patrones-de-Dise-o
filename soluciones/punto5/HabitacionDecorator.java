package punto5;

public abstract class HabitacionDecorator implements Habitacion {
    private Habitacion habitacionDecorada;

    public HabitacionDecorator(Habitacion habitacionDecorada) {
        this.habitacionDecorada = habitacionDecorada;
    }

    @Override
    public double getPrecioHabitacion(){
        return habitacionDecorada.getPrecioHabitacion();
    }

    @Override
    public String getTipoHabitacion(){
        return habitacionDecorada.getTipoHabitacion();
    }
}
