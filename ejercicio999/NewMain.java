/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.java.ejercicio999;

/**
 *
 * @author 54375
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        String cadena = "XOLMO";
        int longitud = cadena.length();
        System.out.println("Cadena: " + cadena);
        System.out.println("Longitud: " + longitud);
        
        String first = cadena.substring(0, 1);
        System.out.println("First: " + first);
        
        String last = cadena.substring(cadena.length()-1, cadena.length());
        System.out.println("Last: " + last);
        
        
        if(first.equals("X") && last.equals("O")){
            System.out.println("First es igual a X y last es igual a O");
            
        }
        
    }
    
}
