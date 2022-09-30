public class ForDemo {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++){ //Es können auch alle Parameter leer sein z.B. for(;;) --> Endlosschleife
            if (i % 2 == 0){
                System.out.println("gerade zahl:" + i);
            }
        }
    }
}
