// Realice un menú de opciones con bucle WHILE, donde la opción se guarde en una variable (Sin pedir por teclado), muestre la opción elegida y fuerce su salida bucle.



public class MenuOpciones2 {
    public static void main(String[] args) {
        int opcionElegida = 2;

        boolean seguir = true;

        while (seguir) {
            System.out.println("Menú de Opciones:");
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Opción 3");
            System.out.println("4. Opción 4");

            switch (opcionElegida) {
                case 1:
                    System.out.println("Elegiste la Opción 1");
                    break;
                case 2:
                    System.out.println("Elegiste la Opción 2");
                    break;
                case 3:
                    System.out.println("Elegiste la Opción 3");
                    break;
                case 4:
                    System.out.println("Elegiste la Opción 4");
                    break;
            
                default:
                    System.out.println("Opción no válida");
                    break;
            }
            seguir = false;            
        }
        System.out.println("Menú Finalizado.");

    }
}
