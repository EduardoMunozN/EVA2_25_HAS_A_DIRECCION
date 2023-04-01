/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_25_has.a.direccion;

/**
 *
 * @author eduar
 */
public class EVA2_25_HASADIRECCION {

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Eduardo");
        persona.setApellido("Muñoz");
        persona.setEdad(18);
        
        //Para asginar la dirección, debemos crear un objeto de tipo dirección.
        //*direccion direc = new direccion();
        //direc.setCalle("Industrias");
        //direc.setNúmero(11101);
        //direc.setCp("31135");
        //direc.setColonia("Complejo Industrial Chihuahua");
        //direc.setCiudad("Chihuahua");
        //direc.setEstado("Chihuahua");
        //persona.setDirec(direc);
        persona.imprimirDatos();
        
        
    }
}
class direccion{
    private String calle;
    private int número;
    private String colonia;
    private String cp;
    private String ciudad;
    private String estado;

    public direccion() {
        this.calle = "---";
        this.número = 0;
        this.colonia = "---";
        this.cp = "--";
        this.ciudad = "---";
        this.estado = "---";
    }

    public direccion(String calle, int número, String colonia, String cp, String ciudad, String estado) {
        this.calle = calle;
        this.número = número;
        this.colonia = colonia;
        this.cp = cp;
        this.ciudad = ciudad;
        this.estado = estado;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNúmero() {
        return número;
    }

    public void setNúmero(int número) {
        this.número = número;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void imprimirDatos(){
            System.out.println("DIRECCION: ");
            System.out.println("Calle: "+calle);
            System.out.println("Número: "+número);
            System.out.println("Colonia: "+colonia);
            System.out.println("CP: "+cp);
            System.out.println("Ciudad: "+ciudad);
            System.out.println("Estado: "+estado);
}
   
}
class Persona{
    private String nombre; 
    private String apellido;
    private int edad;
    private direccion direc;//Persona has a 

    public Persona() {
         this.nombre = "----";
        this.apellido = "----";
        this.edad = 0;
        this.direc = null;//NO SE HA CREADO UN OBJETO DE TIPO DIRECCIÓN
    }

    public Persona(String nombre, String apellido, int edad, direccion direc) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direc = direc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public direccion getDirec() {
        return direc;
    }

    public void setDirec(direccion direc) {
        this.direc = direc;
    }
    public void imprimirDatos(){
        System.out.println("NOMBRE: "+nombre);
        System.out.println("APELLIDO: "+apellido);
        System.out.println("EDAD: "+edad);
        if(direc == null)
            System.out.println("Sin dirección");
        else
        direc.imprimirDatos();
    }
    
    
}
class Sucursal{
    private String nombreSucursal;
    private direccion direc;
}