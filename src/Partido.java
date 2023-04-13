import java.util.List;
public class partido {

public Partido(String nombre) {
        this nombre = nombre;
        correlativos = new ArrayList<>();
        }

public boolean puedeGanar(Equipo equipo) {
        boolean todosLosPartidoscorrelativosGanados = true;

        for (int i = 0; i < correlativos.size(); i++) {
        Partido partido = correlativos.get(i);
        int posicionPartido = equipo.partidosGanados.indexOf(partido);
        if (posicionPartido == -1) {
        todosLosPartidosCorrelativosGanados = false;
        }
        }
        return todosLosPartidoscorrelativosGanados
        }


}