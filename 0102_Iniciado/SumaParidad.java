//Realizar un programa que guarde un número en memoria y determine si es par o impar.

import java.util.Scanner;
public class SumaParidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();

        int suma = numero1 + numero2;

        if (suma % 2 == 0) {
            System.out.println("El resultado de la suma de los números: " + numero1 + " y " + numero2 + " es " + suma + " y es par.");

        } else{
            System.out.println("El resultado de la suma de los números " + numero1 + " y " + numero2 + " es " + suma + " y es impar.");

        }
        scanner.close();

    }
}
