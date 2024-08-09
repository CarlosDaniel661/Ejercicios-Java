//Escribir un programa que encuentre la suma de los números impares en un rango de números enteros guardados en una variable.


import java.util.Scanner;
public class SumaDeImpares {
    public static int sumaImpares(int inicio, int fin) {
        int suma = 0;

        for (int i = inicio; i <= fin; i++) {
            if (i % 2 != 0) {
                suma += i;
            }
        }
        return suma;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero del rango: ");
        int inicio = scanner.nextInt();

        System.out.print("Ingrese el ultimo número entero del rango: ");
        int fin = scanner.nextInt();

        int resultado = sumaImpares(inicio, fin);
        System.out.println("La suma de los números impares entre " + inicio + " y " + fin + " es: " + resultado);

        scanner.close();
    }
}
