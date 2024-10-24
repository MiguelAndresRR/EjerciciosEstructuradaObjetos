import java.util.Scanner;

import com.biblioteca.mantener.Autor;
import com.biblioteca.mantener.Libro;
public class AppBiblioteca {
    Libro libro;
    public static void main(String[] args) throws Exception {
        AppBiblioteca appbiblioteca = new AppBiblioteca();
        appbiblioteca.cargarLibro();
        appbiblioteca.imprimir();
        
    }
    public void cargarLibro(){
        libro = new Libro();
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el codigo del libro: ");
        libro.setCodigo(sc.nextInt());
        System.out.println("ingrese el nombre del libro: ");
        libro.setNombre(sc.nextLine());
        sc.nextLine();
        System.out.println("ingrese la edicion o el numero de la edicion; ");
        libro.setEdicion(sc.nextInt());
        System.out.println("ingrese el año de publicacion");
        libro.setAñopublicacion(sc.nextInt());

        Autor  autor = new Autor();
        System.out.println("Ingrese el codigo del autor");
        autor.setCodigo(sc.nextInt());
        System.out.println("Ingrese el nombre del autor");
        autor.setNombre(sc.nextLine());
        sc.nextLine();

        libro.setAutor(autor);
    }
    public void imprimir(){
        System.out.println(libro);

    }
}
