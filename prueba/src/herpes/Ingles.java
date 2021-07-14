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
public class Ingles extends Asignatura {
    
    public Ingles(){
        establecerNombre("Ingles");
        establecerCodigo("In-98");
        
    }

    @Override
      public String obtenerInformacionAsignatura() {
        return "*informacion para ingles*";
    }





    
    
}
