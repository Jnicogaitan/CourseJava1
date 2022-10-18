package es.edu.escuela_it.java_basico.jornada_2;

import java.util.Scanner;

public class ImputUsuario {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Hola, escribe aqui tu nombre: ");

        String nombreUsuario = sc.nextLine();

        System.out.println("Ahora, ingrese su edad: ");

        int edadUsuario = sc.nextInt();

        boolean mayorDeEdad = edadUsuario > 17;

        sc.close();

        System.out.print("Hola "+nombreUsuario+", tu tienes "+ edadUsuario+ " años");

        if(edadUsuario > 17) {

            System.out.print(", tienes la edad sufuciente para entrar a la disco... Bienvenido!");
        }
            else{

            System.out.print(", desafortunadamente no tienes la edad sufiiciente para entrar a la disco");

        }

    }
}
