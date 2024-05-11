package org.example;

public class ReunionPresencial extends Reunion {
    private String sala;
    public ReunionPresencial(String room) {
        super();
        sala = room;
    }
    public String getSala() {
        return sala;
    }
}
