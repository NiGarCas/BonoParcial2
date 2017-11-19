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
public class SedeTecnologica extends Sede{
    private int numEstudiantes;

    public SedeTecnologica(String nombre, String direccion, int telefono, double areaConstruida) {
        super(nombre, direccion, telefono, areaConstruida);
        this.numEstudiantes = 0;
    }
    
    

    @Override
    public String darInformacion() {
        String a = ("Nombre: " + this.nombre + ", Direccion: " + this.direccion + ", Telefono: " + this.telefono + ", AreaConstruida: " + this.areaConstruida);
        return a;
    
    }

    
}
