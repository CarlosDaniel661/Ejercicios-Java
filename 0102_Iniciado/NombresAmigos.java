// Guarde en variables el nombre de N cantidad de amigos, itere sobre esa cantidad mostrando el nombre de cada amigo.

import java.util.Scanner;
public class NombresAmigos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese la cantidad de amigos: ");
        int cantidadAmigos = scanner.nextInt();

        String[] nombresAmigos = new String[cantidadAmigos];
        
        scanner.nextLine();
        for (int i = 0; i < cantidadAmigos; i++) {
            System.out.print("Ingrese el nombre del amigo " + (i + 1) + ": ");
            nombresAmigos[i] = scanner.nextLine();
        }

        System.out.println("Nombres de amigos:");
        for (int i = 0; i < cantidadAmigos; i++) {
            System.out.println(nombresAmigos[i]);
        }
    
        scanner.close();
    }
    
}


