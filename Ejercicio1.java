package guia.java;

import java.util.Scanner;



public class Ejercicio1 {

    
    
    public static void main(String[] args) {
        
        int num1, num2;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        num1 = entrada.nextInt();
        
        System.out.println("Ingrese otro numero");
        num2 = entrada.nextInt();
             

        System.out.println("La suma de los dos numeros es: " + (num1 + num2) );
    }
    
}
