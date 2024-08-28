package Basic;

public class FloydsTriangle {
    public void print(int height) {
        int iterator = 1;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(iterator + " ");
                iterator++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int height = 4;
        FloydsTriangle sol = new FloydsTriangle();
        sol.print(height);
    }
}