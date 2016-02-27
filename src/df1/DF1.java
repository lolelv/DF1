/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package df1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class DF1 {
    /*
    Se ingresa por teclado 3 números (variables a,b y c), en los cuales si el primero 'a' es mayor que el segundo 'b'
    es revisado el último 'c', si el 'a' es mayor se dice que el resultado es que es éste el mayor de los tres, 
    si no el 'c' sería el mayor. Si por el contrario el mayor es el segundo 'b', se prueba con el 'c', en donde si
    el 'b' es mayor se concluye con que éste es el mayor de los tres, si no es así el 'c' lo sería.
    */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float mayor = 0;
        float a, b, c;

        System.out.println("Ingrese A:");
        a = leer.nextFloat();
        System.out.println("Ingrese B:");
        b = leer.nextFloat();
        System.out.println("Ingrese C:");
        c = leer.nextFloat();

        if (a > b) {
            if (a > c) {
                mayor = a;
            } else {
                mayor = c;
            }
        } else if (b > c) {
            mayor = b;
        } else {
            mayor = c;
        }

        System.out.println("El mayor es: " + mayor);
    }
}
