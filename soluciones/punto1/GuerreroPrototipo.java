package punto1;

public class GuerreroPrototipo extends HeroePrototipo {

    public GuerreroPrototipo(Heroe heroePrototipo) {
        super(heroePrototipo);
    }

    public GuerreroPrototipo(String nombre, String aspectoVisual, double experiencia, int nivel, int puntos) {
        super(nombre, aspectoVisual, experiencia, nivel, puntos);
        this.agregarHabilidades("Manipulación de energía");
        this.agregarHabilidades("Fuerza sobrehumana");
        this.agregarHabilidades("Invulnerabilidad");
    }


    @Override
    public HeroePrototipo clonar() {
        return new GuerreroPrototipo(this);
    }
}