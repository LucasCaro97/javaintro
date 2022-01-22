/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
package guia.java.ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        String cadena;
        int correctas = 0;
        int fallidas = 0;
        int longitud;

        //ENTRADA DE DATOS
        do {

            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingrese una cadena de 5 caracteres:");
            System.out.println("&&&&& para salir");
            cadena = entrada.next().toUpperCase();
            longitud = cadena.length();

            if (longitud == 5) {
                String first = first = cadena.substring(0, 1);
                String last = cadena.substring(cadena.length() - 1, cadena.length());

                if (first.equals("X") && last.equals("O")) {
                    correctas = correctas + 1;
                    System.out.println("First es igual a X y last es igual a O");
                } else if (cadena.equals("&&&&&")) {
                    continue;
                } else {
                    fallidas = fallidas + 1;
                }

            } else {
                System.out.println("La cadena debe tener 5 caracteres, ingrese otra");
            }

        } while (!"&&&&&".equals(cadena));

        System.out.println("Lecturas correctas : " + correctas);
        System.out.println("Lecturas fallidas : " + fallidas);

    }

}
