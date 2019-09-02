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
public class Persona {
    private String nombre;
    private int edad;
    private boolean trabaja;

//COntructor vacío ç
    public Persona(){
        nombre = "desconocido";
        edad=0;
        trabaja=false;
        
        
    }
//constructor parametrizado
    
    public Persona(String nombre,int edad, boolean trabaja){
        this.nombre=nombre;
        this.edad=edad;
        this.trabaja=trabaja;
        
    }
    
    //Metodos set y get

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isTrabaja() {
        return trabaja;
    }

    public void setTrabaja(boolean trabaja) {
        this.trabaja = trabaja;
    }

    @Override
    public String toString() {
        String estado="<<Estado del objeto>>\n";
        estado+="Nombre="+nombre+"\n";
        estado+="Edad"+edad+"\n";
        estado+="Trabaja="+trabaja+"\n";
        return estado;
    }
    
    
    
     
    
    
}
