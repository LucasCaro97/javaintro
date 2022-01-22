


package guia.java.ejercicio5;

import java.util.Scanner;



public class Ejercicio5 {



    public static void main(String[] args) {
        
        int num;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        num = entrada.nextInt();
        
        System.out.println("Numero: " + num);
        System.out.println("Doble: " + num * 2);
        System.out.println("Triple: " + num * 3);
        System.out.println("Raiz cuadrada: " + Math.sqrt(num) );
        
        
    }
    
}
