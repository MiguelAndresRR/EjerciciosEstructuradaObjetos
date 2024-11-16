
import clases.*;

public class AppNotasObjetos {
    public static void main(String[] args) throws Exception {
        Estudiante est = new Estudiante("Carlos Rodriguez",Float.parseFloat("2.5"),Float.parseFloat("5.0"));
        Estudiante est1 = new Estudiante("Santiago ibañez",Float.parseFloat("2.5"),Float.parseFloat("5.0"));
        est.calcularNotaFinal();
        est1.calcularNotaFinal();
    }
}
