public class PromedioEdades {
    public static void main(String[] args) {
        
        String[] nombres = {"Oki", "Moli", "Rodri", "Ale", "Belen"};
        int[] edades = {33, 33, 32, 31, 29};

        int sumaEdades = 0;
        for (int edad : edades) {
            sumaEdades += edad;
        }

        double promedioEdad = (double) sumaEdades / edades.length;

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Nombre: " + nombres[i] + ", Edad: " + edades[i]);

        }

        System.out.println("Promedio de edad: " + promedioEdad);

        
    }
    
}
