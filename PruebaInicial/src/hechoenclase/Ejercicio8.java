/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hechoenclase;

import java.util.Scanner;

/**
 *
 * @author Juan Antonio Cuello Alarcon <juanantonio.cuello@murciaeduca.es>
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        
        int precio=0;
        
        String tamaño;
        String topping;
        
        boolean tamañoOK=false;
        
        
        
        //Parte1_Pido el tamaño
        do{
        
            
            System.out.print("Qué tamaño quieres[pequeño | grande]: ");
            tamaño = sc.nextLine();
            

            //Calculo precio
            //1º analizo tamaño
            if (tamaño.equals("pequeño")){
                precio = precio + 3;
                System.out.println("   >Precio parcial: "+precio);
                tamañoOK=true;
            }
            else if (tamaño.equals("grande")){
                precio = precio + 4;
                System.out.println("   >Precio parcial: "+precio);
                tamañoOK=true;
                
            }
            else{
                System.out.println("ERROR, tamaño incorrecto");
            }
        
        //}while(!tamaño.equals("pequeño") && !tamaño.equals("grande") );        
        }while(tamañoOK==false);    
        
        
      
        
        //Parte2_Pido el topping
        do{
            System.out.println("");
            System.out.print("Qué topping quieres[choco | fresas | cacahuetes]: ");
            topping = sc.nextLine();
 

            //2º analizo topping
            switch(topping){
                case "choco":
                    precio = precio + 1;
                    System.out.println("   >Precio parcial: "+precio);
                    break;
                case "fresas":
                    precio = precio + 2;
                    System.out.println("   >Precio parcial: "+precio);
                    break;
                case "cacahuetes":
                    precio = precio + 3;
                    System.out.println("   >Precio parcial: "+precio);
                    break;
                case "":
                    break;
                default:
                    System.out.println("ERROR, topping incorrecto");

            }
        
        }while(!topping.equals(""));
        
        
            
        System.out.println("Tu helado cuesta: "+precio+"€");
        
        
    }
    
}
