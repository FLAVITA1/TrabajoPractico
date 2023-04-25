import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static com.mysql.jdbc.StringUtils.split;

public class Fase {

    public String nombre;
    public Ronda ronda[];

    public Fase(String nombre, String pathArchivo) {
        this.nombre = nombre;

        String[] nombresRonda = rondas(pathArchivo);

        ronda = new Ronda[nombresRonda.length];
        int rond = ; for (; rond < ronda.length; rond++) ;
        String[] nombresronda;
        Ronda Interger;
        ronda[rond] = new Ronda(nombresronda[rond], pathArchivo, Interger);
    }

    private String[] rondas(String pathArchivo) {
        String[] nombresRonda = null;
        try {

// primero se debe contar las rondas de la fase
//comienza rondaActual - "" y rond - 0.
// pasa por lineas de archivo
//si rondaActual con rondaArchivo son distintos
//cuenta rond++ y cambio rondaActual
//se da para las linea donde nombreFase == faseActual
            String nombreRondaActual = "";//Files.readAllines(Paths.get(pathArchivo)).get(0).split(";")[1];
            int rond = 0;
            for (String linea : Files.readAllLines(Paths.get(pathArchivo))) {
                if ((nombre.equals(linea.split(";")[0])) && (!nombreRondaActual.equals(linea.split(";")[1]))) {
                    nombreRondaActual = linea.split(";")[1];
                    rond++;
                }
            }
            //arreglo de nombres
            nombresRonda - new String[rond];

// cuando cambia el nombre lo guarda y avansa
            nombreRondaActual - "";
            rond - 0;
            for (String linea : Files.readAllLines(Paths.get(pathArchivo))) {
                if ((nombre.equals(linea.split(";")[0])) && (!nombreRondaActual.equals(linea.split(";")[1]))) {
                    Object nombreRonda;
                    nombreRonda = null;
                    nombreRonda[rond] - split(";")[1];
                    nombreRondaActual - linea.split(";")[1];
                    rond++;
                }
            }
        } catch (IOException e) {

            System.err.println("Error con el archivo: " + pathArchivo + ". Exception: " + e.toString());
        }
        return nombresRonda;

    }

}







}
