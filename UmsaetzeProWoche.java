public class UmsaetzeProWoche {
    public static void main(String[] args) {

        double[][] umsaetze = new double[2][2];
        umsaetze[0][0] = 10;
        umsaetze[0][1] = 20;
        umsaetze[1][0] = 30;
        umsaetze[1][1] = 40;

        double[] ergebnis = calculateSumByWeek(umsaetze);

        for (int i = 0; i < ergebnis.length; i++) {
            System.out.println("Woche " + (i+1) + ":" + ergebnis[i]);
        }

    }

    public static double[] calculateSumByWeek(double[][] umsaetze) {
        double[] calculate = new double[umsaetze.length];

        for (int i = 0; i < umsaetze.length; i++) {
            for (int j = 0; j < umsaetze[i].length; j++) {
                if (j == 0){
                    calculate[i] = umsaetze[i][j];
                }
                else {
                    calculate[i] = calculate[i] + umsaetze[i][j];
                }

            }

        }
        return calculate;
    }
}
