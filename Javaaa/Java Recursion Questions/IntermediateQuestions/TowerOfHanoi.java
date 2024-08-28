package IntermediateQuestions;

public class TowerOfHanoi {
    public void towerOfHanoi(int n, String src, String hel, String des) {
        if (n == 1) {
            System.out.println("Move disk '" + n + "' from '" + src + "' to '" + des + "'");
            return;
        }
        towerOfHanoi(n - 1, src, des, hel);
        System.out.println("Move disk '" + n + "' from '" + src + "' to '" + des + "'");
        towerOfHanoi(n - 1, hel, src, des);
    }

    public static void main(String[] args) {
        TowerOfHanoi toh = new TowerOfHanoi();
        toh.towerOfHanoi(3, "Src", "Hel", "Des");
    }
}