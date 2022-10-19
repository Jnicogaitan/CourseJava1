package es.edu.escuela_it.java_basico.jornada_3;

import javax.sound.midi.Soundbank;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Arreglos {

    public static void main(String[] args) {

        //se declara el array
        int[] edades = new int[8];

        //carga de datos
        edades[0] = 96;
        edades[1] = 10;
        edades[2] = 852;
        edades[3] = 6;
        edades[4] = 36;
        edades[5] = 85;
        edades[6] = 73;
        edades[7] = 120;

        System.out.println("Dimension del array: " + edades.length);

        //c. Recorrido para mostrar cada pocision del arreglo
        for (int i = 0; i < edades.length; i++) {
            System.out.println(edades[i]);
        }

        int laCuartaEdad = edades[3];
        System.out.println("La cuarta persona tiene " + laCuartaEdad + " años");

    }

}
