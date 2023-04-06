import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        String Resultado1 = "src/resultado1.partido1";
        String Pronostico1 = "src/pronostico1.partido1";

        int Puntaje = +0;
        try {
            for (String linea : Files.readAllLines(Paths.get(Resultado1))) {
                String[] lineaSeparada = linea.split(";");


            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Puntaje = + Puntaje ");
    }


}