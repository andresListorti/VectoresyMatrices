
/* Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, con los valores ingresados por el usuario. */
///
import java.util.Scanner;

///
public class EjerciciosExtra1 {
    public static void main(String[] args) {
        System.out.println("Ingreese el valor de N siendo este la cardinalidad del vector: ");
        Scanner leer = new Scanner(System.in);
        int N = leer.nextInt();
        int[] vector = new int[N];
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese un valor para V=[" + i + "]");
            vector[i] = leer.nextInt();
        }
        String aux = "";
        for (int i : vector) {
            aux += " " + i;
        }
        System.out.println("Vector: " + aux);
        int sumados = 0;
        for (int i = 0; i < vector.length; i++) {
            sumados += vector[i];
        }
        System.out.println("El total de la suma de los elementos del vector es: " + sumados);
    }
}
