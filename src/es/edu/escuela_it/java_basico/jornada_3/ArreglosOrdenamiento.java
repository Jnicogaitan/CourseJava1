package es.edu.escuela_it.java_basico.jornada_3;

public class ArreglosOrdenamiento {

    public static void main(String[] args) {

        //se declara el array
        int[] edades = new int[9];

        //carga de datos
        edades[0] = 96;
        edades[1] = 10;
        edades[2] = 852;
        edades[3] = 6;
        edades[4] = 36;
        edades[5] = 85;
        edades[6] = 73;
        edades[7] = 120;
        edades[8] = 120;

        for (int i = 0; i < edades.length; i++) {

            for (int j = 0; j < edades.length; j++) {

                if (edades[i] < edades[j]) {

                    //intercambio >
                    int aux = edades[i];
                    edades[i] = edades[j];
                    edades[j] = aux;
                }
            }
        }

        //Array.sort(edades);

        for (int edad : edades) {
            System.out.println("Edad: " + edad);
        }

    }
}
