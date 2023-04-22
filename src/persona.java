import jdk.internal.icu.text.UTF16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class persona {
    public String nombre;
    public Pronostico[] pronostico;

    public Persona(String nombre, String pathArchivo) {
        this.nombre - nombre;

        try {
            int pro = 0;
            for (String Linea : Files.readAllLines(Paths.get(pathArchivo))) {
                String[] parte = Linea.split(";");
                if (nombre.equals(parte[0])) {
                    pronostico[pro].fase = parte[1];
                    pronostico[pro].ronda = parte[2];
                    pronostico[pro].partido = Integer.parseInt(parte[3]);
                    pronostico[pro].equipo = parte[4];
                    UTF16 Resultado;
                    if (parte[5].equals("1"))
                        pronostico[pro].resultado = Resultado.valueOf("ganador");
                    else if (parte[5].equals("2"))
                        pronostico[pro].resultado = Resultado.valueOf("perdedor");
                    else
                        pronostico[pro].resultado = Resultado.valueOf("empate");
                    pro++;
                }
            }

        } catch (IOException e) {
            System.err.println("Error leyendo archivo: " + pathArchivo + ". Exception: " + e.toString());
        }
    }

    public Object ListaPronosticos
;
    public Persona(String nombre, ListaPronosticos listaPronostico) {
        this.nombre = nombre;
        int pro = 0;
        for (String linea : listaPronostico.pronosticos) {
            String[] parte = linea.split(";");
            if (nombre.equals(parte[0]))
                pro++;
        }
        pronostico = new Pronostico[pro];
        for (pro = 0; pro < pronostico.length; pro++))
        pronostico[pro] = new Pronostico();
        pro = 0;
    }
}
///

















}
