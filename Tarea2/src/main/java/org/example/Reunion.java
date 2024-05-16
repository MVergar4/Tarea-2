package org.example;
import java.io.*;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

/**
 * Estructura de un organizador de reuniones generales
 */
public abstract class Reunion {
    /** Fecha de la reunión */
    private Date fecha;
    /** Hora a la que está planeada la reunión */
    private Instant horaPrevista;
    /** Duración que debería tener la reunión */
    private Duration duracionPrevista;
    /** Hora a la que inicia la reunión */
    private Instant horaInicio;
    /** Hora a la que termina la reunión */
    private Instant horaFin;
    /** Notas que se toman durante la reunión */
    private Nota notas = new Nota();
    /** Lista de los invitados a la reunión */
    private ArrayList<Invitacion> listaInvitados;
    /** Lista de los ausentes a la reunión */
    private ArrayList<Empleado> ausencia = new ArrayList<>();
    /** Lista de los presentes a la reunión */
    private ArrayList<Asistencia> asistencia = new ArrayList<>();
    /** Lista de los atrasados a la reunión*/
    private ArrayList<Retraso> atrasados = new ArrayList<>();
    /** Tipo de reunión que se desarrollará */
    private tipoReunion tipoReunion;

    /**
     * Constructor que asigna los datos más importantes de la reunión
     * @param d fecha de la reunión
     * @param t hora esperada para la reunión
     * @param e duración esperada para la reunión
     * @param E tipo de reunión
     * @param al lista de invitados
     */
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

    /**
     * Añade un empleado presente a la lista
     * @param e empleado presente
     */
    public void addAsistente(Empleado e) {
        ausencia.remove(e);
        Asistencia a = new Asistencia(e);
        asistencia.add(a);
    }

    /**
     * Añade un empleado atrasado a la lista
     * @param e empleado atrasado
     * @param hora hora a la que llegó
     */
    public void addAtrasado(Empleado e, Instant hora) {
        ausencia.remove(e);
        Retraso r = new Retraso(e, hora);
        atrasados.add(r);
    }

    /**
     * Entrega la lista de los presentes
     * @return lista de asistencia
     */
    public ArrayList<Asistencia> obtenerAsistencias() {
        return asistencia;
    }

    /**
     * Entrega la lista de los ausentes
     * @return lista de ausencia
     */
    public ArrayList<Empleado> obtenerAusencias() {
        return ausencia;
    }

    /**
     * Entrega la lista de retraso
     * @return lista de atrasados
     */
    public ArrayList<Retraso> obtenerRetrasos() {
        return atrasados;
    }

    /**
     * Entrega el total de asistencia
     * @return cantidad de elementos en la lista de asistencia
     */
    public int obtenerTotalAsistencia() {
        return asistencia.size();
    }

    /**
     * Calcula el porcentaje de asistencia de la reunión en decimales (1.0 = 100%)
     * @return porcentaje de asistencia
     */
    public float obtenerPorcentajeAsistencia() {
        return (float) asistencia.size() / listaInvitados.size();
    }

    /**
     * Calcula el tiempo que ha transcurrido entre el comienzo y el final de la reunión
     * @return tiempo transcurrido
     */
    public float calcularTiempoReal() {
        return Duration.between(horaInicio,horaFin).toMinutes();
    }

    /**
     * Inicia la reunión
     * @param horaInicio hora a la que inicia la reunión
     */
    public void iniciar(Instant horaInicio) {
        this.horaInicio=horaInicio;
    }

    /**
     * Finaliza la reunión
     * @param horaFin hora a la que termina la reunión
     */
    public void finalizar(Instant horaFin) {
        this.horaFin=horaFin;
    }

    /**
     * Escribe una nota durante la reunión
     * @param s contenido de la nota
     */
    public void setNota(String s) {
        notas.añadirNota(s);
    }

    /**
     * Crea un informe de la reunión
     * @param lugar lugar donde se desarrolla la reunión
     */
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
            for(int i =0; i<asistencia.size();i++){
                escritor.println(asistencia.get(i).getEmpleado());
            }
            for(int i =0; i<atrasados.size();i++){
                escritor.println(atrasados.get(i).getEmpleado());
            }

        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
        if(escritor!=null){
            escritor.close();
        }
    }
}