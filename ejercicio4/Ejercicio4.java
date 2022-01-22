


package guia.java.ejercicio4;

import java.util.Scanner;



public class Ejercicio4 {


    public static void main(String[] args) {
            
        int temp, f;
        
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la temperatura actual");
        temp = entrada.nextInt();
        
        f =  32 + (9 * temp / 5);
        
        System.out.println("Grados Fahrenheit: " + f);
        
        

    }
    
}
