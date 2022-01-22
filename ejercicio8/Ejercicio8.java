


package guia.java.ejercicio8;

import java.util.Scanner;


public class Ejercicio8 {



    public static void main(String[] args) {
            
        Scanner entrada = new Scanner(System.in);
        String frase;
        
        System.out.println("Ingrese una frase");
        frase = entrada.nextLine();
        
        if (frase.equals("eureka") ){
            System.out.println("CORRECTO");
        }else{
            System.out.println("Incorrecto");
        }
        
        
        
    }
    
}
