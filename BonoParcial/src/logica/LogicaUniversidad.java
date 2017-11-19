/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import datos.ProgramaEcontinuada;
import datos.ProgramaFormacion;
import datos.ProgramaTecnico;
import datos.Universidad;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class LogicaUniversidad {
    private Universidad u; 

    public LogicaUniversidad() {
      this.u = new Universidad();
    }

    public Universidad getU() {
        return u;
    }
    
    public void cargar(String ruta){
      
       File lectura = new File(ruta);
       Scanner flujoEntrada = null;
       if(lectura.exists()){
           try {
               flujoEntrada = new Scanner(lectura);
               flujoEntrada.useDelimiter(",");
               String prox = prox = flujoEntrada.next().trim();
               while(flujoEntrada.hasNext()){
                   switch (prox) {
                       case "SE":
                           {
                               String nombre = flujoEntrada.next().trim();
                               String direccion = flujoEntrada.next().trim();
                               int telefono = flujoEntrada.nextInt();
                               int area = flujoEntrada.nextInt();
                               this.getU().agregarSedeEcontinuada(nombre,direccion,telefono,area);
                               int nsedes = this.getU().getSedes().size();
                               prox = flujoEntrada.next().trim();
                               while (!((prox.equals("SP")||prox.equals("ST"))||prox.equals("SE"))){
                                   switch(prox){
                                       case "PE":
//                                   boolean altaCalidad = false;
//                                   System.out.println(flujoEntrada.next().trim());
//                                   String z = flujoEntrada.next().trim();
//                                   if(flujoEntrada.next().trim().equals("ac")){
//                                       altaCalidad = true;
//                                   }
                                           ProgramaEcontinuada p= new ProgramaEcontinuada(false);
                                           this.getU().getSedes().get(nsedes - 1).agregarPrograma(p);
                                           break;
                                       default:
                                           break;
                                   }
                                   if(flujoEntrada.hasNext()){
                                       prox = flujoEntrada.next().trim();
                                       if((prox.equals("SP")||prox.equals("ST"))||prox.equals("SE")){
                                           break;
                                       }
                                   }else{break;}
                               }       break;
                           }
                       case "SP":
                           {
                               String nombre = flujoEntrada.next().trim();
                               String direccion = flujoEntrada.next().trim();
                               int telefono = flujoEntrada.nextInt();
                               int area = flujoEntrada.nextInt();
                               this.getU().agregarSedeProfesional(nombre,direccion,telefono,area);
                               int nsedes = this.getU().getSedes().size();
                               prox = flujoEntrada.next().trim();
                               while (!((prox.equals("SP")||prox.equals("ST"))||prox.equals("SE"))){
                                   switch(prox){
                                       case "PE":
//                                   boolean altaCalidad = false;
//                                   String z = flujoEntrada.next().trim();
//                                   if(z.equals("1")){
//                                       altaCalidad = true;
//                                   }
                                           ProgramaEcontinuada p= new ProgramaEcontinuada(false);
                                           this.getU().getSedes().get(nsedes - 1).agregarPrograma(p);
                                           break;
                                       case "PF":
                                           String name = flujoEntrada.next().trim();
                                           String descripcion = flujoEntrada.next().trim();
//                                   boolean altaCalidad2 = false;
//                                   String y = flujoEntrada.next().trim();
//                                   if(y.equals("1")){
//                                       altaCalidad2 = true;
//                                   }
                                           ProgramaFormacion q= new ProgramaFormacion(name,descripcion,false);
                                           this.getU().getSedes().get(nsedes - 1).agregarPrograma(q);
                                           break;
                                       case "PT":
//                                   boolean altaCalidad3 = false;
//                                   String x = flujoEntrada.next().trim();
//                                   if(x.equals("1")){
//                                       altaCalidad3 = true;
//                                   }
                                           ProgramaTecnico r= new ProgramaTecnico(false);
                                           this.getU().getSedes().get(nsedes - 1).agregarPrograma(r);
                                           break;
                                   }
                                   if(flujoEntrada.hasNext()){
                                       prox = flujoEntrada.next().trim();
                                       if((prox.equals("SP")||prox.equals("ST"))||prox.equals("SE")){
                                           break;
                                       }
                                   }else{break;}
                               }       break;
                           }
                       case "ST":
                           {
                               String nombre = flujoEntrada.next().trim();
                               String direccion = flujoEntrada.next().trim();
                               int telefono = flujoEntrada.nextInt();
                               int area = flujoEntrada.nextInt();
                               this.getU().agregarSedeTecnologica(nombre,direccion,telefono,area);
                               int nsedes = this.getU().getSedes().size();
                               prox = flujoEntrada.next().trim();
                               while (!((prox.equals("SP")||prox.equals("ST"))||prox.equals("SE"))){
                                   switch(prox){
                                       case "PF":
                                           String name = flujoEntrada.next().trim();
                                           String descripcion = flujoEntrada.next().trim();
//                                   boolean altaCalidad2 = false;
//                                   String y = flujoEntrada.next().trim();
//                                   if(y.equals("1")){
//                                       altaCalidad2 = true;
//                                   }
                                           ProgramaFormacion q= new ProgramaFormacion(name,descripcion,false);
                                           this.getU().getSedes().get(nsedes - 1).agregarPrograma(q);
                                           break;
                                       case "PT":
//                                   boolean altaCalidad3 = false;
//                                   String x = flujoEntrada.next().trim();
//                                   if(x.equals("1")){
//                                       altaCalidad3 = true;
//                                   }
                                           ProgramaTecnico r= new ProgramaTecnico(false);
                                           this.getU().getSedes().get(nsedes - 1).agregarPrograma(r);
                                           break;
                                   }
                                   if(flujoEntrada.hasNext()){
                                       prox = flujoEntrada.next().trim();
                                       if((prox.equals("SP")||prox.equals("ST"))||prox.equals("SE")){
                                           break;
                                       }
                                   }else{break;}
                               }       break;
                           }
                       default:
                           break;
                   }
               }
               
               
           } catch (FileNotFoundException ex) {
               System.out.println("Archivo de datos no Encontrado");
           }
          
       }
    
    }
}
