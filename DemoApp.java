

public class DemoApp {

    public static void main(String[] args) {

        boolean shouldRun = true;
        int counter = 0;

        while (shouldRun){    //== true braucht man nicht weil er immer auf true abfrägt
            System.out.println("Die Schleife läuft");
            counter++;

            if (counter == 10_000) {
                //shouldRun = false;
                break; //nach break wird die Schleife sofort abgebrochen und alles danach ignoriert
                //return; //beendet die Methode; wenn Methode void dann braucht man keinen return Wert deshalb abbruch
                //continue; // Bricht den aktuellen Schleifendurchlauf ab und startet die Schleife erneut
            }
            System.out.println("after break");
        }
        System.out.println("after loop");
    }
}
