public class WinterreifenpflichtDemo {

    public static void main(String[] args) {
        int temperatur = 12;
        boolean rutschigeFahrbahn = true;

        if (isWinterreifenPflicht(temperatur,rutschigeFahrbahn) == true){
            System.out.println("Bitte Winterreifen verwenden");
        }
        else {
            System.out.println("Winterreifen sind nicht erforderlich");
        }

    }

    public static boolean isWinterreifenPflicht (int temperatur, boolean rutschigeFahrbahn) {
        boolean erfordernis = false;

        if (temperatur < 10 && rutschigeFahrbahn == true || temperatur < 4) {
            erfordernis = true;
        }
        return erfordernis;
    }
}
