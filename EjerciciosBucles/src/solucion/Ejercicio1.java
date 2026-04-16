/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solucion;

import hechoenclase.*;
import java.util.Scanner;

/**
 *
 * @author Juan Antonio Cuello Alarcon <juanantonio.cuello@murciaeduca.es>
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//Pedir por teclado dos números, "a" y "b". Imprimir los números múltiplos de 5 (divisibles por 5)
//que haya entre dichos dos números.
//Control de errores: los números "a" y "b" no necesariamente te los deben dar en orden
//creciente.

        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        
        System.out.print("Dime a:");
        a = sc.nextInt();
        
        System.out.print("Dime b:");
        b = sc.nextInt();
        
        //a tiene que ser menor que b
        if (a>b){
            //Hay que intercambiar valores
            int aux = a;
            a = b;
            b = aux;
        }
        
        
        for (int i = a; i <= b; i++) {
            if (i%5==0){
                System.out.println("El numero "+i+" es multiplo de 5" );
            }
            
        }
        
        
        
    }
    
}
