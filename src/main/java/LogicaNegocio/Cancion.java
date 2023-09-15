/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaNegocio;

/**
 *
 * @author 1058932609
 */
public class Cancion {
    
    //atributos
    
   public String Titulo;
   public int Minutos;
   public int Segundos;
   public int Año_publicacion;
   
   //constructor no parametrizado
   
   public Cancion ()
   {           
       
   //contructor parametrizado 
       
       
   }

    public Cancion(String Titulo, int Minutos, int Segundos, int Año_publicacion) {
        this.Titulo = Titulo;
        this.Minutos = Minutos;
        this.Segundos = Segundos;
        this.Año_publicacion = Año_publicacion;
    }
    
   //setters

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setMinutos(int Minutos) {
        this.Minutos = Minutos;
    }

    public void setSegundos(int Segundos) {
        this.Segundos = Segundos;
    }

    public void setAño_publicacion(int Año_publicacion) {
        this.Año_publicacion = Año_publicacion;
    }
    
    //getters

    public String getTitulo() {
        return Titulo;
    }

    public int getMinutos() {
        return Minutos;
    }

    public int getSegundos() {
        return Segundos;
    }

    public int getAño_publicacion() {
        return Año_publicacion;
    }
    
    
   }
   
