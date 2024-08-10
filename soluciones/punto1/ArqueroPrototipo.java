package punto1;

public class ArqueroPrototipo extends HeroePrototipo {

    public ArqueroPrototipo(Heroe heroePrototipo) {
        super(heroePrototipo);
    }

    public ArqueroPrototipo(String nombre, String aspectoVisual, double experiencia, int nivel, int puntos) {
        super(nombre, aspectoVisual, experiencia, nivel, puntos);
        this.agregarHabilidades("Volar");
        this.agregarHabilidades("Invisibilidad");
        this.agregarHabilidades("Cambio de forma");
    }


    @Override
    public HeroePrototipo clonar() {
        return new ArqueroPrototipo(this);
    }
}