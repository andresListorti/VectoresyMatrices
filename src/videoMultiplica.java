/*    Realizar la multiplicacion de un vector por una matriz
 *      Dado un vector 1xN y una matriz NxM, el resultado del producto es 1xM 
 *          Ej. vector 1x2 * matriz 2x3 = producto 1x3
 * 
 *          v=[3,5] * m= [4,8,6] = [{3*4 + 5*2}, {3*8 + 5*1}, {3*6 + 5*7}] = [22,29,53]
 *                       [2,1,7]   
 */

import java.util.Scanner;

public class videoMultiplica {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Declaracion y creacion de vector
        // tipo[] nombreVector = new tipo[tamanio]

        // Declarar un arreglo de 1 dimension
        int[] vector;
        // Darle espacio en memoria, construir dimensionar, crear las dimensiones, con
        // el valor por defector (cero para los enteros)
        vector = new int[2];
        // Los 2 pasos en 1 linea
        int[] producto = new int[3];

        // Declaracion y creacion de una matriz
        // tipo[][] nombreMatriz = new int[Filas][Columnas]

        // Declatracion e inicializacion con valores determinados
        int[][] matriz = { { 4, 8, 6 }, { 2, 1, 7 } };

        // GENERICAMENTE
        // Declaracion y creacion de arreglos genericos
        // tipo[][]...[] nombreArreglo = new
        // tipo[cardinalidad1][cardinalidad2]...[cardinalidadN];

        System.out.println("Ingrese los valores del vector de tamanio " + vector.length + ": ");
        // int = 0 porque los subindices de los arreglos en java se inician en cero -
        // ARREGLOS EN JAVA ES CERO INDEX
        for (int i = 0; i < vector.length; i++) {
            System.out.print("V[" + i + "] = ");
            // acceder al valor i del vector
            vector[i] = leer.nextInt();
        }

        // Multiplica vector por matriz
        int sumados;
        // Para cada columna de la matriz
        for (int j = 0; j < matriz[0].length; j++) {
            sumados = 0;
            // ... reseteo la suma que sera llenada con vector * columna multiplicada y
            // sumada... recorro el vector y lo
            // multiplico
            for (int i = 0; i < vector.length; i++) {
                sumados += vector[i] * matriz[i][j];
                // asi llenamos sumados con vector por columna + vector por columna
            }
            producto[j] = sumados; // asigno la suma de fila por columna multiplicada al vector resultante.
        }

        String aux = "";
        // Mostrar vector
        System.out.println("Vector: ");
        // Bucle for mejorado (Enhanced)
        // for(tipo elemento: arreglo)
        for (int elemento : vector) {
            aux = aux + " " + elemento; // Esto Stringuea todo elemento del arreglo y lo asigna a aux
        }
        System.out.println(aux);

        // Mostrar Matriz
        System.out.println("Matriz: ");
        // Para cada fila de la Matriz
        for (int[] fila : matriz) {
            // Reseteamos el elemento aux que nos va a Stringuear
            aux = "";
            // Para cada elemento de la fila
            for (int elemento : fila) {
                aux += " " + elemento;
            }
            System.out.println(aux);
        }

        // Mostrar resultado
        aux = "";
        System.out.println("Producto: ");
        // for(tipo elemento: arreglo)
        for (int elemento : producto) {
            aux += " " + elemento; //
        }
        System.out.println(aux);
    }
}
