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



