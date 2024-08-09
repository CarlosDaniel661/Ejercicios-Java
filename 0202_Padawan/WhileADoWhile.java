// Demuestre cómo convertir un bucle WHILE en un DO WHILE. //

public class WhileADoWhile {

    public static void main(String[] args) {
        int contador = 0;

        // Creo mi bucle While//
        while (contador < 5) {
            System.out.println("Contador: " + contador);
            contador++;
            
        }

        // Ahora hago lo mismo pero con un DO WHILE

        do{
            System.out.println("Contador: " + contador);
            contador++;
        } while (contador < 5);
        
    }   
    
}   