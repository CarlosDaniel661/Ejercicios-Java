//Realizar un programa que guarde cierta cantidad de números con punto decimal en un arreglo. Luego, el programa debe ordenar los números de forma ascendente y mostrarlos en pantalla.

import java.util.Scanner;
import java.util.Arrays;

public class OrdenarNumerosDecimales {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de números decimales: ");
        int cantidad = scanner.nextInt();

        double[] numeros = new double[cantidad];

        System.out.print("Ingresa los números decimales: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();

        }
        scanner.close();

        Arrays.sort(numeros);
        System.out.println("Números ordenados de forma ascendente: ");
        for (double num : numeros) {
            System.out.println(num);

        }
    }
}
