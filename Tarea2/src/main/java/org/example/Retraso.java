package org.example;
import java.time.Instant;

/**
 * Registro de los empleados que llegaron después de la hora a la que fueron citados
 */
public class Retraso extends Asistencia {
    /** Hora a la que llegó */
    private Instant hora;

    /**
     * Constructor por defecto, asigna empleado y hora
     * @param e empleado que llegó
     * @param hora hora a la que llegó
     */
    public Retraso(Empleado e, Instant hora){
        super(e);
        this.hora=hora;
    }

    /**
     * Entrega la hora a la que llegó el empleado atrasado
     * @return hora de retraso
     */
    public Instant getHora() {
        return hora;
    }
    /**
     * Descripción de la clase
     * @return descripción
     */
    public String toString() {
        return "Empleado " + empleado.getId() + ": atrasado.";
    }
}