package Q05ItineraryFromTickets;

import java.util.HashMap;

public class Solution {
    private String start(HashMap<String, String> tickets) {
        String start = null;
        for (String key : tickets.keySet()) {
            if (!tickets.containsValue(key)) {
                start = key;
                break;
            }
        }
        return start;
    }

    public void printItinerary(HashMap<String, String> tickets) {
        String start = start(tickets);
        if (start == null) {
            System.out.println("Invalid Input");
            return;
        }
        while (tickets.containsKey(start)) {
            System.out.print(start + " -> ");
            start = tickets.get(start);
        }
        System.out.println(start);
    }

    public String getItinerary(HashMap<String, String> tickets) {
        String start = start(tickets);
        if (start == null) {
            return "Invalid Input";
        }
        StringBuilder sb = new StringBuilder();
        while (tickets.containsKey(start)) {
            sb.append(start).append(" -> ");
            start = tickets.get(start);
        }
        sb.append(start);
        return sb.toString();
    }

    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bangalore");
        tickets.put("Bombay", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");
        Solution sol = new Solution();
        sol.printItinerary(tickets);
        System.out.println(sol.getItinerary(tickets));
    }
}