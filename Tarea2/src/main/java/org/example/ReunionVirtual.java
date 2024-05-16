package org.example;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.ArrayList;

/**
 * Organiza una reunión virtual
 */
public class ReunionVirtual extends Reunion {
    /** Enlace de la reunión */
    private String enlace;

    /**
     * Constructor que asigna los datos más importantes de la reunión
     * @param link enlace de la reunión
     * @param d fecha de la reunión
     * @param t hora esperada para la reunión
     * @param e duración esperada para la reunión
     * @param y tipo de reunión
     * @param al lista de invitados
     */
    public ReunionVirtual(String link, Date d, Instant t, Duration e, tipoReunion y, ArrayList<Invitacion> al) {
        super(d, t, e, y, al);
        enlace = link;
    }

    /**
     * Entrega el enlace de la reunión
     * @return enlace de la reunión
     */
    public String getEnlace() {
        return enlace;
    }

    /**
     * Descripción de la clase
     * @return descripción
     */
    public String toString() {
        return "Reunion virtual con enlace " + enlace;
    }
}
