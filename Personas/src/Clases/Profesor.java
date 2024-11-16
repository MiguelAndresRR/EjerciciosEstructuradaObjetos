package Clases;

public class Profesor extends Persona{
    String materia;
    String cargo;
    public Profesor(){
    }
    public Profesor(String materia, String cargo, int edad, String nombre){
        super(nombre,edad);
        this.materia = materia;
        this.cargo = cargo;
    }
    public void setMateria(String materia){
        this.materia = materia;
    }
    public String getMateria(){
        return materia;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    public String getCargo(){
        return cargo;
    }
    
    public String toString(){
        return "Profesor: {"+ super.toString()+" Materia: "+materia+" Cargo: "+cargo;
    }
}
