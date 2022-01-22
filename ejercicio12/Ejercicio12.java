
package guia.java.ejercicio12;

import java.util.Scanner;



public class Ejercicio12 {




    public static void main(String[] args) {
            
        Scanner entrada = new Scanner(System.in);
        int nota;
        
        do {
            
            
        System.out.println("Ingrese una nota entra 1 y 10 ");
        nota = entrada.nextInt();
        
        } while ( nota < 1 || nota > 10);
        
    }
    
}


// Se va a ejecutar siempre que mi nota este entre 0 y 10
// rango x < 0 y x > 10 