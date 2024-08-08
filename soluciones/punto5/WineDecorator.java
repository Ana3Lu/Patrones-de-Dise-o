package punto5;

public class WineDecorator extends HabitacionDecorator {

        public WineDecorator(Habitacion habitacionDecorada) {
            super(habitacionDecorada);
        }

        @Override
        public String getTipoHabitacion(){
            return super.getTipoHabitacion()+ ", Vino Merlot";
        }

        @Override
        public double getPrecioHabitacion(){
            return super.getPrecioHabitacion() + 300.000;
        }
    }

