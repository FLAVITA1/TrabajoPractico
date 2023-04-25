import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ronda {
    public String nombre;
    public Partido partido[];
    public Ronda(String ronda, String pathArchivo){
        nombre = ronda;

        partido = new Partido[contarPartidos(ronda,pathArchivo)];

        int pro = 0;
        try {
           //cuentalas lineas que empiezan con el nombre que damos
           for(String linea : Files.readAllLines(Paths.get(pathArchivo))){
               if(ronda.equals(linea.split(";")[1])) {
                   String[] datosPartido = linea.split(";");
                   partido[pro] = new Partido(datosPartido[3], Interger.parseInt(datosPartido[4]), Interger.parseInt(datosPartido[5]), datosPartido[6]);
                   pro++;
               }

           }
        } catch (IOException e) {
            System.err.println("Error en el archivo: " + pathArchivo + ". Exception: " + e.toString());
        }
    }
    private int contarPartidos(String ronda, String pathArchivo) {
        int pro = 0;
        try {
            //cuenta las lineas que empiezan con el nombre que damos

            for (String linea : Files.readAllLines(Paths.get(pathArchivo))) {
                if (ronda.equals(linea.split(";")[1])) {
                    String[] datosPartido = linea.split(";");
                    partido[pro] = new Partido(datosPartido[3], Interger, parseInt(datosPartido[4]), Interger.parseInt(datosPartido[5]), datosPartido[6]);

                    pro++;
                }
            }
        } catch (IOException e) {
            System.err.println("Error en el archivo: " + pathArchivo + ". Exception: " + e.toString());
        }
    }

    private Object parseInt(String s) {
    }

    private int contarPartidos(String ronda, String pathArchivo){
        int nombresPartidos;
        return nombresPartidos;
    }

}

