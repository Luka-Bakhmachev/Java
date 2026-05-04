package sistemadereservas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Allotjament> llista = new ArrayList<>();

        // Sample data
        llista.add(new Habitacio("H1", 2, 2));
        llista.add(new Apartament("A1", 4, 2, true));
        llista.add(new CasaRural("C1", 6, true, true));

        int op;

        do {
            System.out.println("\n1.Mostrar  2.Reservar  3.Alliberar  4.Cercar  5.Sortir");
            op = sc.nextInt();
            sc.nextLine();

            if (op == 1) {
                for (Allotjament a : llista)
                    if (a.isDisponible())
                        System.out.println(a.mostrarInformacio());
            }

            else if (op == 2) {
                System.out.print("Nom: ");
                String nom = sc.nextLine();

                for (Allotjament a : llista)
                    if (a.getNom().equalsIgnoreCase(nom))
                        System.out.println(a.reservar() ? "OK" : "No disponible");
            }

            else if (op == 3) {
                System.out.print("Nom: ");
                String nom = sc.nextLine();

                for (Allotjament a : llista)
                    if (a.getNom().equalsIgnoreCase(nom)) {
                        a.alliberar();
                        System.out.println("OK");
                    }
            }

            else if (op == 4) {
                System.out.print("Preu max: ");
                double max = sc.nextDouble();

                for (Allotjament a : llista)
                    if (a.isDisponible() && a.calcularPreuPerNit() <= max)
                        System.out.println(a.mostrarInformacio());
            }

        } while (op != 5);

        sc.close();
    }
}