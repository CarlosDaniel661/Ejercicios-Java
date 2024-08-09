//Realizar un programa que guarde un número en memoria y determine si es positivo, negativo o cero.

import java.util.Scanner;
public class PositivoNegativoCero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("El número " + numero + " es positivo.");
        } else if (numero < 0) {
            System.out.println("El número " + numero + " es negativo.");

        } else {
            System.out.println("El número ingresado es cero");

        }
        scanner.close();
    }
}
