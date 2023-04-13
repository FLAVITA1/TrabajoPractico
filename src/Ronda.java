import java.time.LocalDate;

public class Ronda {
    Equipo[] equipos;
    Gol gol;
    public Ronda () {
        equipos = new Equipo[2];
     }

    public boolean HacerGoles(Goles gol) {
        if (gol != null && (gol.primerFecha == null \\ gol.primerFecha.isAfter(localDate.now()))
            this.goles = gol;
        return true;

    }
    return false;
}

 public double CalcularGoles() {
     double suma = 0;
     for (Equipo equip : equipos) {
         if (equip != null)
             suma += equip.gol * equip.resultado;
     }
     if (gol != null && suma > gol.cantidad)
         suma = suma - gol.calcularGoles(suma);
     return suma;
 }



}


//////////////////////////////
public class Ronda {
    String nro;
    List<partido> partidos;

    public Ronda(){
        partidos = new ArrayList<partido>();
    }

    public agregarPartido(Partido p) {
        partidos.add(p)
    }




    public Ronda(){
        Ronda ronda1=new Ronda();

        ronda1.partidos[0]// nos da el primer partido
        ronda1.partidos[1]// nos da el segundo partido
        ronda1.partidos[i]// nos da el partido

        partidos:Partido[1]
        return ronda;


        }
}