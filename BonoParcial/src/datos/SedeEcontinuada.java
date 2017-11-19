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
public class SedeEcontinuada extends Sede{
    private String cursoMasPopular;

    public SedeEcontinuada(String nombre, String direccion, int telefono, double areaConstruida) {
        super(nombre, direccion, telefono, areaConstruida);
        this.cursoMasPopular = cursoMasPopular;
    }

    @Override
    public String darInformacion() {
        String a = ("Nombre: " + this.nombre + ", Direccion: " + this.direccion + ", Telefono: " + this.telefono + ", AreaConstruida: " + this.areaConstruida);
        return a;
    }

    
}
