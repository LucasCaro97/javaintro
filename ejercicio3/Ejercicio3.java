package guia.java.ejercicio3;

import java.util.Scanner;


public class Ejercicio3 {


    public static void main(String[] args) {
            
        String frase;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese una frase");
        frase = entrada.nextLine();
        
        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());
       
            

    }
    
}

