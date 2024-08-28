import java.util.HashMap;

public class day13n {
    public static void main(String[] args) {
        HashMap<String, Integer> a = new HashMap<>();
        String list[] = { "Geeks", "For", "For", "Geeks" };
        for (int i = 0; i < list.length; i++) {
            a.put(list[i], a.getOrDefault(list[i], 0) + 1);
        }
        int ans = 0;
        for (int i = 0; i < list.length; i++) {
            if (a.get(list[i]) == 2) {
                ans++;
                a.put(list[i], 0);
            }
        }
        System.out.println(ans);
    }
}
// What is time complexity of Heap Sort ..
// options
// 1: A O(nlogn) [correct answer is 1]
// 2: B O(n)
// 3: C O(logn)
// 4: D O(n*n)

// Which data structure does the heap sort implements.
// options
// 1: A Stack
// 2: B ArrayDequeue
// 3: C Priority Queue [correct answer is 3]
// 4: D LinkedList

// While I am trying to solve a sorting question I want to use a algorithm which
// have consistent performance throughout which algorithm should I pick?
// options
