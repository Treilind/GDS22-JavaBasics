public class NotenDemo {


    public static void main(String[] args) {
        int Testpunkte = 49;

        System.out.println(getNotentext(Testpunkte));
    }

    public static String getNotentext (int punkte) {
        String result = "Nicht wertbar";
        if (punkte >= 90) {
            result = "Sehr gut";
        } else if (punkte >= 78 && punkte <= 89) {
            result = "Gut";
        } else if (punkte >= 65 && punkte <= 77) {
            result = "Befriedigend";
        } else if (punkte >= 51 && punkte <= 64) {
            result = "Genügend";
        } else if (punkte <= 50) {
            result = "Ungenügend";
        }
        return result;
    }
}
