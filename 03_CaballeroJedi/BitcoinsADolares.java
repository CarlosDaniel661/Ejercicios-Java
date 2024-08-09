import java.util.Scanner;

public class BitcoinsADolares {
    private static final double FACTOR_CONVERSION = 66836.90;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    try {
        System.out.print("Ingrese la cantidad de Bitcoins: ");
        double cantidadBitcoins = scanner.nextDouble();

        double valorEnDolares = cantidadBitcoins * FACTOR_CONVERSION;

        System.out.println("La cantidad de Bitcoins ingresada, equivale a " + valorEnDolares + " dólares americanos");
        
    }finally {
        scanner.close();
    }    
    }
}
