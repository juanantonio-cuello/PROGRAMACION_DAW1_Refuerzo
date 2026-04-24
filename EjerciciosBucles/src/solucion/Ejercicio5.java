/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solucion;

import profesor.*;
import java.util.Random;
import java.util.Scanner;

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
        
        System.out.println("=== ACERTAR UN NUMERO ALEATORIO ===");
        
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        
        int numeroSecreto = rand.nextInt(51); // 0 a 50
        int intento = 0;
        int numeroUsuario = -1;

        System.out.println("CHEAT: "+numeroSecreto);
        
        while (numeroUsuario != numeroSecreto) {

            System.out.print("Introduce un número (0-50): ");
            numeroUsuario = sc.nextInt();
            intento++;

            if (numeroUsuario == numeroSecreto) {
                System.out.println("🎉 ¡Correcto!");
            } else if (numeroUsuario < numeroSecreto) {
                System.out.println("🔼 El número es mayor");
            } else {
                System.out.println("🔽 El número es menor");
            }
        }

        System.out.println("Intentos: " + intento);

        sc.close();
        
        
        
        
    }
    
}
