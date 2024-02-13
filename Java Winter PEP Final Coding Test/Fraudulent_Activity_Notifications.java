import java.util.*;

class Result {

    public static int activityNotifications(List<Integer> expenditure, int d) {
        int notifications = 0;
        int[] trailingExpenditures = new int[201];
        int medianIndex1 = (d - 1) / 2;
        int medianIndex2 = d / 2;

        for (int i = 0; i < d; i++) {
            trailingExpenditures[expenditure.get(i)]++;
        }

        for (int i = d; i < expenditure.size(); i++) {
            double median = findMedian(trailingExpenditures, medianIndex1, medianIndex2);
            if (expenditure.get(i) >= 2 * median) {
                notifications++;
            }
            trailingExpenditures[expenditure.get(i - d)]--;
            trailingExpenditures[expenditure.get(i)]++;
        }

        return notifications;
    }

    private static double findMedian(int[] trailingExpenditures, int medianIndex1, int medianIndex2) {
        double median1 = 0, median2 = 0;
        int count = 0;
        for (int i = 0; i < trailingExpenditures.length; i++) {
            count += trailingExpenditures[i];
            if (median1 == 0 && count > medianIndex1) {
                median1 = i;
            }
            if (count > medianIndex2) {
                median2 = i;
                break;
            }
        }
        return (median1 + median2) / 2.0;
    }
}

public class Fraudulent_Activity_Notifications {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int d = scanner.nextInt();

        List<Integer> expenditure = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            expenditure.add(scanner.nextInt());
        }

        int result = Result.activityNotifications(expenditure, d);
        System.out.println(result);

        scanner.close();
    }
}