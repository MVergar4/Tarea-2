package org.example;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;

public class ReunionVirtual extends Reunion {
    private String enlace;
    public ReunionVirtual(String link, Date d, Instant t, Duration e, tipoReunion y) {
        super(d, t, e, y);
        enlace = link;
    }
    public String getEnlace() {
        return enlace;
    }
}
