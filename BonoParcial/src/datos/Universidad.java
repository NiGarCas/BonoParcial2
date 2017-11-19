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
public class Universidad {
    private ArrayList<Sede> sedes;

    public Universidad() {
        this.sedes = new ArrayList();
    }
    
    public void agregarSedeProfesional(String nombre, String direccion, int telefono, double areaConstruida) {
        SedeProfesional sede = new SedeProfesional(nombre, direccion, telefono, areaConstruida);
        this.sedes.add(sede);
    }
    
    public void agregarSedeTecnologica(String nombre, String direccion, int telefono, double areaConstruida) {
        SedeTecnologica sede = new SedeTecnologica(nombre, direccion, telefono, areaConstruida);
        this.sedes.add(sede);
    }
    
    public void agregarSedeEcontinuada(String nombre, String direccion, int telefono, double areaConstruida) {
        SedeEcontinuada sede = new SedeEcontinuada(nombre, direccion, telefono, areaConstruida);
        this.sedes.add(sede);
    }
    public void eliminarSede(Sede sede){
        for (int i = 0 ; i < this.sedes.size() ; i++){
            if(this.sedes.get(i).equals(sede)){
                this.sedes.remove(i);
                break;
            }
        }
    }

    public ArrayList<Sede> getSedes() {
        return sedes;
    }
    
    public ArrayList<String> darInformacionSedes(){
        ArrayList<String> a = new ArrayList();
        for(Sede sede : this.sedes){
            a.add(sede.darInformacion());
        }
        return a;
    }
}
