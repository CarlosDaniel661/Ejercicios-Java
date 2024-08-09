//Realice un menú de opciones, donde la opción se guarde en una variable (Sin pedir por teclado), muestre la opción elegida y fuerce su salida bucle.


public class MenuOpciones {
    public static void main(String[] args) {
        int opcionElegida = 2;

        System.out.println("Menu de Opciones: ");
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
                System.out.println("Elegiste la Opcion 3");
                break;
            case 4:
                System.out.println("Elegiste la Opción 4");
                break;
        
            default:
                System.out.println("Opción no válida");
                break;
        }
    }
}
