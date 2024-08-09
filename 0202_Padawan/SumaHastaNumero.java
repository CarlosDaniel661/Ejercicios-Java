//Realizar un programa donde se guarde un número entero en una variable y que imprima por pantalla el resultado de la suma de todos los números enteros desde 1 hasta ese número.

import java.util.Scanner;
public class SumaHastaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        scanner.close();

        int suma = 0;
        for (int i = 1; i <= numero; i++) {
            suma += i;
        }
        System.out.println("La suma de todos los números enteros desde 1 hasta " + numero + " es: " + suma);

    }
}
