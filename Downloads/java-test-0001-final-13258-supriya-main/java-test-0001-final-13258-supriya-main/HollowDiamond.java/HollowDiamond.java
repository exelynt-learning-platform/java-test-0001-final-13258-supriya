
public class HollowDiamond {

    public static void main(String[] args) {
        // i/p must be 5 to match the required pattern
        final int n = 5;

        // Upper part of Diamond
        for (int i = 1; i <= n; i++) {
            printRow(i, n);
        }

        // Lower part of Diamond
        for (int i = n - 1; i >= 1; i--) {
            printRow(i, n);
        }

    }

    private static void printRow(int i, int n) {

        for (int j = 1; j <= n - i; j++) {
            System.out.print(" ");
        }

        System.out.print("*");

        // print inner spaces of diamond
        if (i > 1) {
            for (int j = 1; j <= ((2 * i) - 3); j++) {
                System.out.print(" ");
            }

            System.out.print("*");
        }

        // Next row of diamond
        System.out.println();
    }

}
