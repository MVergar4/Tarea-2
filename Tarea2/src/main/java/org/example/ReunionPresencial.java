package org.example;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;

public class ReunionPresencial extends Reunion {
    private String sala;
    public ReunionPresencial(String room, Date d, Instant t, Duration e, tipoReunion y) {
        super(d, t, e, y);
        sala = room;
    }
    public String getSala() {
        return sala;
    }
}
