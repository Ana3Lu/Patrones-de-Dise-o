package punto1;

public class MagoPrototipo extends HeroePrototipo {

    public MagoPrototipo(Heroe heroePrototipo) {
        super(heroePrototipo);
    }

    public MagoPrototipo(String nombre, String aspectoVisual, double experiencia, int nivel, int puntos) {
        super(nombre, aspectoVisual, experiencia, nivel, puntos);
        this.agregarHabilidades("Telepatía");
        this.agregarHabilidades("Teletransportación");
        this.agregarHabilidades("Percepción extrasensorial");
    }


    @Override
    public HeroePrototipo clonar() {

        return new MagoPrototipo(this);
    }
}