public class Pronostico {

    String equipo1;
    String equipo2;
    int gol1;
    int gol2;


}
public class Pronostico {
    Equipo equipo;
    Partido partido;
    public Pronostico(Equipo equipo, Partido partido) {
        this.equipo = equipo;
        this.partido = partido;
    }

    public boolean ganados() {
        int posicionPartido = this.equipo.partidosGanados.indexOf(this.partido);
        return (posicionPartido != -1);
    }
}