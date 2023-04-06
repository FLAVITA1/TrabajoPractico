import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        String Resultado1 = "src/resultado1.partido1";
        String Pronostico1 = "src/pronostico1.partido1";

        int Puntaje = +0;
        try {
            for (String linea : Files.readAllLines(Paths.get(Resultado1))) {
                String[] lineaSeparada = linea.split(";");



            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Puntaje = + Puntaje ");


        public class Pronostico {
            String equipo1;
            String equipo2;
            int gol1;
            int gol2;

        }
        public class partido;
        {
            public class Ronda {
                String pronostico;
                List<partido> partidos;

                public Ronda() {
                    List<Partidos> =new ArrayList<Partido>();
                    Partido equipo1 = new Partido("Equipo 1");
                    partidos.add(equipo1);

                    Partido equipo2 = new Partido("Equipo 2");
                    equipo2.correlativos.add(equipo1);
                    partidos.add(equipo2);
                }

                public Ronda() {
                    List<Resultado> =mew ArrayList<Resultado > ();
                    Resultado equipo1 = new Resultado("Equipo1");
                    resultado.add(gol1);

                    Resultado equipo2 = new Resultado("Equipo2");
                    equipo2.partidoganado.add(equipo2);
                    resultado.add(gol2);

                }
            }
        }
    }
}