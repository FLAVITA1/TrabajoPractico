import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ronda {
    String nro;
    List<partido> partidos;

    public Ronda() {
        partidos = new ArrayList<partido>();
    }

    public agregarPartido(Partido p) {
        partidos.add(p);
    }

}

