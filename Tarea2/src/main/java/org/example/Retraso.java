package org.example;
import java.time.Instant;
public class Retraso extends Asistencia {
    private Instant hora;
    public Retraso(Empleado e, Instant hora){
        super(e);
        this.hora=hora;
    }
    public Instant getHora() {
        return hora;
    }
}