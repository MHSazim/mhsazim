import java.util.Scanner;
public class SSCBoardPercentageCalculator {
    public static void main(String[] args) {
// float x[6];

// x[0]=a1;
// x[1]=a1;
// x[2]=a1;
// x[3]=a1;
// x[4]=a1;
// x[5]=a1; 
    

Scanner sc = new Scanner(System.in);


       //if( scanner.nextFloat() < 100)
        System.out.println("Enter marks(out of 100):");
       // if (A1,A2,A3,A4,A5,A5,A6 < 100);
       // if( scanner.nextFloat() < 100)
        System.out.print("given number 1: ");
        float A1 = scanner.nextFloat();
       // if( scanner.nextFloat() < 100)
        System.out.print("given number 2: ");
        float A2 = scanner.nextFloat();
        // if( scanner.nextFloat() < 100)
        System.out.print("given number 3: ");
        float A3 = scanner.nextFloat();
        // if( scanner.nextFloat() < 100)
        System.out.print("given number 4: ");
        float A4 = scanner.nextFloat();
        // if( scanner.nextFloat() < 100)
        System.out.print("given number 5: ");
        float A5 = scanner.nextFloat();
        // if( scanner.nextFloat() < 100)
        System.out.print("given number 6: ");
        float A6 = scanner.nextFloat();
        // float Scanner = sc.nextFloat();
       
        float n=5;
        float totalMarks = (A1 + A2 + A3 + A4 + A5 + A6);
        double percentage = (double) totalMarks / n;
        // floatpercentage = (float) Math.round((double) totalMarks / 5);
        System.out.println("Total marks obtained: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        scanner.close( );
    }
}