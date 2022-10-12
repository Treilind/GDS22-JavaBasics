public class UmsatzDemo {

    public static void main(String[] args) {
        int yeymehrumsatz = 0;
        double[] umseatze2021 = new double[12];
        umseatze2021[0] = 22000;
        umseatze2021[1] = 32000; //1
        umseatze2021[2] = 33000;
        umseatze2021[3] = 24000;
        umseatze2021[4] = 30000;//2
        umseatze2021[5] = 32000;
        umseatze2021[6] = 7000;
        umseatze2021[7] = 22000;//3
        umseatze2021[8] = 20000;
        umseatze2021[9] = 50000;//4
        umseatze2021[10] = 30000;
        umseatze2021[11] = 40000;//5

        yeymehrumsatz = getUmsatzsteigerungGT10(umseatze2021);

        System.out.println("yeymehrumsatz = " + yeymehrumsatz);
    }

    public static int getUmsatzsteigerungGT10(double[] umsaetze){
        int counter = 0;

        for (int i = 0; i < umsaetze.length; i++) {
            if(i > 0 && umsaetze[i]>=umsaetze[i-1]*1.1){
                counter++;
            }
        }
        return counter;

    }
}
