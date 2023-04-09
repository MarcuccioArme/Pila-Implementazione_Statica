import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int scelta, elemento;

        do {

            System.out.println("\nMENU:");
            System.out.println("1) Svuota Pila");
            System.out.println("2) Estrai un dato (pop)");
            System.out.println("3) Aggiungi un dato (push)");
            System.out.println("4) Scrivi pila");
            System.out.println("0) Esci");

            System.out.print("\nInserisci la scelta: ");
            scelta = input.nextInt();

            switch (scelta) {

                case 1: Pila.svuotaPila();
                    break;

                case 2: Pila.pop();
                    break;

                case 3:
                    System.out.print("\nInserisci l'elemento: ");
                    elemento = input.nextInt();
                    Pila.push(elemento);
                    break;

                case 4: Pila.scriviPila();
                    break;

                case 0: System.out.println("\nCiao!");
                    break;

                default: System.out.println("\nScelta non valida.");
                    break;

            }

        } while (scelta != 0);

    }
}// (:P)