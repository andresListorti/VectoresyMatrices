/* Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios y muestre la suma de sus elementos.
 */

import java.util.Scanner;

//
public class EjerciciosExtra5 {
    public static void main(String[] args) {
        int N, M;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor de N: ");
        N = leer.nextInt();
        System.out.println("Ingrese el valor de M: ");
        M = leer.nextInt();
        double[][] matriz = new double[N][M];
        // Llena
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j] = Math.floor(Math.random() * 10);
            }
        }
        // Lo muestra
        String aux = "";
        for (double[] fila : matriz) {
            aux = "";
            for (double elemento : fila) {
                aux += " " + elemento;
            }
            System.out.println(aux);
        }
        // La suma
        double suma = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                suma += matriz[i][j];
            }
        }
        System.out.println("La suma es " + suma);
    }
}
