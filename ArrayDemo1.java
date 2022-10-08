import java.util.Arrays;

public class ArrayDemo1 {
    public static void main(String[] args) {

        int[] array1 = new int[3]; //leeren Array nur die Länge definiert
        array1[0] = 3; // erstes Element initialisiert ...
        array1[1] = 4;
        array1[2] = 5;


        int[] array2 = {7,1,3}; //Array sofort initialisiert
        int addition;
        int multiplikation;
        int i = 0;

        while (i < array1.length){
            addition = array1[i] + array2[i];
            System.out.println("addition = " + addition);
            multiplikation = array1[i] * array2[i];
            System.out.println("multiplikation = " + multiplikation);
            System.out.println();
            i++;
        }

        int sum = 0;
        for (int j = 0; j < array1.length; j++) { //fori --> Tab
            sum = sum + array1[j];
        }
        System.out.println("sum = " + sum);
        System.out.println("Mittelwert = " + sum / (array1.length * 1.0));
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }

}
