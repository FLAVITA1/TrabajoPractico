import jdk.internal.icu.text.UTF16;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ;
        System.out.println("Prode Futbolistico");

        //Pronosticos de partidos

        String[] nombresPersona;
        Persona[] persona;
        Object listasPronosticos;
        if ("src/pronostico.csv".equals(args[1])) {
            String archivoPronosticos = args[1];
            nombresPersona = personas(archivoPronosticos);
            persona = new Persona[nombresPersona.length];
            for (int per = 0; per < persona.length;
                 per++) {
                persona[per] = new Persona(nombresPersona[per], archivoPronosticos);
            }
        } else {
            String url = args[1].split(";")[0];
            String user = args[1].split(";")[1];
            String pass = args[1].split(";")[2];
            ListaPronostico listaronosticos = new ListaPronosticos(url, user, pass);
            nombresPersona = personas(listasPronosticos);
            persona = new Persona(nombresPersona.length);

            for (int per = 0; per < persona.length;
                 per++) {
                ListaPronosticos listaPronosticos;
                persona[per] = new Persona(nombresPersona[per], listaPronosticos);

            }
        }
        //lista Resultados
        String archivoResultados = args[0];
        private static String[] fases String[] nombresFase = fases(archivoResultados);

        Fase[] fase = new Fase[nombresFase.length];
        for (int fs = 0; fs < fase.length; fs++)
            fase[fs] = new Fase(nombresFase[fs], archivoResultados);

        //Puntos de los participantes
        for (int per = 0; per < persona.length; per++) {
            System.out.println(persona[per].nombre + ";" + persona[per].puntos(fase));
        }


        (String archivoResultados){
        }

        private static String[] personas (Object listasPronosticos){
        }

        public static Object ListaPronosticos;
    }

    private static String[] personas(String archivoPronosticos) {
        String[] strings = new String[0];
        String[] strings1 = strings;
        return strings1;
    }

    List<Partido> partido = new ArrayList<>();
    List<Pronostico> pronostico = new ArrayList<>();

        try{
        Integer Interger;
        for(String linea:Files.readAllLines(Paths.get("src/partido.cvs"))){
                String[]lineaSeparada=linea.split(";");
                partido.add(new Partido(
                Interger.parseInt(lineaSeparada[0]),
                lineaSeparada[1],
                FloatparseFloat(lineaSeparada[2])));
                }

                for(String linea:Files.readAllLines(Paths.get("src/pronostico.cvs"))){
                String[]lineaSeparada=linea.split(";");
                pronostico.add(new Pronostico(
                Interger.parseInt(lineaSeparada[0]),
                double.parseDouble(lineaSeparada[2])))
                }
                }

private Object FloatparseFloat(String s){
        return null;
        }catch(IOException e){
        System.out.println("Leyendo archivo");
        }


public static Object ListaPronosticos;

        Persona(String nombre,ListaPronosticos listaPronostico){
        this.nombre=nombre;
        int pro=0;
        for(String linea:listaPronostico.pronosticos){
        String[]parte=linea.split(";");
        if(nombre.equals(parte[0]))
        pro++;
        }
        pronostico=new Pronostico[pro];
        for(pro=0;pro<pronostico.length;pro++))
        pronostico[pro]=new Pronostico();
        pro=0;
        }

        ////////////////////////////////
        List<String[]>resultados=leerResultados();
public static List<String[]>leerPronosticos List<String[]>pronosticos=leerPronosticos();

        System.out.println("Fase\tRonda\tnombre equipo 1\tnombre equipo 2\tgoles equipo 2");
        for(String[]esteResultado:resultados){
        System.out.println(esteResultado[0]+"\t"+esteResultado[1]+"\t"+esteResultado[2]+"\t"+esteResultado[3]+"\t"+esteResultado[4]+"\t"+esteResultado[5]);

        }
        System.out.println("\n\nNombre persona\tFase\tRonda\tNombre equipo 1\tNombre equipo2\tGanador");
        for(String[]estePronostico:pronosticos){
        System.out.println(estePronostico[0]+"\t"+estePronostico[1]+"\t"+estePronostico[2]+"\t"+estePronostico[3]+"\t"+estePronostico[4]+"\t"+estePronostico[5]);
        }


