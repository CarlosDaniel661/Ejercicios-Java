import java.util.Scanner;


public class Contador {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Ingresa un número: ");
            int numero = scanner.nextInt();
        
        
        for (int i = 0; i < 20; i++) {numero++;
        }

        System.out.println("El número incrementado 20 veces es: " +numero);
     } finally{
        scanner.close();
     }

    }
}