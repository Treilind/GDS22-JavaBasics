public class ArethmetischeOperationen {

    /**
     * Ausführung aller arithmetischer Operationen und Ausgabe
     *
     * @param args
     */
    public static void main(String[] args) {

        //deklarieren und initialisieren von Variablen
        int a = 32;
        int b = 10;

        //erstes + ist die Verknüpfung zweites ist dann die Operation; Klammern sind ganz wichtig!
        System.out.println("Addieren: " + (a + b));
        System.out.println("Subtrahieren: " + (a - b));
        System.out.println("Multiplizieren: " + (a * b));

        //Typenumwandlung von int auf double
        double div = (double) a / (double) b;
        //oder
        double divid = a / (1.0 * b);
        System.out.println("Dividieren: " + div);
        System.out.println("Dividieren: " + divid);
        System.out.println("Modulo: " + (a % b));
    }
}
