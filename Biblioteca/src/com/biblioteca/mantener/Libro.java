package com.biblioteca.mantener;

public class Libro extends General{
    private int edicion;
    private int añopublicacion;
    private Autor autor;

    public Libro(){

    }
    public Libro(int edicion,int añopublicacion, Autor autor, int codigo, String nombre){
        super(codigo,nombre);
        this.edicion = edicion;
        this.añopublicacion = añopublicacion;
        this.autor = autor;
    }
    public void setEdicion(int edicion){
        this.edicion = edicion;
    }
    public int getEdicion(){
        return edicion;
    }
    public void setAñopublicacion(int añopublicacion){
        this.añopublicacion = añopublicacion;
    }
    public int getAñopublicacion(){
        return añopublicacion;
    }
    public void setAutor(Autor autor){
        this.autor = autor;
    }
    public Autor getAutor(){
        return autor;
    }
    public String toString() {
        return "Libro {" + super.toString() + "Edicion: " + edicion + " Año de Publicacion: " + añopublicacion + "Autor: "+ autor + '}';
         
    }

}
