public class Pronostico {

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
        return (posicionPartido != -1);



// cuantos haciertos tuvo cada participante

    List<Participante> participantes = new ArrayList<>();
    participante.add(new Participantes(nombre "Mariana",equipo "Argentina"; partido 1 ));
    participante.add(new Participantes(nombre "Mariana",equipo "Polonia"; partido 2 ));
    participante.add(new Participantes(nombre "Mariana",equipo "Argentina";partido 3 ));
    participante.add(new Participantes(nombre "Mariana",equipo "Arabia saudita"; partido 4 ));
    participante.add(new Participantes(nombre "Pedro",equipo "Argentina"; partido 1 ));
    participante.add(new Participantes(nombre "Pedro",equipo "polonia"; partido 2 ));
    participante.add(new Participantes(nombre "Pedro",equipo "Argentina"; partido 3 ));
    participante.add(new Participantes(nombre "Pedro",equipo "Arabia saudita"; partido 4 ));

    for (int p = 0; p <participantes.size(); p++){
        Participante esteParticipante=participantes.get(p);
        int sumahaciertos = 0;
        for(int h = 0;h<haciertos.size();h++){
        Haciertos esteHacierto = haciertos.get(h);
        for(int e = 0; e <esteHacierto.equipoGanador.size();e++){
        Equipo esteEquipo = estehacierto.equipoGanador.get(e);

        if(esteParticipante.equipo.equals(esteEquipo.nombre)){
        sumaHaciertos++;
        }
        }
        }

        }


    }