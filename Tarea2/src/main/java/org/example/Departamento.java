package org.example;

public class Departamento {
    private String nombre;
    private int cantidadEmpleados;
    public Departamento(String nombre,int cantidadEmpleados){
        this.nombre=nombre;this.cantidadEmpleados=cantidadEmpleados;
    }
    public int obtenerCantidadEmpleados(){return cantidadEmpleados; }
}
