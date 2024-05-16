package org.example;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.ArrayList;

/**
 * Subclase de Reunion que es cuando una reunion es via telematica
 */
public class ReunionVirtual extends Reunion {
    /** Enlace url de la reunion */
    private String enlace;

    /**
     * Constructor que sirve para hacer el super y guardar el url de la reunion
     * @param link url de la reunion
     * @param d Fecha de la reunion
     * @param t Hora de la reunion
     * @param e Duracion de la reunion
     * @param y Tipo de reunion
     * @param al Lista de invitados
     */
    public ReunionVirtual(String link, Date d, Instant t, Duration e, tipoReunion y, ArrayList<Invitacion> al) {
        super(d, t, e, y, al);
        enlace = link;
    }

    /**
     * getter del url
     * @return Url de la reunion
     */
    public String getEnlace() {
        return enlace;
    }

    /**
     * Metodo que al ser llamado devuelve el enlace de la reunion en cuestion e indica que es virtual
     * @return url de la reunion
     */
    @Override
    public String toString() {
        return "Reunion virtual con enlace " + enlace;
    }
}
