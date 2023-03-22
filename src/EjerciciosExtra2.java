
/*  Escriba un programa que averigüe si dos vectores de N enteros son iguales 
      (la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos) 
*/
///
import java.util.Scanner;

///
public class EjerciciosExtra2 {
    public static void main(String[] args) {
        System.out.println("Ingreese el valor de N siendo este la cardinalidad del vector: ");
        Scanner leer = new Scanner(System.in);
        int N = leer.nextInt();
        int[] vectorA = new int[N];
        int[] vectorB = new int[N];
        // Llenar vector A
        System.out.println("Llenar vector A: ");
        for (int i = 0; i < vectorA.length; i++) {
            System.out.println("Ingrese un valor para vectorA=[" + i + "]");
            vectorA[i] = leer.nextInt();
        }
        String aux = "";
        for (int i : vectorA) {
            aux += " " + i;
        }
        System.out.println("vectorA = " + aux);
        // Llenar vector B:
        System.out.println("Llenar vector B: ");
        for (int i = 0; i < vectorB.length; i++) {
            vectorB[i] = leer.nextInt();
        }
        aux = "";
        for (int i : vectorB) {
            aux += " " + i;
        }
        System.out.println("vectorB = " + aux);
        // Comparo ambos
        int coincidencia = 0;
        for (int i = 0; i < N; i++) {
            if (vectorA[i] == vectorB[i]) {
                coincidencia++;
                continue;
            } else {
                break;
            }
        }
        if (coincidencia == N) {
            System.out.println("VectorA y VectorB Son Iguales ");
        } else {
            System.out.println("Los vectores NO son iguales");
        }
    }
}
