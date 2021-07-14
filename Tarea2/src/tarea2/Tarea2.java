/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

/**
 *
 * @author Sergio
 */
public class Tarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 21;
        int num1 = 10;
        int num2 = 5;
        System.out.println("primer metodo");
        Recursos.enunciado();
        System.out.println("segundo metodo");
        Recursos.esMayorDeEdad(x);
        System.out.println("tercer metodo");
        System.out.println(Recursos.multiplicacion(num1, num2));
        System.out.println("cuarto metodo");
        Recursos.mostrarLista();
    }
    // realizado por Auner Castillo//
}
