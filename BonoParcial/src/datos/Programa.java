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
public class Programa {
    protected ArrayList<Estudiante> estudiantes;
    protected boolean altaCalidad;

    public Programa(boolean altaCalidad) {
        this.estudiantes = new ArrayList();
        this.altaCalidad = altaCalidad;
    }
    
    public void agregarEstudiante(Estudiante estudiante) {
        this.estudiantes.add(estudiante);
    }
}
