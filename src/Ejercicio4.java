/* Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la transpuesta de la matriz. 
    La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa). 

    A= [1, 0, 4]    B= [1, 0, 6]
       [0, 5, 0]       [0, 5, 0]               // Transpuesta, es intercambiar filas por columnas
       [6, 0,-9]       [4, 0,-9]
    
    
    */

public class Ejercicio4 {
    public static void main(String[] args) {
        double[][] matriz = new double[4][4];
        double[][] matrizTranspuesta = new double[4][4];
        for (double[] fila : matriz) {
            for (int i = 0; i < fila.length; i++) {
                fila[i] = Math.floor(Math.random() * 10); // Asi me parece mas claro el acceso
            }
        }

        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matrizTranspuesta[i][j] = matriz[j][i]; // Se puede acceder asi tambien
            }
        }

        // Imprimir Matriz
        String aux = "";
        System.out.println("La original: ");
        for (double[] fila : matriz) {
            aux = "";
            for (double elemento : fila) {
                aux += " " + elemento;
            }
            System.out.println(aux);
        }
        System.out.println("La transpuesta: ");
        for (double[] fila : matrizTranspuesta) {
            aux = "";
            for (double elemento : fila) {
                aux += " " + elemento;
            }
            System.out.println(aux);
        }
    }
}
