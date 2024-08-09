//Demuestre cómo convertir un bucle WHILE en un bucle FOR.//


public class WhileAFor {
    public static void main(String[] args) {
        int contador = 0;

        // Escribo mi bucle While
        while (contador < 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }

        // Escribo ese mismo bucle pero como un FOR

        for (int contador1 = 0; contador1 < 5; contador1++) {
            System.out.println("Contador: " + contador1);
        }
    }
}
