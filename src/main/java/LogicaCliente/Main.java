/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LogicaCliente;

import LogicaNegocio.Cancion;
import java.util.Scanner;

/**
 *
 * @author 1058932609
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String titulo="";
        int Minutos=0;
        int Segundos=0;
        int Año_publicacion = 0;
        int Año_actual=2023;
        
        
      // creacion de objetos
      
      Cancion objcancion=new Cancion ();
      
      
      
      //fijar informacion 
      
        Scanner scan=new Scanner (System.in);
        
        //adjuntar y pedir datos del usuario
        
        System.out.println("digite el titulo de la cancion");
        titulo=scan.nextLine();
        
        
        System.out.println("digite los minutos que dura la cancion");
        Minutos=scan.nextInt();
        
        
        System.out.println("digite los segundos que dura la cancion");
        Segundos=scan.nextInt();
       
        
      
        System.out.println("digite el año de publicacion");
        Año_publicacion=scan.nextInt();
        
        
        Cancion objcancion1 = new Cancion (titulo, Minutos, Segundos, Año_publicacion);
        
        //operacion
        
        int mensaje = Año_actual - objcancion.getAño_publicacion();
        
      
       
        System.out.println("digite el titulo:"+"\t"+objcancion.getTitulo());
        System.out.println("minutos y segundos:"+"\t"+objcancion.getMinutos()+":"+objcancion.getSegundos());
        System.out.println("año publicacion:"+"\t"+mensaje);
        
         System.out.println("digite el titulo:"+"\t"+objcancion1.getTitulo());
        System.out.println("minutos y segundos:"+"\t"+objcancion1.getMinutos()+":"+objcancion1.getSegundos());
        System.out.println("año publicacion:"+"\t"+mensaje);
                
       System.out.println("Cómo tan muchacho"); 
        

       
    }
    
    
    
}
