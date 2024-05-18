import java.util.*;
/**
 * condition
 */
public class condition {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter age :");
        int age = sc.nextInt();
        sc.close();
        if(age>=18){
            System.out.println("Adult");
        }
        else if(age>=13){
            System.out.println("teen ager");
        }else{
            System.out.println("kid");
        }
    }
    
    
}

   
/*import java.util.*;

public class condition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter your age: ");
        
        // Check if the next input is an integer
        if (scanner.hasNextInt()) {
            int age = scanner.nextInt();
            
            if (age > 18) {
                System.out.println("Adult");
            } else {
                System.out.println("Not adult");
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }
        
        // Close the scanner to release resources
        scanner.close();
    }
}*/
