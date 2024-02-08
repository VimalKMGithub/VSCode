import java.util.Scanner;

public class version1 {
    private static node start = null;

    static void li(int val) {
        node nd = new node();
        nd.data = val;
        nd.link = null;
        if (start == null) {
            start = nd;
        } else {
            node l = start;
            while (l.link != null) {
                l = l.link;
            }
            l.link = nd;
        }
    }

    static boolean asc(int ar[]) {
        for (int i = 0; i < ar.length - 1; i++) {
            if (ar[i] > ar[i + 1]) {
                return false;
            }
        }
        return true;
    }

    static boolean des(int ar[]) {
        for (int i = 0; i < ar.length - 1; i++) {
            if (ar[i] < ar[i + 1]) {
                return false;
            }
        }
        return true;
    }

    static void liar(int ar[], int ch) {
        boolean nf = true;
        System.out.println();
        System.out.println();
        for (int i = 0; i < ar.length; i++) {
            System.out.println("Pass " + (i + 1));
            System.out.println("Comparing '" + (i) + "' index element of array with '" + ch + "'");
            if (ar[i] == ch) {
                System.out.println("Since '" + ar[i] + "' == '" + ch + "' element found");
                nf = false;
                break;
            } else {
                System.out.println("Since '" + ar[i] + "' != '" + ch + "' next pass");
            }
            System.out.println();
            System.out.println();
        }
        if (nf) {
            System.out.println("'" + ch + "' not found in array");
        }
    }

    static void lill(int ch) {
        boolean nf = true;
        System.out.println();
        System.out.println();
        node p = start;
        int i = 1;
        while (p != null) {
            System.out.println("Pass " + (i));
            System.out.println("Comparing '" + (i++) + "' element of linkedlist with '" + ch + "'");
            if (p.data == ch) {
                System.out.println("Since '" + p.data + "' == '" + ch + "' element found");
                nf = false;
                break;
            } else {
                System.out.println("Since '" + p.data + "' != '" + ch + "' next pass");
            }
            p = p.link;
            System.out.println();
            System.out.println();
        }
        if (nf) {
            System.out.println("'" + ch + "' not found in linkedlist");
        }
    }

    static void bina(int ar[], int ch) {
        boolean nf = true;
        System.out.println();
        System.out.println();
        int s = 0, e = ar.length - 1;
        int i = 1;
        while (s <= e) {
            System.out.println("Pass " + (i++));
            int m = (s + e) / 2;
            System.out.println("Comparing mid element '" + ar[m] + "' with '" + ch + "'");
            if (ar[m] == ch) {
                System.out.println("Since '" + ar[m] + "' == '" + ch + "' Element found");
                nf = false;
                break;
            }
            if (ar[m] < ch) {
                System.out.println("Since '" + ar[m] + "' < '" + ch + "' ignore left half array");
                s = m + 1;
            } else {
                System.out.println("Since '" + ar[m] + "' > '" + ch + "' ignore right half array");
                e = m - 1;
            }
            System.out.println();
            System.out.println();
        }
        if (nf) {
            System.out.println("'" + ch + "' not found in array");
        }
    }

    static void mbin(int ar[], int ch) {
        boolean nf = true;
        System.out.println();
        System.out.println();
        int s = 0, e = ar.length - 1;
        int i = 1;
        while (s <= e) {
            System.out.println("Pass " + (i++));
            int m = (s + e) / 2;
            System.out.println("Comparing mid element '" + ar[m] + "' with '" + ch + "'");
            if (ar[m] == ch) {
                System.out.println("Since '" + ar[m] + "' == '" + ch + "' Element found");
                nf = false;
                break;
            }
            if (ar[m] > ch) {
                System.out.println("Since '" + ar[m] + "' > '" + ch + "' ignore left half array");
                s = m + 1;
            } else {
                System.out.println("Since '" + ar[m] + "' < '" + ch + "' ignore right half array");
                e = m - 1;
            }
            System.out.println();
            System.out.println();
        }
        if (nf) {
            System.out.println("'" + ch + "' not found in array");
        }
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        System.out.println("Welocome to Searching Algorithm Simulator");
        System.out.println(".....Press '1' for Array.....");
        System.out.println(".....Press '2' for LinkedList.....");
        System.out.println();
        System.out.println();
        System.out.print("Enter choice : ");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        System.out.println();
        System.out.println();
        switch (ch) {
            case 1:
                System.out.print("Enter number of elements of array : ");
                ch = sc.nextInt();
                int ar[] = new int[ch];
                System.out.println();
                System.out.println();
                System.out.println("Enter array elements");
                for (int i = 0; i < ar.length; i++) {
                    ar[i] = sc.nextInt();
                }
                System.out.println();
                System.out.println();
                if (asc(ar)) {
                    System.out.println(
                            "'Since array is in ascending order we recommend binary search, yet you are free to choose'");
                    System.out.println(".....Press '1' for Linear search.....");
                    System.out.println(".....Press '2' for Binary search.....");
                    System.out.println();
                    System.out.println();
                    System.out.print("Enter choice : ");
                    ch = sc.nextInt();
                    System.out.println();
                    System.out.println();
                    switch (ch) {
                        case 1:
                            System.out.print("Enter element you want to search : ");
                            ch = sc.nextInt();
                            liar(ar, ch);
                            break;
                        case 2:
                            System.out.print("Enter element you want to search : ");
                            ch = sc.nextInt();
                            bina(ar, ch);
                            break;
                        default:
                            System.out.println("Invalid Input");
                            break;
                    }
                } else if (des(ar)) {
                    System.out.println(
                            "'Since array is in descending order we recommend modified binary search, yet you are free to choose'");
                    System.out.println(".....Press '1' for Linear search.....");
                    System.out.println(".....Press '2' for modified Binary search.....");
                    System.out.println();
                    System.out.println();
                    System.out.print("Enter choice : ");
                    ch = sc.nextInt();
                    System.out.println();
                    System.out.println();
                    switch (ch) {
                        case 1:
                            System.out.print("Enter element you want to search : ");
                            ch = sc.nextInt();
                            liar(ar, ch);
                            break;
                        case 2:
                            System.out.print("Enter element you want to search : ");
                            ch = sc.nextInt();
                            mbin(ar, ch);
                            break;
                        default:
                            System.out.println("Invalid Input");
                            break;
                    }
                } else {
                    System.out.print("Enter element you want to search : ");
                    ch = sc.nextInt();
                    liar(ar, ch);
                }
                break;
            case 2:
                System.out.println("Enter integer elements & to stop Enter 's'");
                String st;
                while (true) {
                    st = sc.next();
                    if (st.equals("s")) {
                        break;
                    }
                    li(Integer.parseInt(st));
                }
                System.out.println();
                System.out.println();
                System.out.print("Enter element you want to search : ");
                ch = sc.nextInt();
                lill(ch);
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        sc.close();
        System.out.println();
        System.out.println();
    }
}

class node {
    int data;
    node link;
}