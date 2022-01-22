/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. El programa mostrará donde se
encuentra el numero y si se encuentra repetido
 */
package guia.java.ejercicio21;

import java.util.Locale;
import java.util.Scanner;



/**
 *
 * @author 54375
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int contador = 0;
        int[] vector = new int[10];
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
  
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 11) ;
            
        }
        
        System.out.println("Ingrese un valor que desee buscar");
        int nro = entrada.nextInt();
        
        for (int i = 0; i < vector.length; i++) {
           if(vector[i] == nro){
               contador = contador + 1;
               System.out.println("El nro: " + nro + " se encontro en la posicion " + i);
           }
            
        }
        
         
           if(contador == 0){
               System.out.println("No se encontro el numero en el vector");
           }else{
               System.out.println("El nro: " + nro + " se repite " + contador + " veces.");
           }
        
        
        
    
    }
    
}
