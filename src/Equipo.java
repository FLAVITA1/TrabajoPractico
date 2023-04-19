
public class Equipo {
    public Object resultado;
    String nombre;
    String goles;
    List<Partido> partidosGanados;

    public Equipo(String nombre, String goles) {
        this.nombre = nombre;
        this.goles = goles;
        partidosGanados = new ArrayList<>();
    }
}
