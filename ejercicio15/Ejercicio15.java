/*

Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.

 */
package guia.java.ejercicio15;

import java.util.Scanner;



public class Ejercicio15 {

    
    
    public static void main(String[] args) {
     
        Scanner entrada = new Scanner(System.in);
        
        int contador = 0;
        int acumulador = 0;
        
        do {
            contador = contador + 1;
            System.out.println("Ingrese un numero");
            int nro = entrada.nextInt();
            
            if(nro == 0){
                System.out.println("Se capturo el numero 0");
                System.out.println("Suma: " + acumulador);
                break;
            }else if(nro < 0){
               continue; 
            }else{
            acumulador = acumulador + nro;
            }
                
            
            
            
        } while (contador != 20);
        
        if(contador == 20){
            System.out.println("Suma: " + acumulador);
            
        }
        
        
    }
    
}
