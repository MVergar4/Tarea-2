package org.example;
import java.io.*;
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
    private ArrayList<Invitacion> listaInvitados;
    private ArrayList<Asistencia> asistencia = new ArrayList<>();
    private ArrayList<Retraso> atrasados = new ArrayList<>();
    private tipoReunion tipoReunion;
    public Reunion(Date d, Instant t, Duration e, tipoReunion E, ArrayList<Invitacion> al) {
        this.fecha = d;
        this.horaPrevista = t;
        this.duracionPrevista = e;
        this.tipoReunion=E;
        this.listaInvitados = al;
    }
    public ArrayList<Asistencia> obtenerAsistencias() {
        return asistencia;
    }
    public ArrayList obtenerAusencias() {
        return null;
    }
    public ArrayList<Retraso> obtenerRetrasos() {
        return atrasados;
    }
    public int obtenerTotalAsistencia() {
        return 0;
    }
    public float obtenerPorcentajeAsistencia() {
        return 0;
    }
    public float calcularTiempoReal() {
        return Duration.between(horaInicio,horaFin).toMinutes();
    }
    public void iniciar(Instant horaInicio) {
        this.horaInicio=horaInicio;
    }
    public void finalizar(Instant horaFin) {
        this.horaFin=horaFin;
    }
    public void setNota(String s) {
        notas.añadirNota(s);
    }
    public void CrearInforme(String lugar) {
        File miArchivo= new File("INFORME.txt");
        PrintWriter escritor = null;
        if(!miArchivo.exists()) {
            try {
                miArchivo.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        try {
            escritor = new PrintWriter(miArchivo);
            escritor.println(fecha.toString());
            escritor.println("Hora de inicio: " + horaInicio + ", Hora de termino: " + horaFin + ", Duracion: " + calcularTiempoReal() + " minutos");
            escritor.println("Tipo de reunion: " + tipoReunion);
            escritor.println("Lugar: " + lugar);
            escritor.println("Notas: " + notas.leerNota());
            escritor.println(obtenerAsistencias());

        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
        if(escritor!=null){
            escritor.close();
        }
    }
}