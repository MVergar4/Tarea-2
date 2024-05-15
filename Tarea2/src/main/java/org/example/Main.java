package org.example;
import java.time.Instant;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Nota n = new Nota();
        System.out.println(n.leerNota());
        n.añadirNota("Esta es la primera");
        System.out.println(n.leerNota());
        n.añadirNota("Esta es una segunda nota");
        System.out.println(n.leerNota());


        Date fecha= new Date(124,4,14,12,0,0);
        Instant instante = Instant.parse("2024-05-13T12:00:00Z");
        Instant instante_2 = Instant.parse("2024-05-13T13:00:00Z");
        Duration duracion = Duration.between(instante,instante_2);
        tipoReunion T = tipoReunion.MARKETING;
        ReunionPresencial R = new ReunionPresencial("Sala 111",fecha,instante,duracion,T);
        R.iniciar(instante);
        R.finalizar(instante_2);
        R.setNota("Llego el jefe ");
        R.CrearInforme(R.getSala());

    }
}