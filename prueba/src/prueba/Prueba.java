/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;
import herpes.Ingles;
import herpes.Introduccion;

/**
 *
 * @author auner
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Ingles ingles = new Ingles ();
        Introduccion introduccion = new Introduccion ();
        
        System.out.println(ingles.obtenerInformacionAsignatura());
        ingles.imprimirInform();
        
        System.out.println(introduccion.obtenerInformacionAsignatura());
        introduccion.imprimirInform();
        // TODO code application logic here
    }
    
}
