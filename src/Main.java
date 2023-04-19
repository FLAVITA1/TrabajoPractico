import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Partido> partido = new ArrayList<>();
        List<Pronostico> pronostico = new ArrayList<>();

        try {
            for (String linea : Files.readAllLines(Paths.get("src/partido.cvs"))) {
                String[] lineaSeparada = linea.split(";");
                partido.add(new Partido(
                        Interger.parseInt(lineaSeparada[0]),
                        lineaSeparada[1],
                        FloatparseFloat(lineaSeparada[2])));
            }

            for (String linea : Files.readAllLines(Paths.get("src/pronostico.cvs"))) {
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






        for (int e = 0; <equipos.size();e++)

    {
        equipo esteEquipo = equipos.get(e);
        for (int p = 0; p < partidos.size(); p++) {
            Partido estePartido = partidos.get(p);
            if (estePartido.resultado == esteEquipo.resultado) {
                esteEquipo.total = esteEquipo.cantidad * estePartido.ganado;
            }
        }
    }
           for (int e = 0; <equipos.size(); e++)

    {
        Equipo esteEquipo = equipos.get(e);
        for (int p = 0; p < partidos.size(); p++) {
            Partido estePartido = partidos.get(p);
            if (estePartido.resultado == esteEquipo.resultado) {
                System.out.println("se gano el partido [" + estePartido.nombre + " x " + esteEquipo.cantidad +)
            }
        }
    }

    // Va a devolver una Lista con un arreglo de String que va a contener:
    // Posicion 0: Ronda
    // Posicion 1: Fase
    // Posicion 2: Nombre equipo 1
    // Posicion 3: Nombre equipo 2
    // Posicion 4: Goles equipo 1
    // Posicion 5: Goles equipo 2
    public static List<String[]> leerResultados() {
        List<String[]> resultados = new ArrayList<>();

        // Cargamos el Driver
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Error cargando el driver");
        }

        try {
            // Creamos la conexión
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://sql10.freemysqlhosting.net:3306/sql10612293",
                    "sql10612293", "ACwUKDKvbY");
            Statement stmt = con.createStatement();

            // El Query que vamos a correr
            ResultSet rs = stmt.executeQuery("SELECT FASE, RONDA, E1.EQUIPO AS EQUIPO_1, E2.EQUIPO AS EQUIPO_2, GOLES_1, GOLES_2 FROM RESULTADOS R JOIN EQUIPOS E1 on R.ID_EQUIPO_1 = E1.ID_EQUIPO JOIN EQUIPOS E2 on R.ID_EQUIPO_2 = E2.ID_EQUIPO");
            while (rs.next()) {
                String[] fila = new String[6];
                fila[0] = rs.getString("FASE");
                fila[1] = rs.getString("RONDA");
                fila[2] = rs.getString("EQUIPO_1");
                fila[3] = rs.getString("EQUIPO_2");
                fila[4] = rs.getString("GOLES_1");
                fila[5] = rs.getString("GOLES_2");
                resultados.add(fila);
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error con SQL");
        }

        return resultados;
    }

    // Va a devolver una Lista con un arreglo de String que va a contener:
    // Posicion 0: Nombre de la persona
    // Posicion 1: Fase
    // Posicion 2: Ronda
    // Posicion 3: Nombre equipo 1
    // Posicion 4: Nombre equipo 2
    // Posicion 5: Ganador
    public static List<String[]> leerPronosticos() {
        List<String[]> pronosticos = new ArrayList<>();

        // Cargamos el Driver
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Error cargando el driver");
        }

        try {
            // Creamos la conexión
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://sql10.freemysqlhosting.net:3306/sql10612293",
                    "sql10612293", "ACwUKDKvbY");
            Statement stmt = con.createStatement();

            // El Query que vamos a correr
            ResultSet rs = stmt.executeQuery("SELECT NOMBRE, FASE, RONDA, E1.EQUIPO AS EQUIPO_1, E2.EQUIPO AS EQUIPO_2, GANADOR FROM PRONOSTICOS P JOIN RESULTADOS R on P.ID_RESULTADO = R.ID_RESULTADO JOIN EQUIPOS E1 on R.ID_EQUIPO_1 = E1.ID_EQUIPO JOIN EQUIPOS E2 on R.ID_EQUIPO_2 = E2.ID_EQUIPO");
            while (rs.next()) {
                String[] fila = new String[6];
                fila[0] = rs.getString("NOMBRE");
                fila[1] = rs.getString("FASE");
                fila[2] = rs.getString("RONDA");
                fila[3] = rs.getString("EQUIPO_1");
                fila[4] = rs.getString("EQUIPO_2");
                fila[5] = rs.getString("GANADOR");
                pronosticos.add(fila);
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error con SQL");
        }

        return pronosticos;
    }
}