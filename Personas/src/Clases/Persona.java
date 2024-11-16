package Clases;

public class Persona {
    private String nombre;
    private int edad;
    public Persona(){
    }
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }
    public String toString(){
        return "Persona {nombre=" + nombre + ", edad=" + edad + "}";
    }
    
}