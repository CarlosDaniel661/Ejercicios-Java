// Realizar un programa que calcule el factorial de un número//

import java.util.Scanner;
public class Factorial {
    public static int factorialIterativo(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();
        int resultado = factorialIterativo(numero);
        System.out.println("El factorial de " + numero + " es " + resultado);

        scanner.close();
    }
}
