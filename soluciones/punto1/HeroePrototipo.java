package punto1;

import java.util.ArrayList;
import java.util.List;

abstract class HeroePrototipo implements Heroe {
    private String nombre;
    private String aspectoVisual;
    private double experiencia;
    private int nivel;
    private int puntos;

   private List<String> listaHabilidades = new ArrayList<String>();


    public HeroePrototipo(Heroe heroePrototipo) {
        this.nombre = heroePrototipo.getNombre();
        this.aspectoVisual = heroePrototipo.getAspectoVisual();
        this.experiencia = heroePrototipo.getExperiencia();
        this.nivel = heroePrototipo.getNivel();
        this.puntos = heroePrototipo.getPuntos();
        this.listaHabilidades = heroePrototipo.getListaHabilidades();
    }


    public HeroePrototipo(String nombre, String aspectoVisual, double experiencia, int nivel, int puntos) {
        this.nombre = nombre;
        this.aspectoVisual = aspectoVisual;
        this.experiencia = experiencia;
        this.nivel = nivel;
        this.puntos = puntos;
    }

   public void agregarHabilidades(String habilidadEspecial){
        this.listaHabilidades.add(habilidadEspecial);

   }

    public void borrarHabilidades(String habilidadEspecial){
        this.listaHabilidades.remove(habilidadEspecial);

    }


    @Override
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getAspectoVisual() {
        return aspectoVisual;
    }

    public void setAspectoVisual(String aspectoVisual) {
        this.aspectoVisual = aspectoVisual;
    }

    @Override
    public double getExperiencia() {
        return  experiencia;
    }

    public void setExperiencia(double experiencia) {
        this.experiencia = experiencia;
    }
    @Override
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

   @Override
    public List<String> getListaHabilidades() {
        return listaHabilidades;
    }

    @Override
    public HeroePrototipo clonar() {
        return null;
    }
}
