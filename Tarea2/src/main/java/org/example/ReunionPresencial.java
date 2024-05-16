package org.example;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.ArrayList;

/**
 * Organiza una reunión presencial
 */
public class ReunionPresencial extends Reunion {
    /** Sala de la reunión */
    private String sala;

    /**
     * Constructor que asigna los datos más importantes de la reunión
     * @param room sala de la reunión
     * @param d fecha de la reunión
     * @param t hora esperada para la reunión
     * @param e duración esperada para la reunión
     * @param y tipo de reunión
     * @param al lista de invitados
     */
    public ReunionPresencial(String room, Date d, Instant t, Duration e, tipoReunion y, ArrayList<Invitacion> al) {
        super(d, t, e, y, al);
        sala = room;
    }

    /**
     * Entrega la sala donde se realizará la reunión
     * @return sala de la reunión
     */
    public String getSala() {
        return sala;
    }

    /**
     * Descripción de la clase
     * @return descripción
     */
    public String toString() {
        return "Reunion presencial en sala " + sala;
    }
}
