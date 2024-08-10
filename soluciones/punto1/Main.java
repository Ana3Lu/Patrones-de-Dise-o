package punto1;



public class Main {
    public static void main(String[] args) {
        HeroePrototipo heroe = new  ArqueroPrototipo( "Sova", "Mono con pelo largo", 1000, 2, 500);
        HeroePrototipo clon;

        mostrarInformacion(heroe);
        clon = heroe.clonar();
        mostrarInformacion(clon);

        heroe.setNombre("Draco");
        heroe.setAspectoVisual("Moreno con pelo corto");
        mostrarInformacion(heroe);
    }


    public static void mostrarInformacion(HeroePrototipo heroe) {
        System.out.println("Nombre: " + heroe.getNombre());
        System.out.println("Aspecto Visual: " + heroe.getAspectoVisual());
        System.out.println("Experiencia: " + heroe.getExperiencia());
        System.out.println("Nivel: " + heroe.getNivel());
        System.out.println("Puntos: " + heroe.getPuntos());
        System.out.println("Lista de Habilidades: " + heroe.getListaHabilidades());
    }
}
