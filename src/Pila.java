public class Pila {

    private static final int MAX = 10;
    private static int[] pila = new int[MAX];
    private static int Testa = MAX;

    public static void svuotaPila() {
        Testa = MAX;
        System.out.println("\nLa pila è stata svuotata.");
    }

    public static void pop() {
        if (Testa == MAX) {
            System.out.println("\nLa pila è vuota");
        } else {
            System.out.println("\nL'elemento estratto: "+pila[Testa]);
            Testa++;
        }
    }

    public static void push(int elemento) {
        if (Testa == 0) {
            System.out.println("\nLa pila è piena");
        } else {
            Testa--;
            pila[Testa] = elemento;
        }
    }

    public static void scriviPila() {
        System.out.println("\nTesta Pila");
        for (int i=Testa; i<MAX; i++) {
            System.out.println(pila[i]);
        }
        System.out.println("Base Pila");
    }

}
