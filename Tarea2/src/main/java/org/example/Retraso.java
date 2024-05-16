package org.example;
import java.time.Instant;

/**
 * Clase que sirve para anotar los atrasoss
 */
public class Retraso extends Asistencia {
    /** Hora de llegada */
    private Instant hora;

    /**
     * Constructor que guarda la hora de llegada
     * @param e Empleado que llega tarde
     * @param hora Hora de llegada
     */
    public Retraso(Empleado e, Instant hora){
        super(e);
        this.hora=hora;
    }

    /**
     * getter de la hora de llegada
     * @return La hora
     */
    public Instant getHora() {
        return hora;
    }

    /**
     * Sirve para que el toString de detalles del empleado que llego tarde
     * @return frase con la id del trabajdor atrasado
     */
    @Override
    public String toString() {
        return "Empleado " + empleado.getId() + ": atrasado.";
    }
}