/*
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.


 */
package guia.java.ejercicio14;

import java.util.Scanner;

/**
 *
 * @author 54375
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean salida = false;
        int suma = 0;
        int resta = 0;
        float div = 0;
        int mult = 0;
        
        //INGRESO DE DATOS
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero entero positivo");
        int num1 = entrada.nextInt();
        System.out.println("Ingrese otro numero entero positivo");
        int num2 = entrada.nextInt();
        
        //PROCESAMIENTO DE DATOS
        
        
        do {
            
        MostrarMenu();
        int opcionmenu = entrada.nextInt();
        
            
        switch(opcionmenu) {
        case 1:
            suma = num1 + num2;
            System.out.println("La suma es: " + suma );
            break;
        
        case 2:
            resta = num1 - num2;
            System.out.println("La resta es: " + resta);
            break;
        
        case 3:
            mult = num1 * num2;
            System.out.println("El producto es: " + mult);
            break;
        
        case 4:
            div = num1 / num2;
            System.out.println("La div es: " + div);
            break;
        
        case 5:
        System.out.println("Esta seguro que desea salir del programa? (S/N) ");
        String salir = entrada.next().toUpperCase();
        
        if(salir.equals(("S"))){
           salida = true;
        }else{
            salida = false;
        }
        
        }
        
        } while ( salida == false );
        
   

        
        
        
        
        
     
        
       
        
        
        
        
        
    }

    public static void MostrarMenu(){
        System.out.println("MENU");
        System.out.println("1 - SUMAR");
        System.out.println("2 - RESTAR");
        System.out.println("3 - MULTIPLICAR");
        System.out.println("4 - DIVIDIR");
        System.out.println("5 - SALIR");
        System.out.println("Elija una opcion: ");
    }
    
    
}
