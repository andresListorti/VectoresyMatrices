/* Realizar un algoritmo que llene un vector con los 100 primeros números enteros 
          y los muestre por pantalla en orden descendente. 
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] vector = new int[100];
        for (int i = 1; i < vector.length - 1; i++) {
            vector[i] = i;
        }
        String aux = "";
        for (int i = vector.length; i >= 1; i--) {
            aux += " " + i;
        }
        System.out.println(aux);
    }
}
