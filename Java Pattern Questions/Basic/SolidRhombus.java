package Basic;

public class SolidRhombus {
    public void print(int side) {
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= side - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= side; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int side = 4;
        SolidRhombus sol = new SolidRhombus();
        sol.print(side);
    }
}