public class TwoDimArrayDemoApp {
    public static void main(String[] args) {

        int x = 5;
        int y = 3;

        int[] oneDim = new int[x]; // 1-dim
        int[][] twodim = new int[x][y]; // 2-dim --> zuerst Spalte dann Zeile!!!!!!

        twodim[0][0] = 1;
        twodim[0][1] = 7;
        twodim[3][2] = 9;

        for (int dimX = 0; dimX < twodim.length ; dimX++) {
            System.out.print(twodim[dimX][0] + " | ");
        }
        System.out.println();

        for (int dimX = 0; dimX < twodim.length ; dimX++) {
            System.out.print(twodim[dimX][1] + " | ");
        }
        System.out.println();

        for (int dimX = 0; dimX < twodim.length ; dimX++) {
            System.out.print(twodim[dimX][2] + " | ");
        }
        System.out.println();
        System.out.println();
        System.out.println();

        for (int dimY = 0; dimY < twodim[dimY].length; dimY++) {
            for (int dimX = 0; dimX < twodim.length ; dimX++) {
                System.out.print(twodim[dimX][dimY] + " | ");
            }
            System.out.println();
        }

    }
}
