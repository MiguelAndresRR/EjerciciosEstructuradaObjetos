package clases;

public class Estudiante {

    private String nombre;
    private float nota1;
    private float nota2;
    private float notafinal;

    public Estudiante(String nombre){
        this.nombre = nombre;
    }
    
    public Estudiante (String nombre, float nota1, float nota2) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    public void asignarNombre(String nombre){
        this.nombre = nombre;
    }
    public void obtenerNombre(){
        return;
    }
    public void asignarNotaParcial1(Float nota1){
        this.nota1 = nota1;
    }
    public void asignarNotaParcial2(Float nota2){
        this.nota2 = nota2;
    }

    public void obtenerNotaParcial1(){
        return;
    }

    public void obtenerNotaParcial2(){
        return; 
    }
    
    public void calcularNotaFinal(){
        notafinal = (nota1 + nota2)/2;
    }
    public void obtenerNotaFinal(){
        return;
    }

    public String obtenerMensaje(){
        if (notafinal <= 3)
        return "Reprobo";
        else
        return "Aprobado";
    }
}