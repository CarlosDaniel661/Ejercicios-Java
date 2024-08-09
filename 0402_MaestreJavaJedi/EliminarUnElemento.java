//Dado un arreglo con valores enteros, realice la búsqueda de ese entero y si lo encuentra eliminarlo, si no lo encuentra informe por pantalla.


import java.util.Arrays;
import java.util.Scanner;

public class EliminarUnElemento {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor a buscar: ");
        int valorBuscado = scanner.nextInt();

        System.out.println("Arreglo original: " + Arrays.toString(arreglo));

        int indice = buscarIndice(arreglo, valorBuscado);

        if (indice != -1) {
            arreglo = eliminarElemento(arreglo, indice);
            System.out.println("El valor " + valorBuscado + " se encontró y se eliminó");
            System.out.println("Arreglo despues de eliminar: " + Arrays.toString(arreglo));
                        
        } else {
            System.out.println("El valor " + valorBuscado + " no se encontró en el arreglo.");

        }
        scanner.close();


    }
    public static int buscarIndice(int[] arreglo, int valor) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    public static int[] eliminarElemento(int[] arreglo, int indice) {
        if (indice < 0 || indice >= arreglo.length) {
            return arreglo;
        }
        int[] nuevoArreglo = new int[arreglo.length - 1];
        for (int i = 0, j = 0; i < arreglo.length; i++) {
            if ( i != indice) {
                nuevoArreglo[j++] = arreglo[i];

            }
        }
        return nuevoArreglo;
    }
    
}