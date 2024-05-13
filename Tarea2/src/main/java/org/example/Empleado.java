package org.example;

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

    @Override
    public void invitar() {

    }
}
