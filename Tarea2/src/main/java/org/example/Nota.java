package org.example;

public class Nota {
    private String contenido;
    public Nota() {
        contenido = "";
    }
    public void añadirNota(String s) {
        if (contenido.isBlank()) {
            contenido = contenido + s + ".";
        } else {
            contenido = contenido + " " + s + ".";
        }
    }
    public String leerNota() {
        return contenido;
    }
}
