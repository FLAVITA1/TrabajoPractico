import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class Main {
    public static void main(String[] args) {
        List<Partido> partido = new ArrayList<>();
        List<Pronostico> pronostico = new ArrayList<>();

        try {
            for (String linea : Files.readAllLines(Paths.get("src/partido.cvs"))) {
                String[] lineaSeparada = linea.split( ";");
            partido.add(new Partido(
                    Interger.parseInt(lineaSeparada[0]),
                    lineaSeparada[1],
                    FloatparseFloat(lineaSeparada[2])));
            }

        for (String linea: Files.readALlines(Paths.get( "src/pronostico.cvs"))) {
            String[] lineaSeparada = linea.split(";");
            pronostico.add(new Pronostico(
                    Interger.parseInt(lineaSeparada[0]),
                    double.parseDouble(lineaSeparada[2])))
        }
        } catch (IOException e) {
            System.out.println("Leyendo archivo");
        }


///////////////////////////////////
        List<String[]> resultados = leerResultados();
        List<String[]> pronosticos = leerPronosticos();

       System.out.println("Fase\tRonda\tnombre equipo 1\tnombre equipo 2\tgoles equipo 2");
        for (String[] esteResultado : resultados) {
            System.out.println(esteResultado[0] + "\t" + esteResultado[1] + "\t" + esteResultado[2] + "\t" + esteResultado[3] + "\t" + esteResultado[4] + "\t" + esteResultado[5]);

        }
        System.out.println("\n\nNombre persona\tFase\tRonda\tNombre equipo 1\tNombre equipo2\tGanador");
         for (String[] estePronostico : pronosticos) {
             System.out.println(estePronostico[0] + "\t" + estePronostico[1] + "\t" + estePronostico[2] + "\t" + estePronostico[3] + "\t" + estePronostico[4] + "\t" + estePronostico[5]);
         }

        }

        for(int e = 0; <equipos.size(); e++)  {
            equipo esteEquipo = equipos.get(e);
            for (int p = 0; p < partidos.size(); p++) {
                Partido estePartido = partidos.get(p);
                if (estePartido.resultado == esteEquipo.resultado) {
                    esteEquipo.total = esteEquipo.cantidad * estePartido.ganado;
                }
            }
    }
           for(int e = 0; <equipos.size(); e++)  {
        Equipo esteEquipo = equipos.get(e);
        for (int p = 0; p < partidos.size(); p++) {
            Partido estePartido = partidos.get(p);
            if (estePartido.resultado == esteEquipo.resultado) {
                System.out.println("se gano el partido [" + estePartido.nombre + " x " + esteEquipo.cantidad + )
            }
    }