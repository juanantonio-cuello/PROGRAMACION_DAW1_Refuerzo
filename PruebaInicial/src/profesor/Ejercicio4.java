package profesor;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Juan Antonio Cuello Alarcon <juanantonio.cuello@murciaeduca.es>
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        int suma = 0;

        for (int i = 0; i < 4; i++) {
            System.out.print("Introduce número " + (i+1) + ": ");
            int num = Integer.parseInt(teclado.nextLine());
            suma = suma + num;
        }

        System.out.println("La suma total es: " + suma);

        teclado.close();
        
        
    }
    
}
