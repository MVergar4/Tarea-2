package org.example;

import java.time.Instant;

public class Empleado implements Invitable{
    private String id;
    private String apellido;
    private String nombre;
    private String correo;
    public Empleado(String id, String apellido, String nombre, String correo){
        this.id=id;
        this.apellido=apellido;
        this.nombre=nombre;
        this.correo=correo;
    }
    public String getId() {
        return id;
    }
    public String getApellido() {
        return apellido;
    }
    public String getNombre() {
        return nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public String toString() {
        return "Empleado: " + nombre + " " + apellido + ". Id: " + id + ". Correo: " + correo;
    }
    @Override
    public Invitacion invitar(Instant hora) {
        return new Invitacion(this, hora);
    }
}
