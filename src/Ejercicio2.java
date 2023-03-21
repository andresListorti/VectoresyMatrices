/* Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida al usuario un número a buscar en el vector. 
      El programa mostrará dónde se encuentra el numero y si se encuentra repetido */

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        int N;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor de N: ");
        N = leer.nextInt();
        double[] vector = new double[N];
        // Cargamos numeros random al vector N
        for (int i = 0; i < vector.length; i++) {
            vector[i] = Math.floor(Math.random() * 10);
        }
        // Mostramos vector
        String aux = "";
        for (double d : vector) {
            aux += " " + d;
        }
        System.out.println(aux);
        // Adivinanza
        double adivinado = 0;
        boolean gano = false;
        System.out.println("Adivine alguno de los numeros que hay en el vector - Del 0 al 10: ");
        double respuesta = leer.nextInt();
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == respuesta) {
                adivinado++;
                gano = true;
            }

        }
        System.out.println("Adivino: " + gano);
        System.out.println("Una cantidad de: " + adivinado + " veces");
    }
}
