package clasesobjetos;

import java.util.ArrayList;

public class empresa {
    private ArrayList<empleado> empleados;

    public empresa(){
        empleados = new ArrayList<empleado>();
    }
    public void contratarEmpleado(empleado e){//metodo
        empleados.add(e);
    }
    public int getTotalEmpleados(){//get
        return empleados.size();
    }
    public void nombreSalario(){//Metodo
        for(empleado e:empleados){
            System.out.println("Nombre: "+ e.getNombre()+"Salario: "+e.getSalario());
        }
    }
    public double getTotalSalarios(){
        double total = 0;
        for(empleado e:empleados){
            total = total +e.getSalario();
       } 
       return total; //get
    }
    public void empleadoMayorSalario(){
        empleado empMayorSalario = empleados.get(0);
        double maxSalario = empleados.get(0).getSalario();
        for (empleado e:empleados){
            if (e.getSalario()>maxSalario){
                maxSalario = e.getSalario();
                empMayorSalario = e;
            }

        }
        System.out.println("El empleado que mas dinero gana es: ");
        System.out.println("Nombre: "+ empMayorSalario.getNombre());
        System.out.println("Cargo: "+ empMayorSalario.getCargo());
        System.out.println("Salario: "+ empMayorSalario.getSalario());
    }
    public void empleadoMenorSalario(){
        empleado empMenorSalario = empleados.get(0);
        double menSalario = empleados.get(0).getSalario();
        for(empleado e: empleados){
            if(e.getSalario() < menSalario){
                menSalario = e.getSalario();
                empMenorSalario = e;
            }
            System.out.println("El empleado que menos dinero gana es: ");
            System.out.println("Nombre: "+ empMenorSalario.getNombre());
            System.out.println("Cargo: "+ empMenorSalario.getCargo());
            System.out.println("Salario: "+ empMenorSalario.getSalario());

        }

    }
}
