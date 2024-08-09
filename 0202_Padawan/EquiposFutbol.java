// Guarde en variables el nombre de 2 equipos de fútbol, luego en otras 2 variables el nombre de los entrenadores y luego guarde el nombre de los jugadores en distintas variables. Luego muestre un encabezado con el nombre de cada equipo y por cada equipo muestre los nombres de los jugadores.



public class EquiposFutbol {
    public static void main(String[] args) {
        
        String equipo1 = "Equipo A";
        String equipo2 = "Equipo B";

        String entrenador1 = "Entrenador A";
        String entrenador2 = "Entrenador B";

        String jugador1Equipo1 = " Jugador 1A";
        String jugador2Equipo1 = " Jugador 2A";
        String jugador3Equipo1 = " Jugador 3A";

        String jugador1Equipo2 = " Jugador 1B";
        String jugador2Equipo2 = " Jugador 2B";
        String jugador3Equipo2 = " Jugador 3B";


        System.out.println("Equipo: " + equipo1);
        System.out.println("Entrenador: " + entrenador1);
        System.out.println("Jugadores:");
        System.out.println("1. " + jugador1Equipo1);
        System.out.println("2. " + jugador2Equipo1);
        System.out.println("3. " + jugador3Equipo1);
        System.out.println();

        System.out.println("Equipo: " + equipo2);
        System.out.println("Entrenador: " + entrenador2);
        System.out.println("Jugadores:");
        System.out.println("1. " + jugador1Equipo2);
        System.out.println("2. " + jugador2Equipo2);
        System.out.println("3. " + jugador3Equipo2);
    }
}
