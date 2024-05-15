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
    private ArrayList<Empleado> ausencia;
    private ArrayList<Asistencia> asistencia = new ArrayList<>();
    private ArrayList<Retraso> atrasados = new ArrayList<>();
    private tipoReunion tipoReunion;
    public Reunion(Date d, Instant t, Duration e, tipoReunion E, ArrayList<Invitacion> al) {
        this.fecha = d;
        this.horaPrevista = t;
        this.duracionPrevista = e;
        this.tipoReunion=E;
        this.listaInvitados = al;
        ArrayList<Invitacion> al2 = (ArrayList<Invitacion>) al.clone();
        for (int i = 0; i < al2.size(); i++) {
            ausencia.add(al2.get(i).getEmpleado());
        }
    }
    public void addAsistente(Empleado e) {
        ausencia.remove(e);
        Asistencia a = new Asistencia(e);
        asistencia.add(a);
    }
    public void addAtrasado(Empleado e, Instant hora) {
        ausencia.remove(e);
        Retraso r = new Retraso(e, hora);
        atrasados.add(r);
    }
    public ArrayList<Asistencia> obtenerAsistencias() {
        return asistencia;
    }
    public ArrayList<Empleado> obtenerAusencias() {
        return ausencia;
    }
    public ArrayList<Retraso> obtenerRetrasos() {
        return atrasados;
    }
    public int obtenerTotalAsistencia() {
        return asistencia.size();
    }
    public float obtenerPorcentajeAsistencia() {
        return (float) asistencia.size() / listaInvitados.size();
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