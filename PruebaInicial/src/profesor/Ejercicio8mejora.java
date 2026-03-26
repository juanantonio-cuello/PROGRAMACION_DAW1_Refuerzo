/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package profesor;

import java.util.Scanner;

/**
 *
 * @author Juan Antonio Cuello Alarcon <juanantonio.cuello@murciaeduca.es>
 */
public class Ejercicio8mejora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner (System.in);

        String tamaño;
        String topping;
        int precio=0;
        
        System.out.print("Dime el tamaño [pequeño | grande]: ");
        tamaño=teclado.nextLine();
        
        System.out.print("Topping [choco | fresas | cacahuete]: ");
        topping=teclado.nextLine();
        
        
        //Calculo precio por tamaño
        if (tamaño.equals("pequeño")){
            precio=precio+3;
        }
        else if (tamaño.equals("grande")){
            precio=precio+4;
        }
        else {
            System.out.println("Tamaño incorrecto");
        }
        
        //Calculo precio por topping
        switch (topping){
            case "choco":
                precio = precio + 1;
                break;
            case "fresas":
                precio = precio + 2;
                break;
            case "cacahuete":
                precio = precio + 3;
                break;
            default:
                System.out.println("Topping incorrecto");
            
        }
        
        System.out.println("Tu helado "+tamaño+" de "+topping+" vale: "+precio+"€");
    }
    
}
