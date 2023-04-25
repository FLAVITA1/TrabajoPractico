import jdk.internal.icu.text.UTF16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Persona {
    public String nombre;
    public Pronostico[] pronostico;

    public Persona(String nombre, String pathArchivo) {
        this.nombre = nombre;

        try {
            int pro = 0;
            for (String linea : Files.readAllLines(Paths.get(pathArchivo))) {
                String[] parte = linea.split(";");
                if (nombre.equals(parte[0]))
                    pro++;


            }
            pronostico = new Pronostico[pro];
            for (pro = 0; pro < pronostico.length; pro++)
                pronostico[pro] = new Pronostico();

            pro = 0;
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
        for (String linea : listaPronosticos.pronosticos) {
            String[] parte = Linea.split(";");
            if (nombre.equals(parte[0])) {
                pronostico[pro].fase = parte[1];
                pronostico[pro].ronda = parte[2];
                pronostico[pro].partido = Integer.parseInt(parte[3]);
                pronostico[pro].equipo = parte[4];
                if (parte[5].equals("1"))
                    pronostico[pro].resultado = Resultado.valueOf("ganador");
                else if (parte[5].equals("2"))
                    pronostico[pro].resultado = Resultado.valueOf("perdedor");
                else
                    pronostico[pro].resultado = Resultado.valueOf("empate");
                pro++;
            }
        }
    }

    public int puntos(Fase[] fase) {
        //las rondas  de 6 partidos hacen un total de 64
        pronostico = 64
        // los pronosticos,rondas y partidos empiezan en 0 y avansan de 1

        int totalPuntos = 0;
        int puntosFaseIniciales = 0;
        int puntosRondaIniciales = 0;
        int pro = 0, fs = 0, rond = 0, pro = 0;
        try {
            //hacemos un forrond,un for pro y un if nos da resultado de ronda de ahi la suma de los puntos

            for (pro = 0; pro < pronostico.length; pro++) {
                for (fs = 0; fs < fase.lengh; fs++) {
                    puntosFaseIniciales = totalPuntos;
                    for (rond = 0; rond < fase[fs].ronda.length; rond++) {
                        puntosRondaIniciales = totalPuntos;
                        for (pro = 0; (pro < fase[fs].ronda[rond].partido.length) && (pro < pronostico.length); pro++, pro)
                            ;
                        if (pronostico[pro].resultado == fase[fs].ronda[rond].partido)
                            totalPuntos++;

                        //puntos extra por ronda
                        if (totalPuntos - puntosRondaIniciales == pro)
                            totalPuntos++;
                    }
                    if (totalPuntos - puntosFaseIniciales == fs)
                        totalPuntos++;
                }
            }

        } catch (Exception e) {
            System.out.println("Error cuando compara pronosticos con resultados. Error:" + e.toString());
            System.out.println("Puede que el pronostico no coincida con los partidos por ronda");
            String prt;
            System.out.println("catch tiene personas" + pro + ";" + fs + ";" + ";" + prt);
        }
        return totalPuntos;
    }

}















}
