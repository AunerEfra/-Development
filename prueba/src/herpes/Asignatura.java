/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herpes;

/**
 *
 * @author auner
 */
public abstract class Asignatura {
     private String nombre;
    
    private String codigo;
    
    private int periodo;
    
    //Establecer y obtener 
    public void establecerNombre (String nombre){
        this.nombre = nombre;
        
    }
     public String obtenerNombre(){
         return this.nombre ;
         
     }
     
      public void establecerCodigo(String codigo){
          this.codigo = codigo;
 
     }
      public String obtenerCodigo(){
          return this.codigo;
      }
      public void imprimirInform(){
       System.out.println("nombre" + nombre);   
        System.out.println("codigo" + codigo); 
      
      }
      abstract String obtenerInformacionAsignatura();
}
