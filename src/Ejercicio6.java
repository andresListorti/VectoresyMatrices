/*    Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde 
        la suma de sus filas, sus columnas y sus diagonales son idénticas. 
         Crear un programa que permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no. 
               El programa deberá comprobar que los números introducidos son correctos, es decir, están entre el 1 y el 9.
 */

import java.util.Scanner;

///
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Ingrese un valor para la posicion: [" + i + "][" + j + "]");
                matriz[i][j] = leer.nextInt();
            }
        }
        // Imprimir matriz
        String aux = "";
        System.out.println("La original: ");
        for (int[] fila : matriz) {
            aux = "";
            for (int elemento : fila) {
                aux += " " + elemento;
            }
            System.out.println(aux);
        }

        // Suma filas
        int sumaFila;
        int[] sumadosF = new int[3];
        for (int i = 0; i < matriz[0].length; i++) {
            sumaFila = 0;
            for (int j = 0; j < matriz[0].length; j++) {
                sumaFila += matriz[i][j];
            }
            // System.out.println("La suma de la fila " + i + " da un total de: " +
            // sumaFila);
            sumadosF[i] = sumaFila;
        }

        // Compara los sumados
        boolean igualesFilas = false;
        if ((sumadosF[0] == sumadosF[1]) && (sumadosF[1] == sumadosF[2])) {
            igualesFilas = true;
        }
        // System.out.println("El buleano de filas quedo: " + igualesFilas);

        // Suma columnas
        int sumaColumna;
        int[] sumadosC = new int[3];
        for (int i = 0; i < matriz[0].length; i++) {
            sumaColumna = 0;
            for (int j = 0; j < matriz[0].length; j++) {
                sumaColumna += matriz[j][i];
            }
            // System.out.println("La suma de la columna " + i + " da un total de: " +
            // sumaColumna);
            sumadosC[i] = sumaColumna;
        }
        // Compara los sumadosColumnas
        boolean igualesColumnas = false;
        if ((sumadosC[0] == sumadosC[1]) && (sumadosC[1] == sumadosC[2])) {
            igualesColumnas = true;
        }
        // System.out.println("El buleano de Columnas quedo: " + igualesColumnas);
        ////
        int sumaDiaglonal1 = 0;
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == j) {
                    sumaDiaglonal1 += matriz[i][j];
                }
            }
        }
        // System.out.println("La suma de la diagonal principal da un total de: " +
        // sumaDiaglonal1);

        ///
        /// suma diagonal segundaria
        int auxiliarParaCol = 2;
        int sumaDiaglonal2 = 0;
        for (int i = 0; i < matriz[0].length; i++) {
            sumaDiaglonal2 += matriz[i][auxiliarParaCol];
            auxiliarParaCol--;
        }
        // System.out.println("La suma de la diagonal secundaria da un total de: " +
        // sumaDiaglonal2);
        //
        //
        boolean magica = false;
        if (igualesFilas && igualesColumnas) {
            if ((sumadosF[0] == sumaDiaglonal1) && (sumaDiaglonal1 == sumaDiaglonal2)) {
                magica = true;
            }
        }
        System.out.println("Es Una Matriz Magica: " + magica);
    }
}
