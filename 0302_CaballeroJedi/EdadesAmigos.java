//Guarda en un arreglo una N cantidad de amigos, itere sobre esa cantidad mostrando el nombre de cada amigo si y sólo si este amigo es mayor de edad, en caso de ser menor de edad imprima un mensaje diciendole a ese amigo porque no lo muestra por pantalla. Pero a su vez, encuentre al amigo que mayor edad tenga, muestre un mensaje por pantalla del nombre de esa persona y su edad.


import java.util.Scanner;
public class EdadesAmigos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la cantidad de amigos: ");
        int cantidad = scanner.nextInt();
        
        scanner.nextLine();

        String[] nombres = new String[cantidad];
        int[] edades = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa el nombre del amigo " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
            
            System.out.print("Ingresa la edad de " + nombres[i] + ": ");
            edades[i] = scanner.nextInt();
            scanner.nextLine();
            }

            scanner.close();

            String nombreMayorEdad = "";
            int mayorEdad = 0;

            for (int j = 0; j < cantidad; j++) {
                if (edades[j] >= 18) {
                    System.out.println(nombres[j] + " es mayor de edad.");
                } else {
                    System.out.println(nombres[j] + " no se muestra porque es menor de edad.");
                }

                if (edades[j] > mayorEdad) {
                    mayorEdad = edades[j];
                    nombreMayorEdad = nombres[j];
                }
            }

            System.out.println(" El amigo con mayor edad es " + nombreMayorEdad + " con " + mayorEdad + " años.");



        
    }
}
