import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ListaPronostico {
    List<String> pronosticos;

    public ListaPronosticos(String url, String user, string pass){
        pronostico = new ArrayList<String>();

        try {
            //conexion BD
            Connection con = DriverManager.getConnection(url,user,pass);
            Statement stat = con.createStatement();

            //HACER query
            String query ="";

           / //pronostico.cvs
            query ="SELECT NOMBRE, FASE, RONDA, E1.EQUIPO AS EQUIPO_1, E2.EQUIPO AS EQUIPO_2, GANADOR FROM PRONOSTICO P
            ResultSet rs = stat.executeQuery(query);
            String rondaActual ="";
            int pro = 1;
            while(rs.next()){
                if(!rondaActual.equals(rs.getString(3))){
                    pro=1
                }
                pronosticos.add(rs.getString(1) + ";" + rs.getString(2) + ";" + rs.getString(3)+ ";" + pro ";" + rs.getString(4))
            }


































        }
    }









}
