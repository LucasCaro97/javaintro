/*

Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

 */
package guia.java.ejercicio22;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author 54375
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int nro, j, unDigito = 0, dosDigitos = 0, tresDigitos = 0, cuatroDigitos = 0, cincoDigitos = 0;
        
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese el tamaño del vector: ");
        nro = entrada.nextInt();
        
        int[] vector = new int[nro];

        for (int i = 0; i < nro; i++) {
            vector[i] = (int) (Math.random() * 10001) ;
        }

        for (int i = 0; i < nro; i++) {
            j = 0;
            while(vector[i] > 0 ){
                vector[i] = vector[i] / 10;
                j = j + 1;
            }
            if(j==1){
                unDigito = unDigito + 1;
            }
            if(j==2){
                dosDigitos = dosDigitos + 1;
            }
            if(j==3){
                tresDigitos = tresDigitos + 1;
            }
            if(j==4){
                cuatroDigitos = cuatroDigitos + 1;
            }
            if(j==5){
                cincoDigitos = cincoDigitos + 1;
            }
        }
        
        System.out.println("NUMEROS 1 DIGITO: " + unDigito);
        System.out.println("NUMEROS 2 DIGITOS: " + dosDigitos );
        System.out.println("NUMEROS 3 DIGITOS: " + tresDigitos );
        System.out.println("NUMEROS 4 DIGITOS: " + cuatroDigitos );
        System.out.println("NUMEROS 5 DIGITOS: " + cincoDigitos );
    
    }
    
}