// Va a devolver una Lista con un arreglo de String que va a contener:
// Posicion 0: Ronda
// Posicion 1: Fase
// Posicion 2: Nombre equipo 1
// Posicion 3: Nombre equipo 2
// Posicion 4: Goles equipo 1
// Posicion 5: Goles equipo 2
public static List<String[]>leerResultados(){
        List<String[]>resultados=new ArrayList<>();

        // Cargamos el Driver
        try{
        Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e){
        System.out.println("Error cargando el driver");
        }

        try{
        // Creamos la conexión
        Connection con=DriverManager.getConnection(
        "jdbc:mysql://sql10.freemysqlhosting.net:3306/sql10612293",
        "sql10612293","ACwUKDKvbY");
        Statement stmt=con.createStatement();

        // El Query que vamos a correr
        ResultSet rs=stmt.executeQuery("SELECT FASE, RONDA, E1.EQUIPO AS EQUIPO_1, E2.EQUIPO AS EQUIPO_2, GOLES_1, GOLES_2 FROM RESULTADOS R JOIN EQUIPOS E1 on R.ID_EQUIPO_1 = E1.ID_EQUIPO JOIN EQUIPOS E2 on R.ID_EQUIPO_2 = E2.ID_EQUIPO");
        while(rs.next()){
        String[]fila=new String[6];
        fila[0]=rs.getString("FASE");
        fila[1]=rs.getString("RONDA");
        fila[2]=rs.getString("EQUIPO_1");
        fila[3]=rs.getString("EQUIPO_2");
        fila[4]=rs.getString("GOLES_1");
        fila[5]=rs.getString("GOLES_2");
        resultados.add(fila);
        }
        con.close();
        }catch(SQLException e){
        System.out.println("Error con SQL");
        }

        return resultados;
        }


// Va a devolver una Lista con un arreglo de String que va a contener:
// Posicion 0: Ronda
// Posicion 1: Fase
// Posicion 2: Nombre equipo 1
// Posicion 3: Nombre equipo 2
// Posicion 4: Goles equipo 1
// Posicion 5: Goles equipo 2
public static List<String[]>leerResultados(){
        List<String[]>resultados=new ArrayList<>();

        // Cargamos el Driver
        try{
        Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e){
        System.out.println("Error cargando el driver");
        }

        try{
        // Creamos la conexión
        Connection con=DriverManager.getConnection(
        "jdbc:mysql://sql10.freemysqlhosting.net:3306/sql10612293",
        "sql10612293","ACwUKDKvbY");
        Statement stmt=con.createStatement();

        // El Query que vamos a correr
        ResultSet rs=stmt.executeQuery("SELECT FASE, RONDA, E1.EQUIPO AS EQUIPO_1, E2.EQUIPO AS EQUIPO_2, GOLES_1, GOLES_2 FROM RESULTADOS R JOIN EQUIPOS E1 on R.ID_EQUIPO_1 = E1.ID_EQUIPO JOIN EQUIPOS E2 on R.ID_EQUIPO_2 = E2.ID_EQUIPO");
        while(rs.next()){
        String[]fila=new String[6];
        fila[0]=rs.getString("FASE");
        fila[1]=rs.getString("RONDA");
        fila[2]=rs.getString("EQUIPO_1");
        fila[3]=rs.getString("EQUIPO_2");
        fila[4]=rs.getString("GOLES_1");
        fila[5]=rs.getString("GOLES_2");
        resultados.add(fila);
        }
        con.close();
        }catch(SQLException e){
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
        (){
        List<String[]>pronosticos=new ArrayList<>();

        // Cargamos el Driver
        try{
        Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e){
        System.out.println("Error cargando el driver");
        }

        try{
        // Creamos la conexión
        Connection con=DriverManager.getConnection(
        "jdbc:mysql://sql10.freemysqlhosting.net:3306/sql10612293",
        "sql10612293","ACwUKDKvbY");
        Statement stmt=con.createStatement();

        // El Query que vamos a correr
        ResultSet rs=stmt.executeQuery("SELECT NOMBRE, FASE, RONDA, E1.EQUIPO AS EQUIPO_1, E2.EQUIPO AS EQUIPO_2, GANADOR FROM PRONOSTICOS P JOIN RESULTADOS R on P.ID_RESULTADO = R.ID_RESULTADO JOIN EQUIPOS E1 on R.ID_EQUIPO_1 = E1.ID_EQUIPO JOIN EQUIPOS E2 on R.ID_EQUIPO_2 = E2.ID_EQUIPO");
        while(rs.next()){
        String[]fila=new String[6];
        fila[0]=rs.getString("NOMBRE");
        fila[1]=rs.getString("FASE");
        fila[2]=rs.getString("RONDA");
        fila[3]=rs.getString("EQUIPO_1");
        fila[4]=rs.getString("EQUIPO_2");
        fila[5]=rs.getString("GANADOR");
        pronosticos.add(fila);
        }
        con.close();
        }catch(SQLException e){
        System.out.println("Error con SQL");
        }

        return pronosticos;
        }


private static Object FloatparseFloat(String s){
        }

private static List<String[]>leerResultados(){
        return null;

        }

        }

 }  }