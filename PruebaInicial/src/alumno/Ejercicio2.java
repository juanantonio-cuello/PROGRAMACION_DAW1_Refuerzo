package alumno;

import profesor.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Juan Antonio Cuello Alarcon <juanantonio.cuello@murciaeduca.es>
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=10;
        int b=15;
        int c=13;
        
        if (a>b && a>c){
            System.out.println("El mayor es "+a);
        }
        else if(b>a && b>c){
            System.out.println("El mayor es "+b);
        }
        else{
            System.out.println("El mayor es "+c);
        }
              
          
    }
    
}
