package org.example;
import java.time.Instant;

public class Invitacion {
    private Empleado empleado;
    private Instant hora;
    public Invitacion(Empleado e, Instant hora){
        empleado = e;
        this.hora=hora;
    }
    public Empleado getEmpleado() {
        return empleado;
    }
    public Instant getHora() {
        return hora;
    }
    public String toString() {
        return "Empleado " + empleado.getId() + ": invitado.";
    }
}
