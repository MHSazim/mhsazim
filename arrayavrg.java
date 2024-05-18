import java.util.Scanner;

public class arrayavrg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[5];
        double sum = 0;
input.close();//uses the missing few data 
        System.out.println("Please enter 5 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        System.out.println("The sum is: " + sum);
        double avg = sum / 5;
        System.out.println("The average is: " + avg);
    }
}
