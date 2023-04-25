import jdk.internal.access.JavaIOFileDescriptorAccess;

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
    int p = 0; p<persona.size();p++)

    {
        JavaIOFileDescriptorAccess personas;
        Persona estePersona = personas.get(p);
        int sumahaciertos = 0;
        for (int h = 0; h < aciertos.size(); h++) {
            aciertos esteAcierto = aciertos.get(h);
            for (int e = 0; e < esteacierto.equipoGanador.size(); e++) {
                Equipo esteEquipo = esteAcierto.equipoGanador.get(e);

                if (estaPersona.equipo.equals(esteEquipo.nombre)) {
                    int sumaAciertos;
                    sumaAciertos++;
                }
            }
        }

    }


}