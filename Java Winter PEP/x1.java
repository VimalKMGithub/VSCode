import java.util.HashSet;
import java.util.Set;

public class x1 {
    public static void main(String[] args) {
        int[] A = { 1, 5, 10, 20, 40, 80 };
        int[] B = { 6, 7, 20, 80, 100 };
        int[] C = { 3, 4, 15, 20, 30, 70, 80, 120 };
        Set<Integer> setA = new HashSet<>();
        for (int a : A) {
            setA.add(a);
        }
        Set<Integer> setB = new HashSet<>();
        for (int b : B) {
            setB.add(b);
        }
        Set<Integer> setC = new HashSet<>();
        for (int c : C) {
            setC.add(c);
        }
        setA.retainAll(setB);
        setA.retainAll(setC);
        System.out.println(setA);
    }
}
