/* Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */

import java.util.Scanner;

//
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] vector = { 100, 2, 5 };
        // System.out.println(vector.length);
        String aux = "";
        for (int i : vector) {
            aux = "" + i;
            System.out.println("El elemento: " + aux + " tiene un total de: " + aux.length() + " de length");
            // System.out.println(aux.length());

        }
    }
}
