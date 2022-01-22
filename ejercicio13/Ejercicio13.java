



package guia.java.ejercicio13;

import java.util.Scanner;


public class Ejercicio13 {

    
    public static void main(String[] args) {
    
        int acu = 0;
    
        
         Scanner entrada = new Scanner(System.in);
         System.out.println("Ingrese un valor limite");
         int valorlimite = entrada.nextInt();
         
         do {
             
             System.out.println("Ingrese un numero: ");
             int numero = entrada.nextInt();
             acu = acu + numero;
             
        } while (acu < valorlimite );
        
         
    
    }
    
}
