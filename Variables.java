public class Variables {

    // /** und enter dann wird das javadoc automatisch gemacht
    /**
     * ich bin ein javadoc
     * @param args Parameter für den Programmaufruf
     */
    public static void main(String[] args) {
        //variablen dekleration
        String firstname;
        int x, y, z;

         //intitialisieren
        firstname = "Thorsten";
        x = 1;
        y = 2;
        z = 3;

        //Dekleration + Init
        char a = 'a';

        System.out.println(firstname);

        //variablen Wert tauschen
        firstname = "Luca";
        firstname = "Hallo";

        System.out.println(firstname);
    }
}
