package org.example;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.ArrayList;

public class ReunionVirtual extends Reunion {
    private String enlace;
    public ReunionVirtual(String link, Date d, Instant t, Duration e, tipoReunion y, ArrayList<Invitacion> al) {
        super(d, t, e, y, al);
        enlace = link;
    }
    public String getEnlace() {
        return enlace;
    }
    public String toString() {
        return "Reunion virtual con enlace " + enlace;
    }
}
