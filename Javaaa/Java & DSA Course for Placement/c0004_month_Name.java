import java.util.Scanner;

public class c0004_month_Name {
    public static void main(String[] args) {
        System.out.print("Enter an integer ( 1 - 12 ) : ");
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        sc.close();
        if (r1 >= 1 && r1 <= 12) {
            switch (r1) {
                case 1:
                    System.out.println("Month : January");
                    break;
                case 2:
                    System.out.println("Month : February");
                    break;
                case 3:
                    System.out.println("Month : March");
                    break;
                case 4:
                    System.out.println("Month : April");
                    break;
                case 5:
                    System.out.println("Month : May");
                    break;
                case 6:
                    System.out.println("Month : June");
                    break;
                case 7:
                    System.out.println("Month : July");
                    break;
                case 8:
                    System.out.println("Month : August");
                    break;
                case 9:
                    System.out.println("Month : September");
                    break;
                case 10:
                    System.out.println("Month : October");
                    break;
                case 11:
                    System.out.println("Month : November");
                    break;
                case 12:
                    System.out.println("Month : December");
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        } else {
            System.out.println("There are only 12 Months in a calender");
        }
    }
}
