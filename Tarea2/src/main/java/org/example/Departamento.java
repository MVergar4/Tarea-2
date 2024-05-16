package org.example;

import java.time.Instant;
import java.util.ArrayList;

/**
 * Departamento de empleados
 */
public class Departamento {
    /** Nombre del departamento */
    private String nombre;
    /** Lista de empleados que pertenecen al departamento */
    private ArrayList<Empleado> al;

    /**
     * Constructor por defecto
     * @param nombre nombre del departamento
     */
    public Departamento(String nombre){
        this.nombre=nombre;
        this.al= new ArrayList<>();
    }

    /**
     * Añade empleados a la lista del departamento
     * @param E empleado que pertenece al departamento
     */
    public void setEmpleados(Empleado E) {
        al.add(E);
    }

    /**
     * Entrega la cantidad de empleados que contiene el departamento
     * @return cantidad de elementos de la lista
     */
    public int obtenerCantidadEmpleados(){
        return al.size();
    }

    /**
     * Invitación al departamento entero, invita a cada empleado perteneciente a este por separado en una misma hora
     * @param hora hora de la invitación
     * @return lista con las invitaciones
     */
    public ArrayList<Invitacion> invitarDepartamentoEntero(Instant hora) {
        ArrayList<Invitacion> alinv = new ArrayList<>();
        for(int i=0; i< al.size();i++){
            alinv.add(al.get(i).invitar(hora));
        }
        return alinv;
    }

    /**
     * Descripción de la clase
     * @return descripción
     */
    public String toString() {
        return "Departamento " + nombre + " de empleados";
    }
}
