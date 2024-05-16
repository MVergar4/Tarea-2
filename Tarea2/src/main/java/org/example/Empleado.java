package org.example;

import java.time.Instant;

/**
 * Clase que sirve para crear a un trabajador
 */
public class Empleado implements Invitable{
    /** String que guarda el id del trabajador */
    private String id;
    /** Apellido del trabajodor */
    private String apellido;
    /** Nombre del trabajador */
    private String nombre;
    /** Correo electronico del trabajador */
    private String correo;

    /**
     * Constructor que guarda los datos esenciales de un trabajador
     * @param id Identificador del trabajador
     * @param apellido Apellido del trabajador
     * @param nombre Nombre del trabajador
     * @param correo Correo asignado al trabajador
     */
    public Empleado(String id, String apellido, String nombre, String correo){
        this.id=id;
        this.apellido=apellido;
        this.nombre=nombre;
        this.correo=correo;
    }

    /**
     * getter de la id del trabajador
     * @return id del empleado
     */
    public String getId() {
        return id;
    }

    /**
     * getter del apellido del trabajador
     * @return apellido del empleado
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * getter del nombre del trabajador
     * @return nombre del empleado
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * getter del correo del trabajador
     * @return Correo del empleado
     */
    public String getCorreo() {
        return correo;
    }
    /**
     * Metodo que modifica el toString por defecto de empleado para que de los datos esenciales
     * de este mismo
     */
    public String toString() {
        return "Empleado: " + nombre + " " + apellido + ". Id: " + id + ". Correo: " + correo;
    }

    /**
     * Metodo que sirve para notiicar al trabajador de la reunion
     * @param hora hora de la invitacion
     * @return Regresa una invitacion
     */
    @Override
    public Invitacion invitar(Instant hora) {
        return new Invitacion(this, hora);
    }
}
