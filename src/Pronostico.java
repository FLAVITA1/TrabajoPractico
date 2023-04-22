import java.util.ArrayList;

public class Pronostico {

    public String ronda;
    public String fase;
    public int partido;
    public Object resultado;
    String nombre;
    String equipo;
    int haciertos;

    public Pronostico(String nombre, String equipo, int haciertos) {
        this.nombre = nombre;
        this.equipo = equipo;
        this.haciertos = haciertos;
    }

    public boolean ganados()

    int posicionPartido = this.equipo.partidosGanados.indexOf(this.partido);
        return(posicionPartido !=-1);


// cuantos haciertos tuvo cada participante


    for(
    int p = 0; p<participantes.size();p++)

    {
        Participante esteParticipante = participantes.get(p);
        int sumahaciertos = 0;
        for (int h = 0; h < haciertos.size(); h++) {
            Haciertos esteHacierto = haciertos.get(h);
            for (int e = 0; e < esteHacierto.equipoGanador.size(); e++) {
                Equipo esteEquipo = estehacierto.equipoGanador.get(e);

                if (esteParticipante.equipo.equals(esteEquipo.nombre)) {
                    int sumaHaciertos;
                    sumaHaciertos++;
                }
            }
        }

    }


}