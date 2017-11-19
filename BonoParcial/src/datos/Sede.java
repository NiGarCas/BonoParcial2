/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public abstract class Sede {
    protected String nombre;
    protected String direccion;
    protected int telefono;
    protected double areaConstruida;
    protected ArrayList<Programa> programas;

    public Sede(String nombre, String direccion, int telefono, double areaConstruida) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.areaConstruida = areaConstruida;
        this.programas = new ArrayList();
    }

    public ArrayList<Programa> getProgramas() {
        return programas;
    }
    
    public abstract String darInformacion();
    
    public void agregarPrograma(Programa p) {
        this.programas.add(p);
    }
}
