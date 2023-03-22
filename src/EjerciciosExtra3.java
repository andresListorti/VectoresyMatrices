/* Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro. Después haremos otra función o procedimiento que imprima el vector. */

import java.util.Scanner;

///
public class EjerciciosExtra3 {
    public static void main(String[] args) {
        int N;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor de N: ");
        N = leer.nextInt();
        double[] vector = new double[N];
        mostrador(vector);
        rellenador(vector);
        mostrador(vector);
    }

    // Funcion para cargar numeros random al vector N
    public static double[] rellenador(double[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = Math.floor(Math.random() * 10);
        }
        return vector;
    }

    // Funcion para mostrar Vector
    public static void mostrador(double[] vector) {
        String aux = "";
        for (double i : vector) {
            aux += " " + i;
        }
        System.out.println(aux);
    }
}
