package org.example;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.ArrayList;

public class ReunionPresencial extends Reunion {
    private String sala;
    public ReunionPresencial(String room, Date d, Instant t, Duration e, tipoReunion y, ArrayList<Invitacion> al) {
        super(d, t, e, y, al);
        sala = room;
    }
    public String getSala() {
        return sala;
    }
    public String toString() {
        return "Reunion presencial en sala " + sala;
    }
}
