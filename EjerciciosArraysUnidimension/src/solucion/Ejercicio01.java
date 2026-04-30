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
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        
        String []animales={"perro","gato","conejo","pollo","leon"};
        
        System.out.println(animales[0]);
        System.out.println(animales[1]);
        System.out.println(animales[2]);
        System.out.println(animales[3]);
        System.out.println(animales[4]);
        
        System.out.println("--");
        
        String []animales2=new String[5];
        animales2[0]="perro";
        animales2[1]="gato";
        animales2[2]="conejo";
        animales2[3]="pollo";
        animales2[4]="lion";

        for (int i = 0; i < animales2.length; i++) {
            System.out.println(animales2[i]);
        }
        
        System.out.println("-------------");

        
        //PARTE2
        System.out.println("");
        for (int i = 0; i < animales.length; i++) {
            System.out.print("Dime animal:");
            String animal = entrada.nextLine();
            animales[i]=animal;
        }
        System.out.println("");
        System.out.println("Nueva lista de animales:");
        for (int i = 0; i < animales.length; i++) {
            System.out.println(animales[i]);
        }
        
        
        
        
        
        
    }
    
}
