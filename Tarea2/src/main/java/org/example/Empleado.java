package org.example;

import java.time.Instant;

/**
 * Empleado con sus características
 */
public class Empleado implements Invitable{
    /** Id del empleado */
    private String id;
    /** Apellido del empleado */
    private String apellido;
    /** Nombre del empleado */
    private String nombre;
    /** Correo del empleado */
    private String correo;

    /**
     * Constructor por defecto, asigna las características del empleado
     * @param id id del empleado
     * @param apellido apellido del empleado
     * @param nombre nombre del empleado
     * @param correo correo del empleado
     */
    public Empleado(String id, String apellido, String nombre, String correo){
        this.id=id;
        this.apellido=apellido;
        this.nombre=nombre;
        this.correo=correo;
    }

    /**
     * Entrega la Id del empleado
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * Entrega el Apellido del empleado
     * @return apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Entrega el Nombre del empleado
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Entrega el Correo del empleado
     * @return correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Descripción de la clase
     * @return descripción
     */
    public String toString() {
        return "Empleado: " + nombre + " " + apellido + ". Id: " + id + ". Correo: " + correo;
    }

    /**
     * Crea invitación a este empleado
     * @param hora hora de la invitación
     * @return registro de la invitación
     */
    @Override
    public Invitacion invitar(Instant hora) {
        return new Invitacion(this, hora);
    }
}
