package punto5;

public class ChocolateDecorator extends HabitacionDecorator{
    public ChocolateDecorator(Habitacion habitacionDecorada) {
        super(habitacionDecorada);
    }

    @Override
    public String getTipoHabitacion(){
        return super.getTipoHabitacion()+ ",To'ak chocolate";
    }

    @Override
    public double getPrecioHabitacion(){
        return super.getPrecioHabitacion()+200.000;
    }
}
