package org.example;
import java.io.*;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

/**
 * Clase que sirve para organizar las reuniones y obtener todo lo relevante respecto a una
 */
public abstract class Reunion {
    /** Fecha de la reunion */
    private Date fecha;
    /** Hora de la reunion */
    private Instant horaPrevista;
    /** Duracion de la reunion */
    private Duration duracionPrevista;
    /** Hora de inicio real *//
    private Instant horaInicio;
    /** Hora de termino de la reunion */
    private Instant horaFin;
    /** Instancia que guardas todas las notas sobre la reunion */
    private Nota notas = new Nota();
    /** Lista de invitados */
    private ArrayList<Invitacion> listaInvitados;
    /** Lista de ausentes */
    private ArrayList<Empleado> ausencia = new ArrayList<>();
    /** Lista de asistencia */
    private ArrayList<Asistencia> asistencia = new ArrayList<>();
    /** Lista de atrasos */
    private ArrayList<Retraso> atrasados = new ArrayList<>();
    /** Tipo de reunion */
    private tipoReunion tipoReunion;

    /**
     * Constructor que guarda los parametros y clona la lista de invitados para crear la lista de ausentes
     * @param d Fecha de la reunion
     * @param t Hora de la reunion
     * @param e Duracion de la reunion
     * @param E Tipo de la reunion
     * @param al Lista de invitados
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
     * Metodo que añade asistentes (es como decir presente)
     * @param e empleado que llego a la reunion
     */
    public void addAsistente(Empleado e) {
        ausencia.remove(e);
        Asistencia a = new Asistencia(e);
        asistencia.add(a);
    }

    /**
     * metodo que añade asistencia y coloca en la lista de atrasados
     * @param e Empleado que llega a la reunion
     * @param hora Hora en la que llega
     */
    public void addAtrasado(Empleado e, Instant hora) {
        ausencia.remove(e);
        Retraso r = new Retraso(e, hora);
        atrasados.add(r);
    }

    /**
     * getter de los presentes
     * @return lista de los presentes
     */
    public ArrayList<Asistencia> obtenerAsistencias() {
        return asistencia;
    }

    /**
     * getter de los ausentes
     * @return lista de los ausentes
     */
    public ArrayList<Empleado> obtenerAusencias() {
        return ausencia;
    }

    /**
     * getter de los atrasos
     * @return lista de los atrasados
     */
    public ArrayList<Retraso> obtenerRetrasos() {
        return atrasados;
    }

    /**
     * Obtiene el numero total de asistencia
     * @return Numero de presentes en la reunion
     */
    public int obtenerTotalAsistencia() {
        return asistencia.size();
    }

    /**
     * Metodo que obtiene el porcentaje de asistencia
     * @return porcentaje de asistencia
     */
    public float obtenerPorcentajeAsistencia() {
        return (float) asistencia.size() / listaInvitados.size();
    }

    /**
     * Calcula el tiempo real que duro la reunion
     * @return Duracion de la reunion
     */
    public float calcularTiempoReal() {
        return Duration.between(horaInicio,horaFin).toMinutes();
    }

    /**
     * Inicia la reunion y guarda la hora de inicio
     * @param horaInicio hora de inicio
     */
    public void iniciar(Instant horaInicio) {
        this.horaInicio=horaInicio;
    }

    /**
     * Finaliza la reunion y guarda la hora final
     * @param horaFin
     */
    public void finalizar(Instant horaFin) {
        this.horaFin=horaFin;
    }

    /**
     * Metodo que añade notas/comentarios de la reunion
     * @param s Nota que se quiere añadir
     */
    public void setNota(String s) {
        notas.añadirNota(s);
    }

    /**
     * metodo que crea el informe
     * @param lugar Lugar fisico o virtual de la reunion
     */
    public void CrearInforme(String lugar) {
        /** Crea un archivo, y un escritor,y luego verifica si se creo correctamente*/
        File miArchivo= new File("INFORME.txt");
        PrintWriter escritor = null;
        if(!miArchivo.exists()) {
            try {
                miArchivo.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        /**
         * Escribe todo lo que necesitamos saber de la reunion como la fecha lugar asistencia etc.
         */
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

        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
        if(escritor!=null){
            escritor.close();
        }
    }
}