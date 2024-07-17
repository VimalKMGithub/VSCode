package AdvanceQuestions;

public class WaysToPlaceTilesOf1xMinFloorOfNxM {
    public int placeTilesOnFloor(int length, int breadth) {
        if (length < breadth) {
            return 1;
        }
        if (length == breadth) {
            return 2;
        }
        return placeTilesOnFloor(length - breadth, breadth) + placeTilesOnFloor(length - 1, breadth);
    }

    public static void main(String[] args) {
        WaysToPlaceTilesOf1xMinFloorOfNxM sol = new WaysToPlaceTilesOf1xMinFloorOfNxM();
        System.out.println(sol.placeTilesOnFloor(3, 2));
    }
}