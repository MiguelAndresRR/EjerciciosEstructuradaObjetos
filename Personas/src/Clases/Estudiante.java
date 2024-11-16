package Clases;

public class Estudiante {
    private String carrera;
    private int legajo;
    public Estudiante(){
    }
    public Estudiante(String carrera, int legajo){
        this.carrera = carrera;
        this.legajo = legajo;
    }
    public void setCarrera(String carrera){
        this.carrera = carrera;
    }
    public String getCarrera(){
        return this.carrera;
    }
    public void setLegajo(int legajo){
        this.legajo = legajo;
    }
    public int getLegajo(){
        return this.legajo;
    }
    public String toString(){
        return "Estudiante [carrera=" + carrera + ", legajo=" + legajo;
    }
}
