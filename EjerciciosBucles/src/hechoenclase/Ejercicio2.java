/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hechoenclase;

import java.util.Scanner;

/**
 *
 * @author Juan Antonio Cuello Alarcon <juanantonio.cuello@murciaeduca.es>

 * Hacer un programa que lea números enteros por teclado (uno a uno). El programa termina al
 * introducir un cero.
 * Usa dos formas para programar la condición del bucle:
 * • Comprobando que el numero es distinto de cero
 * • Usando un testigo (un booleano) que indique que has metido un cero.
 * Añadido al ejercicio: Al finalizar, indicar si hemos introducido algún número negativo y decirlo.
 */

public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int num;
        boolean parar=false;
        boolean hayNegativos = false;
        
        //Forma1
//        do{
//            System.out.print("Dime un numero (0 para parar):");
//            num = sc.nextInt();
//            
//        }while(num!=0);
        
        
        //===============================================================
        

        //Forma2 y con la mejora
        do{
            System.out.print("Dime un numero (0 para parar):");
            num = sc.nextInt();
            
            if (num==0){
                parar = true;
            }
            
            //Analisis de negativos
            if (num<0){
                hayNegativos=true;
            }
            //NOOOOOOOOOO se pone else
//            else{
//                hayNegativos=false;
//            }
            
            
        }while(parar==false);
        
        if (hayNegativos==true){
            System.out.println("SI he introducido negativos");
        }else{
            System.out.println("NO he introducido negativos");
        }
        
    }
    
}
