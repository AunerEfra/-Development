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
public class Introduccion  extends Asignatura{
     public Introduccion(){
         
        establecerNombre("Introd");
        establecerCodigo("In-94");
        
    }

    @Override
     public String obtenerInformacionAsignatura() {
        return "informacion para introduccion";
    }
       

}
