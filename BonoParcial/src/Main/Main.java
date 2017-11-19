/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;
import logica.LogicaUniversidad;

/**
 *
 * @author Estudiante
 */
public class Main {
    public static void main(String[] args) {
        LogicaUniversidad logica = new LogicaUniversidad();
        logica.cargar("info");
        ArrayList<String> s = logica.getU().darInformacionSedes();
        for (int i = 0; i < s.size(); i++){
            System.out.println(s.get(i));
        }
    }
}
