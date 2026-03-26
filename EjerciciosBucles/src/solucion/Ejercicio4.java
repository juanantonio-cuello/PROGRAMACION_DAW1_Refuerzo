/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solucion;

import java.util.Scanner;

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
        Scanner entrada=new Scanner (System.in);
    
        String numeroIntroducido;
        int intentos = 0;
        String password="1234";   //Lo trato como cadena para permitir password que empiecen por 0
                             //int dato=0112    es numero octal   
        
            
  
        
        System.out.println("CAJA FUERTE. 3 INTENTOS");
        System.out.println("**********1234**********");

        System.out.println("== opcion1: condicion en while y sin booleano ==");
        
        do {
            System.out.print("Introduce la clave:");
            numeroIntroducido=entrada.nextLine();
            intentos++;
            
            //Mensaje si acierto o fallo
            if (numeroIntroducido.equals(password)){
                System.out.println("\033[32mCLAVE ENCONTRADA!!\033[30m");
              
            }
            else if (intentos==3){
                System.out.println("\033[31mLO SIENTO. CAJA BLOQUEADA\033[30m");
           
            }
        }while (!numeroIntroducido.equals(password)
                && intentos<3);
        
        
        
    }
    
}
