package es.edu.escuela_it.java_basico.jornada_2;

import java.util.Scanner;

public class EstructuraSwitch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al sistema");
        System.out.println("[1] ABM Usuarios");
        System.out.println("[2] ABM Cliente");
        System.out.println("[3] ABM Operaciones");
        System.out.println("[4] Salir");
        System.out.println("________________");
        System.out.println("Ingrese una opcion correcta");

        int option = sc.nextInt();

        switch (option) {

            case 1:
                System.out.println("Bienvenido a ABM Usuarios");
                break;

            case 2:
                System.out.println("Bienvenido a ABM Clientes");
                break;

            case 3:
                System.out.println("Bienvenido a ABM Operaciones");
                break;

            case 4:
                System.out.println("Saliendo del sistema...");
                break;

            default:
                System.out.println("Ingrese una opción correcta");
                break;
        }


        sc.close();

    }
}
