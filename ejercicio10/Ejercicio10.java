

package guia.java.ejercicio10;

import java.util.Scanner;



public class Ejercicio10 {



    public static void main(String[] args) {
        
        
        Scanner entrada = new Scanner(System.in);
        String frase, subcadena;
        
        
        
        System.out.println("Ingrese una frase o palabra");
        frase = entrada.nextLine();
        subcadena = frase.substring(0, 1);
        
        //System.out.println("Frase: " + frase );
        //System.out.println("Subcadena: " + subcadena);
        
        
        if(subcadena.equals("A") || subcadena.equals("a") ){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
        
        
        

    }
    
}
