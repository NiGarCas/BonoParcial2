/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author Estudiante
 */
public class ProgramaFormacion extends Programa{
    private String nombre;
    private String descripcion;

    public ProgramaFormacion(String nombre, String descripcion, boolean altaCalidad) {
        super(altaCalidad);
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
}
