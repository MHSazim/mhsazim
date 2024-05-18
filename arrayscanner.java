import java.util.Scanner;

public class arrayscanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] number = new double[5];
        double sum = 0;

        System.out.println("Please enter 5 numbers: ");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            number[i] = input.nextDouble();
            sum += number[i];
        }

        System.out.println("Sum is: " + sum);

        // Close the Scanner to avoid the resource leak
        input.close();
    }
}
