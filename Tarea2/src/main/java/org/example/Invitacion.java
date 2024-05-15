package org.example;
import java.time.Instant;

public class Invitacion {
    private Empleado empleado;
    private Instant hora;
    public Invitacion(Empleado e, Instant hora){
        empleado = e;
        this.hora=hora;
    }
}
