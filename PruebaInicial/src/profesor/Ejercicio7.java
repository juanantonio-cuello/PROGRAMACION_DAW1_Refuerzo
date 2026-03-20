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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);

        int suma = 0;
        int contador = 0;

        System.out.print("Introduce un número (-1 para terminar): ");
        int num = sc.nextInt();

        while (num != -1) {

            suma = suma + num;
            contador++;

            System.out.print("Introduce un número (-1 para terminar): ");
            num = sc.nextInt();
        }

        if (contador > 0) {
            double media = (double) suma / contador;
            System.out.println("La media es: " + media);
        } 
        else {
            System.out.println("No se introdujeron números");
        }

        sc.close();
        
        
        
    }
    
}
