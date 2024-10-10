
import clases.*;

public class AppNotasObjetos {
    public static void main(String[] args) throws Exception {
           Estudiante est = new Estudiante(null,Float.parseFloat("2.5"),Float.parseFloat("5.0"));
           Estudiante est1 = new Estudiante(null,Float.parseFloat("2.5"),Float.parseFloat("5.0"));
           est.notaFinal();
           est1.notaFinal();
           System.out.println("El estudiante "+ est.obtenerNombre()+" obtuvo una nota final de "est.obtenerNotaFinal()+ " por Consiguiente "+ est.obtenerMensaje());
    }
}
