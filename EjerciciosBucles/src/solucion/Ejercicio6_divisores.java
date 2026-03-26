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
public class Ejercicio6_divisores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        int num;   //***EXPLICAR PORQUE NO PUEDO DECLARARLO DENTRO DEL DO..WHILE
        
        
        
        //http://nosolomates.es/ayuda/ayuda/divisores.htm
        
        System.out.println("   CALCULO DE DIVISORES");
        System.out.println("===========================");
        do{
        
            System.out.print("Dime un numero (0 para salir):");
            num=Integer.parseInt(teclado.nextLine());
            
            for (int i = 1; i <= num; i++) {  //i son los posibles divisores
                if (num%i==0){
                    System.out.println("  El numero "+i+" es divisor de "+num);
                }
            }
            System.out.println("");
            
            
     
        }while (num!=0);    
        
        
        
        
    }
    
}
