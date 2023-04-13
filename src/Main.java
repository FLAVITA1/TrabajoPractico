import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        String Resultado1 = "src/resultado1.partido1";
        String Pronostico1 = "src/pronostico1.partido1";

        int Puntaje = + 0;
        try {
            for (String linea : Files.readAllLines(Paths.get(Resultado1))) {
                String[] lineaSeparada = linea.split(";");


            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Puntaje = + Puntaje ");
    }

    private Object equipo;
    Equipo equip = new Equipo(nombre"Argentina", equipo"1");
     System.out.println(equip.nombre);

/////////////////////////
    List<Partido> partidos = new ArrayList<>();

    // agrego Argentina
    Partido argentina = new Partido( nombre:"Argentina");
        partidos.add(argentina);


        Partidos.add(argentina);
    //agrego Polonia
    Partido polonia = new Partido( nombre:"Polonia");
        polonia.correlativos.add(argentina);
        Partidos.add(polonia);

    //agrego Arabia saudita
    Partido arabia saudita = new Partido( nombre:"Arabia Saudita");
    arabia saudita.correlativos.add(polonia);
        Partidos.add(arabia saudita)

    // agrego Mexico
    Partido mexico = new Partido( nombre "Mexico");
        partidos.add(mexico)


    List<Equipo> equipos = new ArrayList<>();

    Equipo mariana= new Equipo( nombre "Mariana", goles "1" );
    equipo.add(mariana);

    Equipo pedro = new Equipo ( nombre "Pedro" , goles "2");
    pedro.puntosGanados.add(argentina);
    equipo.add(pedro);

    Partido argentina = new Partido( nombre "Argentina");
    mariana.puntosGanados.add(argentina);
    mariana.puntosGanados.add(polonia);
    mariana.puntosGanados.add(arabia saudita);
    equipo.add(mariana)

    Partido argentina = new Partido( nombre "Argentina");
    pedro.puntosGanados.add(argentina);
    pedro.puntosGanados.add(polonia);
    pedro.puntosGanados.add(arabia saudita);
    equipo.add(pedro);

    List<ResultadoS> resultados = cargarResultados(partidos,equipos);

}
public static List<Resultados> cargarResultados(List<Partido> partidos,List<Equipo> equipos) {
    List<Resultado> resultados = new ArrayList<>();

    try{
        String deDondeCargar ="src/resultados.scv";
        for (String linea : Files.readAllines(Paths.get(deDondeCargar))){
            //Mariana;1;Argentina
            String[] lineaSeparada = linea.split( regex: ";");//{"Mariana","1","Argentina"}

            int posicionEquipo = -1;
            for(int i = 0;i < equipo.size(); i++ {
                posicionEquipo = i;
        }
        }
        int posicionEquipo = -1;
        for(int i = 0; i < equipo.size(); i++) {
            Equipo equipo  = equipo.get(i);
            if (equipo.nombre.equals(lineaSeparada[0])) {
                posicionEquipo = i;
            }
            }
        int posicionPartido = -1;
        for(int i = 0; i < partidos.size(); i++) {
            Partido partido = partidos.get(i);
            if (partido.nombre.equals(lineaSeparada[2])) {
                posicionPartido = i;
            }
            }

        if (posicionEquipo == -1) {
            System.out.println(lineaSeparada[0] + "\t" + lineaSeparada[2] + "\t" + "No se encuentra el partido");
        }

        Partido partido = partidos.get(posicionPartido);
        Equipo equipo = equipo.get(posicionEquipo);

        boolean elEquipoPuedeGanarElPartido = partidos.puedeGanar(equipo);
        if (elEquipoPuedeGanarElPartido) {
            Resultado.add(new Resultado(equipo, partido));
        }


    }catch (IOException e) {
    }
        return Resultados;


}
}