public class Ronda {
    String pronostico;
    List<Partido> partidos;


    public Ronda() {
        List <partidos> = new ArrayList<Partido>();
        Partido equipo1 = new Partido("Equipo 1");
        partidos.add(equipo1);

        Partido equipo2 = new Partido("Equipo 2");
        equipo2.correlativos.add(equipo1);
        partidos.add(equipo2);
    }
}
