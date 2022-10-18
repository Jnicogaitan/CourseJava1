package es.edu.escuela_it.java_basico.jornada_2;

import java.util.Scanner;

public class EstructuraIf {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su edad: ");

        int edad = sc.nextInt();

        //cmd + shift + f

        if (edad > 17){
            System.out.println("Bienvenido a la disco!!! ");
        }

        else if (edad >= 15 && edad <= 17) {
            System.out.println("Bienvenido a la matine!!! ");
        }

        else if (edad >= 12 && edad <= 14) {
            System.out.println("A la casa a dormir ");
        }

        else {
            System.out.println("Desafortunadamente usted no puede ingresar ");
        }

        sc.close();

    }
}
