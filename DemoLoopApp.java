public class DemoLoopApp {

    public static void main(String[] args) {
        int counter = 1;
        int zahl = 1;
        int zahlvorgaenger = 0;
        int ausgabe;



        while (counter <= 10 && zahl <= 100_000) {
            ausgabe = zahl + zahlvorgaenger;
            if (ausgabe % 351 == 0){
                System.out.println("ausgabe = " + ausgabe);
                System.out.println(counter);
                counter++;
            }
            zahl++;
            zahlvorgaenger++;
        }

    }
}
