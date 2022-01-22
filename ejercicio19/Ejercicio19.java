/*
Crea una aplicación que a través de una función nos convierta una cantidad de
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
converir que será una cadena, este no devolverá ningún valor y mostrará un
mensaje indicando el cambio (void).
 */
package guia.java.ejercicio19;

import java.util.Scanner;

/**
 *
 * @author 54375
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);
    
        System.out.println("Ingrese la cantidad de EUROS que desea convertir: ");
        double euros = entrada.nextDouble();
        
        System.out.println("Ingrese a que moneda convertir (DOLARES/YENES/LIBRAS) ");
        String moneda = entrada.next();
        moneda.toLowerCase();
        
        RealizarCambio(euros,moneda);
    }
    
public static void RealizarCambio(double euros, String moneda){
    
            switch(moneda) {
        case "dolares":
            System.out.println( euros + " EUROS EQUIVALEN A: " + euros * 1.28611 + "DOLARES");
            break;
        
        case "yenes":
            
            System.out.println( euros + " EUROS EQUIVALEN A: " + euros * 0.86 + "YENES");
            break;
            
        case "libras":
            
            System.out.println( euros + " EUROS EQUIVALEN A: " + euros * 129.852 + "LIBRAS");
            break;
            
        default: 
            System.out.println("MONEDA INVALIDA");
            break;
            }
    
    
}

}
