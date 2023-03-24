
/* 
     Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de 20 x 20 caracteres. 
         Las palabras se ubicarán todas en orden horizontal en una fila que será seleccionada de manera aleatoria. 
          Una vez concluida la ubicación de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9. 
         Finalmente imprima por pantalla la sopa de letras creada. 
        Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java substring(), Length() y Math.random().
 */
import java.util.Scanner;

///
public class EjerciciosExtra6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[][] sopaMatriz = new String[20][20];
        String[] vectorAux = new String[5];
        String ingresado = "x";
        boolean malIngresado = false;
        for (int i = 0; i < 5; i++) {
            if (malIngresado) {
                i--;
            }
            System.out.println(
                    "Solo de 3 a 5 caracteres - Ingrese el valor de la palabra para cargar al vector auxiliar en su index: "
                            + i + ": ");
            ingresado = leer.next();
            if (ingresado.length() < 3) {

                System.out.println("Valor mal ingresado: ");
                malIngresado = true;
                continue;
            } else if (ingresado.length() > 5) {
                System.out.println("Valor mal ingresado: ");
                malIngresado = true;
                continue;
            } else {
                malIngresado = false;
                System.out.println("No hubo errores, cargando en: " + i);
                vectorAux[i] = ingresado;
                vectorAux[i] = vectorAux[i].toUpperCase();
            }
        }
        // Mostrar vector de palabras cargadas
        String paraMostrar = "";
        for (String elemento : vectorAux) {
            paraMostrar += " " + elemento;
        }
        System.out.println(paraMostrar);
        // Llenar Matriz
        String palabra = "";
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                for (int k = 0; k < vectorAux.length; k++) {
                    palabra = vectorAux[k]; // Esto por fuera??
                    for (int l = 0; l < palabra.length(); l++) {
                        System.out.println(palabra.substring(l, l));
                    }
                }
                // if ((palabra.substring(k, k + 1) != "")) {
                // sopaMatriz[i][j] = palabra.substring(k, k + 1);
                // } else {
                // sopaMatriz[i][j] = "A";
                // }
            }
        }

        // Mostrar matriz
        String paraMostrarFila = "";
        for (String[] fila : sopaMatriz) {
            paraMostrarFila = "";
            for (String elemento : fila) {
                paraMostrarFila += " " + elemento;
            }
            System.out.println(paraMostrarFila);
        }
    }
}
