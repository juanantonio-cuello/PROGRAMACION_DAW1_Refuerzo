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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner (System.in);
        int radio;
        double area;
        
        System.out.print("Dime el radio:");
        radio = Integer.parseInt(teclado.nextLine());
        
        area = Math.PI * Math.pow(radio, 2);
        
        System.out.println("El area de la circunferencia de radio "+radio+" es "+area);
        System.out.printf("El area de la circunferencia de radio %d es %.3f\n",radio,area);
    }
    
}
