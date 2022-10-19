package es.edu.escuela_it.java_basico.jornada_3;

import java.util.Random;

public class ArregloBool {

    public static void main(String[] args) {

        String[] seleccionCol = new String[]{"Falcao", "James", "Lucho", "Borre"};

        boolean[] penalties = new boolean[5];

        Random rnd = new Random();

        for (int i = 0; i < penalties.length; i++) {

            // debe retornar 0 o 1
            int numero = rnd.nextInt(2);

            penalties[i] = numero == 0 ? false : true;
            System.out.println("Se prepara para patear... " + seleccionCol[i]);

            if (penalties[i])
                System.out.println("GOOOOOOOL");
            else
                System.out.println("X");

        }
    }
}
