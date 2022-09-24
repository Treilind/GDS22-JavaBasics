public class Calculator {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int erg;
        String rechner = "UCL";
        String rechnername;

        erg = a + b;
        rechnername = rechner + erg;

        //STRG + ALT + v --> Variable erzeugen
        int erg2 = a + b;

        //soutv --> erspart Tipparbeit; muss die Variable auswählen
        System.out.println("erg2 = " + erg2);

        System.out.println("Mein Name ist: " + rechnername);
    }
}
