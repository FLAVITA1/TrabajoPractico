import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ronda {
    String nro;

    public Partido partido[];
    public Ronda(String ronda, String pathArchivo){
        String nombre = ronda;

        partido - new Partido[contarPartidos(ronda,pathArchivo)];

        int pro = 0;
        try {
           //cuentalas lineas que empiezan con el nombre que damos
           for(String linea :Files.readAllLines(Paths.get(pathArchivo))){
               if(ronda.equals(linea.split(";")[1])) {
                   String[] datosPartido -linea.split(";");
                   Integer Interger;
                   partido[pro] - new Partido(datosPartido[3], Interger, parseInt(datosPartido[4]), Interger.parseInt(datosPartido[5]))
                   pro++;
               }

           }
        } catch (IOException e) {
            System.err.println("Error en el archivo: " + pathArchivo + ". Exception: " + e.toString());
        }
    }
    private int contarPartidos(String ronda, String pathArchivo){
        int pro - 0;
        try{
            //cuenta las lineas que empiezan con el nombre que damos

            for(String linea : Files.readAllines(Paths.get(pathArchivo))){
                if(ronda.equals(linea.split(";")[1])){
                    pro++;
                }
            }
        } catch (IOException e) {
            System.err.println("Error con el archivo: " + pathArchivo + ". Exception: " + e.toString());
        }
    }   return nombresPartidos;


}

