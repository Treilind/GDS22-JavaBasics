public class Tagesabschnitt {

    /**
     * Retourniere Tagesabschnitt abhängig von der Uhrzeit
     *
     * 6-9 (exkl.) --> Früh
     * 9-12 (exkl.) --> Vormittag
     * 12-16 (exkl.) --> Nachmittag
     * 16-20 (exkl.) --> Abend
     * 20-24 (exkl.) --> Nacht
     *
     * @param args
     */
    public static void main(String[] args) {
        int uhrzeit = 10;

        System.out.println(isTagesabschnitt(uhrzeit));
    }

    public static String isTagesabschnitt (int uhrzeit) {
        String uhrzeittext = "Keine Uhrzeit definiert";

        if (uhrzeit >= 6 && uhrzeit <9) {
            uhrzeittext = "Früh";
        } else if (uhrzeit >= 9 && uhrzeit <12) {
            uhrzeittext = "Vormittag";
        } else if (uhrzeit >= 12  && uhrzeit <16) {
            uhrzeittext = "Nachmittag";
        } else if (uhrzeit >= 16 && uhrzeit <20) {
            uhrzeittext = "Abend";
        } else if (uhrzeit >= 20 && uhrzeit <6) {
            uhrzeittext = "Nacht";
        }

        return uhrzeittext;
    }
}
