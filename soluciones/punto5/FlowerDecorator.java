package punto5;

public class FlowerDecorator extends HabitacionDecorator{
    public FlowerDecorator(Habitacion habitacionDecorada) {
        super(habitacionDecorada);
    }

    @Override
    public String getTipoHabitacion(){
        return super.getTipoHabitacion()+ ", Tulipanes";
    }

    @Override
    public double getPrecioHabitacion(){
        return super.getPrecioHabitacion() + 100.000;
    }
}
