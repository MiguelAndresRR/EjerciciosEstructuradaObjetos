package com.biblioteca.mantener;

public class Autor extends General{
    private String observacion;
    private int librospublicados;
    private Pais pais;

    public Autor(){

    }
    public Autor(int  codigo,String nombre,String observacion, int librospublicados, Pais pais){
        super(codigo,nombre);
        this.observacion = observacion;
        this.librospublicados = librospublicados;
        this.pais = pais;
        
    }
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }   
    public String getObservacion(){
        return this.observacion;
    }
    public void setLibrospublicados(int librospublicados) {
        this.librospublicados = librospublicados;
    }
    public int getLibrospublicados(){
        return this.librospublicados;
    }
    public void setPais(Pais pais) {
        this.pais = pais;
    }
    public Pais getPais(){
        return this.pais;
    }
    public String toString(){
        return "Autor {"+ super.toString()+" ";
    }
}
