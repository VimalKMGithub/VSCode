import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class day17n {
    public static void main(String[] args) {
        // List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // long evenCount = countEvenNumbers(numbers);
        // System.out.println("Count of even numbers: " + evenCount);

        // List<String> fruits = Arrays.asList("Apple", "Guava", "Banana", "Papaya",
        // "Orange");
        // List<String> sortedFruits = sortStringsAlphabetically(fruits);
        // System.out.println("Sorted Fruits: " + sortedFruits);

        int[] arr = { 2, 5, 6, 8 };
        long product = Arrays.stream(arr)
                .asLongStream()
                .reduce(1, (a, b) -> a * b);
        System.out.println("Product of elements: " + product);
    }

    public static long countEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(num -> num % 2 == 0)
                .count();
    }

    public static List<String> sortStringsAlphabetically(List<String> strings) {
        return strings.stream()
                .sorted()
                .collect(Collectors.toList());
    }

}
// Which of the following is not a terminal operation in the Stream API?
// options
// 1: A forEach
// 2: B map [correct answer is 2]
// 3: C reduce
// 4: D collect

// Which class is used to create a thread in Java?
// options
// 1: thread [correct answer is 1]
// 2: runnable
// 3: Process
// 4: Executor

// What is the purpose of the wait() method in Java threads?
// options
// 1: to terminate the thread
// 2: To notify other threads to resume execution.
// 3: To release the lock held by the thread.
// 4: To pause the execution of a thread [correct answer is 4]