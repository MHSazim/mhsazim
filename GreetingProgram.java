import java.util.Scanner;

public class GreetingProgram{
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        String name = " sazim";
        // Output
        System.out.println("Hello "+ name);
        

        // Close the scanner to release resources (optional)
        scanner.close( );
    
    }
}

