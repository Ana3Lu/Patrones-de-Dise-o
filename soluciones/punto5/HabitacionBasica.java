package punto5;

public class HabitacionBasica implements Habitacion {
    @Override
    public String getTipoHabitacion() {
        return "punto5.Habitacion Básica";
    }

    @Override
    public double getPrecioHabitacion() {
        return 500.000;
    }

}
