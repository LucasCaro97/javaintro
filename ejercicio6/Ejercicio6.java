


package guia.java.ejercicio6;

import java.util.Scanner;



public class Ejercicio6 {




    public static void main(String[] args) {
        
        
        int num1, num2;
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("Ingrese un numero");
        num1 = entrada.nextInt();
        System.out.println("Ingrese un numero");
        num2 = entrada.nextInt();

        
        if(num1 > num2){
            System.out.println("El numero mayor es " + num1);            
        }else{
            System.out.println("El numero mayor es " + num2);
        }

    }
    
}
