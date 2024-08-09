package punto1;

abstract class HeroePrototipo implements Heroe {
    private String habilidades;
    private String nombre;
    private String aspectoVisual;
    private String experiencia;
    private String nivel;
    private double puntos;

    public HeroePrototipo(HeroePrototipo heroePrototipo) {
        this.habilidades = heroePrototipo.habilidades;
        this.nombre = heroePrototipo.nombre;
        this.aspectoVisual = heroePrototipo.aspectoVisual;
        this.experiencia = heroePrototipo.experiencia;
        this.nivel = heroePrototipo.nivel;
        this.puntos = heroePrototipo.puntos;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAspectoVisual() {
        return aspectoVisual;
    }

    public void setAspectoVisual(String aspectoVisual) {
        this.aspectoVisual = aspectoVisual;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public double getPuntos() {
        return puntos;
    }

    public void setPuntos(double puntos) {
        this.puntos = puntos;
    }
}
