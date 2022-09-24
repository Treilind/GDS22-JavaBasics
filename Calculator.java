public class Calculator {
    public static void main(String[] args) {
        int a = 32;
        int b = 10;

        System.out.println(add(a, b));
        System.out.println(sub(a ,b));
        System.out.println(multipli(a , b));
        System.out.println(dividi(a, b));
        System.out.println(restwert(a ,b));

    }

    public static int add (int a, int b) {
        int result;
        result = a + b;

        return result;
    }

    public static int sub (int a, int b) {
        int result;
        result = a - b;

        return result;
    }

    public static int multipli (int a, int b) {
        int result;
        result = a * b;

        return result;
    }

    public static double dividi (int a, int b) {
        double result;
        if (b != 0) {
            result = a / (1.0 * b);

            return result;
        }
        else {
            return 0;
        }

    }

    public static int restwert (int a, int b) {
        int result;
        result = a % b;

        return result;
    }
}
