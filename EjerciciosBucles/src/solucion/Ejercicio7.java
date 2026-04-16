/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solucion;

import profesor.*;
import java.util.Scanner;

/**
 *
 * @author Juan Antonio Cuello Alarcon <juanantonio.cuello@murciaeduca.es>
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);

        // Pedir datos al usuario
        System.out.print("Introduce el número de filas: ");
        int filas = sc.nextInt();

        System.out.print("Introduce el número de columnas: ");
        int columnas = sc.nextInt();

        
        
        // Dibujar el rectángulo relleno
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("*");
            }
            System.out.println(); // salto de línea al acabar cada fila
        }

        
        System.out.println("");
        System.out.println("");
        
        
        //Dibujar el rectángulo huecho
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                
                // Bordes: primera o última fila, o primera o última columna
                if (i == 0 || i == filas - 1 || j == 0 || j == columnas - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        
        
        sc.close();
        
        
        
    }
    
}
