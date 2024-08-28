package Basic;

public class HollowRhombus {
    public void print(int side) {
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= side - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= side; j++) {
                if (i == 1 || j == 1 || i == side || j == side) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int side = 4;
        HollowRhombus sol = new HollowRhombus();
        sol.print(side);
    }
}