

package guia.java.ejercicio9;

import java.util.Scanner;



public class Ejercicio9 {


    public static void main(String[] args) {
            
        Scanner entrada = new Scanner(System.in);
        String frase;
        int longitud;
        
        System.out.println("Ingrese una frase de 8 caracteres");
        frase = entrada.nextLine();
        longitud = frase.length();
        
        if(longitud == 8){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
        

    }
    
}
