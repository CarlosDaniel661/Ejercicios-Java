//Realizar un programa donde se guarden 5 en un arreglo. Luego, el programa debe mostrar en pantalla el valor máximo y mínimo de los números ingresados.

import java.util.Scanner;
public class MayoresYMenores {
    public static void main(String[] args) {
        int[] numeros = new int[5];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingeresa 5 números:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] =scanner.nextInt();
        }

        scanner.close();

        int max = numeros[0];
        int min = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
            if (numeros[i] < min) {
                min = numeros[i];
                
            }
        }

        System.out.println("El valor máximo es: " + max);
        System.out.println("El valor mínimo es: "+ min);
        


    }
}
