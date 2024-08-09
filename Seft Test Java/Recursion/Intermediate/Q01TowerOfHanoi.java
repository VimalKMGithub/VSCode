package Recursion.Intermediate;

public class Q01TowerOfHanoi {
    public void towerOfHanoi(int n, char source, char helper, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        towerOfHanoi(n - 1, source, destination, helper);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        towerOfHanoi(n - 1, helper, source, destination);
    }

    public static void main(String[] args) {
        Q01TowerOfHanoi obj = new Q01TowerOfHanoi();
        obj.towerOfHanoi(3, 'S', 'H', 'D');
    }
}
