import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        String[] array = new String[] {"Hallo", "mein", "Name", "ist", "Thorsten"};
        String[] arrayToReverse = reverseArray(array);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayToReverse));



    }

    public static String[] reverseArray (String[] arrayToReverse){
        String[] array = new String[arrayToReverse.length];


        for (int i = arrayToReverse.length; i > 0; i--) {
            array[(i - arrayToReverse.length)*-1] = arrayToReverse[i - 1];
        }

        return array;

    }
}
