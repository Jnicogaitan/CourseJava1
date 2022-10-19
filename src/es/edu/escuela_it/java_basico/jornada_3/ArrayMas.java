package es.edu.escuela_it.java_basico.jornada_3;

import java.util.Locale;
import java.util.Scanner;

public class ArrayMas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] seleccionCol = new String[]{"Falcao", "James", "Lucho", "Borre"};
        System.out.println("Jugadores mas destacados de la selección Colombia: ");

        for (String nombreJugador : seleccionCol) {
            System.out.println(nombreJugador);
        }
        System.out.println("Ingrese el nombre del jugador: ");

        String search = sc.nextLine();

        for (String nombreJugador : seleccionCol) {
            search = search.toLowerCase();
            nombreJugador = nombreJugador.toLowerCase();

            if (nombreJugador.contains(search)) {
                System.out.println("Jugador encontrado " + nombreJugador + "!!!");
            }
        }

        sc.close();

    }
}
