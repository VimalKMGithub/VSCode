import java.io.File;

class directorymaker {
    public static void main(String[] args) {
        File myDir = new File("C:/Users/Vimal/Documents/FeedbackHub/zfol1/zfol2");
        if (myDir.mkdirs()) {
            System.out.println("Directory created successfully!");
        } else {
            System.out.println("Directory already exists or could not be created.");
        }
    }
}