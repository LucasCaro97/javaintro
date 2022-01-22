


package guia.java.ejercicio7;

import java.util.Scanner;



public class Ejercicio7 {

    
    
    
    public static void main(String[] args) {
            
        Scanner entrada = new Scanner(System.in);
        int num1;
        
        System.out.println("Ingrese un numero");
        num1 = entrada.nextInt();
        
        if((num1 % 2 == 0)){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
            
    
    }
    
}
