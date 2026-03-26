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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner (System.in);
    
        System.out.println("CAJA FUERTE. INTENTOS ILIMITADOS");
        System.out.println("===============num secreto: 1234");
        System.out.println("");

        String numeroIntroducido;
        String secreto="1234";   //Lo trato como cadena para permitir password que empiecen por 0
                             //int dato=0112    es numero octal   
        
        
        
        
        
//        do {
//            System.out.print("Introduce la clave:");
//            numeroIntroducido=entrada.nextLine();
//
//            
//            //Mensaje si acierto o fallo
//            if (numeroIntroducido.equals(secreto)){
//                System.out.println("\033[32mCLAVE ENCONTRADA!!\033[30m");
//              
//            }
//            
//        }while (!numeroIntroducido.equals(secreto));
        
        
        //===== opcion con booleano
        boolean acertado = false;
        
        do {
            System.out.print("Introduce la clave:");
            numeroIntroducido=entrada.nextLine();

            
            //Mensaje si acierto o fallo
            if (numeroIntroducido.equals(secreto)){
                System.out.println("\033[32mCAJA FUERTE DESBLOQUEDA\033[30m");
                acertado = true;
            }
            
        }while (acertado==false);   //(!acertado)
        
        
        
        
    }
    
}
