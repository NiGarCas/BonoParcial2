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
public class SedeProfesional extends Sede{
    private ArrayList<Programa> altaCalidad;
    private int numAltaCalidad;

    public SedeProfesional(String nombre, String direccion, int telefono, double areaConstruida) {
        super(nombre, direccion, telefono, areaConstruida);
        this.altaCalidad = new ArrayList();
        this.numAltaCalidad = 0;
    }

    @Override
    public String darInformacion() {
        String a = ("Nombre: " + this.nombre + ", Direccion: " + this.direccion + ", Telefono: " + this.telefono + ", AreaConstruida: " + this.areaConstruida);
        return a;
    
    }
    
    public ArrayList<Programa> getProgramasTecnicos(){
        ArrayList<Programa> p = new ArrayList();
        for(int i = 0; i < this.programas.size();i++){
            if(this.programas.get(i) instanceof ProgramaTecnico){
                p.add(this.programas.get(i));
            }
        }
        return p;
    }
    
    public ArrayList<Programa> getProgramasEcontinuada(){
        ArrayList<Programa> p = new ArrayList();
        for(int i = 0; i < this.programas.size();i++){
            if(this.programas.get(i) instanceof ProgramaEcontinuada){
                p.add(this.programas.get(i));
            }
        }
        return p;
    }
}
