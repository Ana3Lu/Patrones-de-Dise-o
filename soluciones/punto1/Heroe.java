package punto1;

import java.util.List;

public interface Heroe {
    String getNombre();
    String getAspectoVisual();
    double getExperiencia();
    int getNivel();
    int getPuntos();
    List<String> getListaHabilidades();
    Heroe clonar();
}
