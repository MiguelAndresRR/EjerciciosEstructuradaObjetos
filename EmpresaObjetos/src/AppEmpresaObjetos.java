import javax.swing.JOptionPane;
import clasesobjetos.*;

public class AppEmpresaObjetos {
    public static void main(String[] args) throws Exception {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Diguite la cantidad de empleados: "));
        empresa empresa = new empresa(); 
        for(int emp = 0; emp < cantidad; emp++){
            String nombre = JOptionPane.showInputDialog(null, "Ingresar nombre del empleado: ");
            String cargo = JOptionPane.showInputDialog(null, "Ingrese cargo del empleado: ");
            double Salario = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese salario del empleado: "));

            empresa.contratarEmpleado(new empleado(nombre, cargo, Salario));//salario o Salario???
        }
        System.out.println("nEl nuemro total de empelados es "+ empresa.getTotalEmpleados());
        System.out.println("nLos nombres y los salarios de los empleados son: "+ empresa.nombreSalario());
        empresa.nombreSalario();
        System.out.println("nTotal de dinero pagado a todos los empleados: "+empresa.getTotalSalarios());
    }
}
