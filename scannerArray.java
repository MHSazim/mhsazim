import java.util.Scanner;

public class scannerArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks(out of 100):");


        float[] marks = new float[6];
        float totalMarks = 0;

        for (int i = 0; i < 6; i++) {
            
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            float mark = scanner.nextFloat();
            
            // Validate input to ensure marks are within the range of 0 to 100
        while (mark < 0 || mark > 100) {
                
            System.out.println("Marks should be between 0 and 100. Please enter again:");
            mark = scanner.nextFloat();
            }

            marks[i] = mark;
            totalMarks += mark;
        }

        float n = 6;// Total number of subjects
        double percentage = (totalMarks / n);// Calculate percentage

        System.out.println("Total marks obtained: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
          

        scanner.close();
    }
}

