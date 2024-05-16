package org.example;

import java.time.Instant;
import java.util.ArrayList;

/**
 * Clase que funciona como departamento de la empresas
 */
public class Departamento {
    /** String que guarda el nombre del departamento */
    private String nombre;
    /** Lista de trabajadores del departamento */
    private ArrayList<Empleado> al;

    /**
     * Constructor que gurada el nombre del departamento
     * @param nombre indica el nombre del departamento
     */
    public Departamento(String nombre){
        this.nombre=nombre;
    }

    /**
     * Metodo que agrega empleados al departamento
     * @param E Referencia a un trabajador
     */
    public void setEmpleados(Empleado E) {
        al.add(E);
    }

    /**
     * Metodo que obtiene la cantidad de trabajadores del departamento
     * @return cantidad de trabajadores
     */
    public int obtenerCantidadEmpleados(){
        return al.size();
    }

    /**
     * Metodo que permite invitar a todos los trabvajadores del departamento
     * @param hora Hora de la reunion
     * @return La lista de invitaciones
     */
    public ArrayList<Invitacion> invitarDepartamentoEntero(Instant hora) {
        ArrayList<Invitacion> alinv = new ArrayList<>();
        for(int i=0; i< al.size();i++){
            alinv.add(al.get(i).invitar(hora));
        }
        return alinv;
    }

    /**
     * Metodo que modifica el toString para que lleve mas detalles de la clase
     * @return Un string con el nombre del departamento
     */
    public String toString() {
        return "Departamento " + nombre + " de empleados";
    }
}
