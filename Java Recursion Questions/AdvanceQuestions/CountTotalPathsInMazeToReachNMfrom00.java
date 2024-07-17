package AdvanceQuestions;

public class CountTotalPathsInMazeToReachNMfrom00 {
    public int countTotalPathsInMaze(int totalRows, int totalCols) {
        return countTotalPathsInMaze(0, 0, totalRows, totalCols);
    }

    private int countTotalPathsInMaze(int ithRow, int jthCol, int totalRows, int totalCols) {
        if (ithRow == totalRows - 1 || jthCol == totalCols - 1) {
            return 1;
        }
        return countTotalPathsInMaze(ithRow + 1, jthCol, totalRows, totalCols)
                + countTotalPathsInMaze(ithRow, jthCol + 1, totalRows, totalCols);
    }

    public static void main(String[] args) {
        CountTotalPathsInMazeToReachNMfrom00 sol = new CountTotalPathsInMazeToReachNMfrom00();
        System.out.println(sol.countTotalPathsInMaze(3, 2));
    }
}
