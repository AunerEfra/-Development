/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class Recursos {
    
    public static void enunciado (){
        System.out.println("Programación Orientada a Objetos 2021");
    }
    
    public static void esMayorDeEdad (int x){
        if(x>=21){
            System.out.println("Es Mayor de Edad");
        } else {
            System.out.println("No es Mayor de Edad");
        }
    }
    
    public static int multiplicacion (int num1, int num2){
        return num1*num2;
    }
    
    public static void mostrarLista (){
        int x;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese un numero:");
        x = in.nextInt();
        
        for (int i = 1; i <= x; i++) {
            System.out.println(i);
        }
    }
}
