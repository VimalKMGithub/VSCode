import java.util.*;

class outer {
    private int a = 10;

    // inner class
    class inner {
        void pr() {
            System.out.println(a);
        }
        // can access any of outer class private methods & data members
        // helps in readability & maintainability of code because of logical grouping of
        // classes & interfaces in one place
        // requires less code to write
    }
}

public class day5 {

    public static void main(String[] args) {
        // String greet = "Hello how are you";
        // System.out.println(greet.length());
        // System.out.println(greet.toLowerCase());
        // System.out.println(greet.indexOf("how"));

        // String g1 = "Hello";
        // String g2 = " how are you";
        // System.out.println(g1 + g2);
        // System.out.println(g1.concat(g2));

        // String greet = "10";
        // int y = 20;
        // String z = greet + y;
        // System.out.println(z);

        // String line = "\t we \n \"are\" here";
        // System.out.println(line);

        // Iterable -> collections -> List, Queue, Set
        // List <String> l1 = new ArrayList<>();
        // l1.add("Japan");
        // l1.add("tokyo");
        // Iterator i = l1.iterator();
        // while(i.hasNext()){
        // System.out.println(i.next());
        // }

        // LinkedList <String> ll = new LinkedList<>();
        // ll.add("Vijay");
        // ll.add("Rahul");
        // ll.add("Kiran");
        // Iterator i = ll.iterator();
        // while(i.hasNext()){
        // System.out.println(i.next());
        // }

        // Stack<String> stack = new Stack<>();
        // stack.push("Ayush");
        // stack.push("Vijay");
        // stack.push("Yogi");
        // Iterator i = stack.iterator();
        // while(i.hasNext()){
        // System.out.println(i.next());
        // }
        // System.out.println();
        // stack.pop();
        // i = stack.iterator();
        // while(i.hasNext()){
        // System.out.println(i.next());
        // }

        // Queue <String> q1 = new PriorityQueue<>();
        // q1.add("Amit");
        // q1.add("Rahul");
        // q1.add("Kunal");
        // System.out.println("head : "+ q1.element());
        // System.out.println("head : "+ q1.peek());
        // Iterator i = q1.iterator();
        // while(i.hasNext()){
        // System.out.println(i.next());
        // }
        // q1.remove();
        // System.out.println();
        // i = q1.iterator();
        // while(i.hasNext()){
        // System.out.println(i.next());
        // }

        // Deque -> double-ended queue
        // Deque<String> dq = new ArrayDeque<>();
        // dq.add("Kunal");
        // dq.add("Shubham");
        // dq.add("Shekhar");
        // for (String str : dq) {
        // System.out.println(str);
        // }

        // String str = "Ayush";
        // System.out.println(str.contains("Ayu"));

        // Set<Integer> hs = new HashSet<>();
        // hs.add(1);
        // hs.add(2);
        // hs.add(3);
        // hs.add(4);
        // hs.add(null);
        // System.out.println(hs);
        // Iterator i = hs.iterator();
        // while(i.hasNext()){
        // System.out.println(i.next());
        // }

        // LinkedHashSet <Integer> lhs = new LinkedHashSet<>();
        // lhs.add(1);
        // lhs.add(2);
        // lhs.add(3);
        // lhs.add(4);
        // lhs.add(null);
        // System.out.println(lhs);

        // TreeSet<String> ts = new TreeSet<>();
        // ts.add("1");
        // ts.add("2");
        // ts.add("3");
        // ts.add("4");
        // Iterator i = ts.iterator();
        // while (i.hasNext()) {
        // System.out.println(i.next());
        // }
        // System.out.println(ts);

        // List <Integer> l1 = new ArrayList<>();
        // l1.add(2);
        // l1.add(3);
        // l1.add(4);
        // ListIterator i = l1.listIterator(l1.size());
        // while(i.hasPrevious()){
        // System.out.println(i.previous());
        // }

        // HashMap<Integer, String> hm = new HashMap<>();
        // hm.put(1, "First");
        // hm.put(2, "second");
        // hm.put(3, "second");
        // System.out.println(hm);
        // for (Map.Entry m : hm.entrySet()) {
        // System.out.println(m.getKey() + " " + m.getValue());
        // }
    }
}