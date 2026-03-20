package profesor;


import java.time.Year;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Juan Antonio Cuello Alarcon <juanantonio.cuello@murciaeduca.es>
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número de mes (1-12): ");
        int mes = teclado.nextInt();

        switch (mes) {

            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("Este mes tiene 31 días");
                break;

            case 4: case 6: case 9: case 11:
                System.out.println("Este mes tiene 30 días");
                break;

            case 2:
                System.out.print("Introduce el año: ");
                int year = teclado.nextInt();

                if (Year.of(year).isLeap()) {
                    System.out.println("Febrero tiene 29 días (año bisiesto)");
                } else {
                    System.out.println("Febrero tiene 28 días");
                }
                break;

            default:
                System.out.println("Mes no válido");
        }

        teclado.close();
        
        
        
        
        
    }
    
}
