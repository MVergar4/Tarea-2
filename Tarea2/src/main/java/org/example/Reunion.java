package org.example;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

public abstract class Reunion {
    private Date fecha;
    private Instant horaPrevista;
    private Duration duracionPrevista;
    private Instant horaInicio;
    private Instant horaFin;
    private Nota notas = new Nota();
    public Reunion(Date d, Instant t, Duration e) {
        fecha = d;
        horaPrevista = t;
        duracionPrevista = e;
    }
    public ArrayList obtenerAsistencias() {
        return null;
    }
    public ArrayList obtenerAusencias() {
        return null;
    }
    public ArrayList obtenerRetrasos() {
        return null;
    }
    public int obtenerTotalAsistencia() {
        return 0;
    }
    public float obtenerPorcentajeAsistencia() {
        return 0;
    }
    public float calcularTiempoReal() {
        return 0;
    }
    public void iniciar() {

    }
    public void finalizar() {

    }
}