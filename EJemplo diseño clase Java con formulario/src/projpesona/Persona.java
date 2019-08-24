/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projpesona;

/**
 *
 * @author diego
 */
public class Persona {
    //atributos
    private String Nombre;
    private String Apellidos;
    private char Sexo;
    private String TipoSangre;
    private String FechaNacimiento;
    //constructor

    public Persona(){
    this.Nombre = "";
    this.Apellidos = "";
    this.Sexo = ' ';
    this.TipoSangre = "";
    
    
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String ape) {
        this.Apellidos = ape;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char s) {
        this.Sexo = s;
    }

    public String getTipoSangre() {
        return TipoSangre;
    }

    public void setTipoSangre(String ts) {
        this.TipoSangre = ts;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String fecha) {
        this.FechaNacimiento = fecha;
    }
    
    
    
    
    
    
    
    
}
