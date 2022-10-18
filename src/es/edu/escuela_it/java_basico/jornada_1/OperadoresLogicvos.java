package es.edu.escuela_it.java_basico.jornada_1;

public class OperadoresLogicvos {

    public static void main(String[] args) {

        boolean tengoDinero = true;

        boolean juegaMiEquipoFav = true;

        boolean esLindoDia = false;

        boolean asistireAOartido = tengoDinero && juegaMiEquipoFav; // and

        boolean asistireAOartido1 = tengoDinero || juegaMiEquipoFav; // or

        boolean asistireAOartido2 = tengoDinero || juegaMiEquipoFav && esLindoDia; // primerom resuelve los and, despues los or.


        System.out.println(asistireAOartido);

        System.out.println(asistireAOartido1);

        System.out.println(asistireAOartido2);
        }

}
