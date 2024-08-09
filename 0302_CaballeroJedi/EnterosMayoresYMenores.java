// Dado un arreglo con valores enteros, realice la búsqueda de ese entero, si encontró el entero mostrarlo por pantalla sino muestre por pantalla que no lo encontró.

import java.util.Scanner;
public class EnterosMayoresYMenores {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número a buscar: ");
        int numeroABuscar = scanner.nextInt();

        boolean encontrado = false;

        for ( int numero : numeros) {
            if (numero == numeroABuscar) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("El número " + numeroABuscar + " se encontró en el arreglo");
        } else {
            System.out.println("El número " + numeroABuscar + " no se encontró en el arreglo");
            
        }
        scanner.close();
    }
    
}