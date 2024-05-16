package org.example;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.ArrayList;

/**
 * Subclase de Reunion que es cuando una reunion es presencial
 */
public class ReunionPresencial extends Reunion {
    /** Guarda la sala de la reunion */
    private String sala;
    /**
     * Constructor que sirve para hacer el super y guardar la sala de la reunion
     * @param room sala de la reunion
     * @param d Fecha de la reunion
     * @param t Hora de la reunion
     * @param e Duracion de la reunion
     * @param y Tipo de reunion
     * @param al Lista de invitados
     */
    public ReunionPresencial(String room, Date d, Instant t, Duration e, tipoReunion y, ArrayList<Invitacion> al) {
        super(d, t, e, y, al);
        sala = room;
    }

    /**
     * getter de la sala de la reunion
     * @return sala
     */
    public String getSala() {
        return sala;
    }

    /**
     * Sirve para que al ser llamado toString diga que la reunion es precencial y dar la sala
     * @return sala de la reunion
     */
    @Override
    public String toString() {
        return "Reunion presencial en sala " + sala;
    }
}
