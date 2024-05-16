package org.example;
import java.time.Instant;

/**
 * Registro de la invitación de un empleado y la hora a la que se le invitó
 */
public class Invitacion {
    /** Empleado invitado */
    private Empleado empleado;
    /** Hora a la que se invitó */
    private Instant hora;

    /**
     * Constructor por defecto, asigna empleado y hora
     * @param e empleado que se invitó
     * @param hora hora de la invitación
     */
    public Invitacion(Empleado e, Instant hora){
        empleado = e;
        this.hora=hora;
    }

    /**
     * Entrega el empleado almacenado
     * @return empleado invitado
     */
    public Empleado getEmpleado() {
        return empleado;
    }

    /**
     * Entrega la hora almacenada
     * @return hora de la invitación
     */
    public Instant getHora() {
        return hora;
    }
    /**
     * Descripción de la clase
     * @return descripción
     */
    public String toString() {
        return "Empleado " + empleado.getId() + ": invitado.";
    }
}
