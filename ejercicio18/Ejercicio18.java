/*

. Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **


 */
package guia.java.ejercicio18;

import java.util.Scanner;

/**
 *
 * @author 54375
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);
    int nro;
    
        for (int i = 0; i < 5; i++) {
            do {
                System.out.println("Ingrese un numero entre 1 y 20: ");
                nro = entrada.nextInt();
                
            } while (nro < 1 || nro > 20);
            
            for (int j = 0; j < nro; j++) {
                if (j == 0) {
                    System.out.print(nro);
                }
                System.out.print("*");
                
                    
                
            }
            System.out.println("");
            
            
        }
    
    
    }
    
}
