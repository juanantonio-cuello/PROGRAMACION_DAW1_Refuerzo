package solucion;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Juan Antonio Cuello Alarcon <juanantonio.cuello@murciaeduca.es>
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);

        int num = 1;

        while (num != 0) {

            System.out.print("Introduce un número (0 para salir): ");
            num = sc.nextInt();

            if (num > 0) {
                System.out.println("El número es positivo");
            } 
            else if (num < 0) {
                System.out.println("El número es negativo");
            }

        }

        sc.close();
        
    }
    
}
