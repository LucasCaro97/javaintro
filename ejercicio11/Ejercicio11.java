


package guia.java.ejercicio11;

import java.util.Scanner;


public class Ejercicio11 {


    public static void main(String[] args) {
            
            Scanner entrada = new Scanner(System.in);
            int tipoMotor;
            
                do {
                    
                System.out.println("Ingrese un tipo de motor (Rango: 1 - 4 )");
                tipoMotor = entrada.nextInt();
                
                } while (tipoMotor < 1 || tipoMotor > 4);
            
            switch(tipoMotor) {
                case 1:
                    System.out.println("La bomba es una bomba de agua" );
                    break;
                case 2:
                    System.out.println("La bomba es una bomba de gasolina" );
                    break;
                case 3:
                    System.out.println("La bomba es una bomba de hormigon" );
                    break;
                case 4:
                    System.out.println("La bomba es una bomba de alimenticia" );
                    break;
                default:
                    System.out.println("No existe un valor valido para tipo de bomba");
            }
        
            
            
    }
    
}
