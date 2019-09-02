/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author diego
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //Crear objeto vacìo
      Persona objeto1 = new Persona("Juan",28,true);
      Persona objeto2= new Persona("Pablo",20,true);
      //EStado de los onjetos
      System.out.println(objeto1);
      System.out.println(objeto2);
      
      //Persona de mayor edad
      System.out.println("Nombre del mayor edad");
      if(objeto1.getEdad()>objeto2.getEdad())
          System.out.println(objeto1.getNombre());
      else if(objeto1.getEdad()<objeto2.getEdad())
          System.out.println(objeto2.getNombre());
      else
          System.out.println("Ambos tienen la misma edad");
    
    
    }
    
    
    
}
