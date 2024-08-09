//Guarda en variables el nombre de N cantidad de amigos, itere sobre esa cantidad luego muestre el nombre de cada amigo si y sólo si este amigo es mayor de edad, en caso de ser menor de edad imprima un mensaje diciendole a ese amigo porque no lo muestra por pantalla.

import java.util.Scanner;
public class AmigosEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de amigos: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        String[] nombres = new String[cantidad];
        int[] edades = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el nombre del amigo " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();

            System.out.print("Ingrese la edad de " + nombres[i] + ": ");
            edades[i] = scanner.nextInt();
            scanner.nextLine();
        }

        scanner.close();

        for (int i = 0; i <= cantidad; i++) {
            if (edades[i] >= 18) {
                System.out.println("Nombre del amigo mayor de edad: " + nombres[i]);
            } else {
                System.out.println("X, no se muestra porque el amigo es menor de edad");

            }
        }
    }
}
