public class moja {
    public static void main(String[] args) {
        for (int i = 1; i <= 11; i++){//i is counter.  // Start from 1 instead of 0
            System.out.print(i);
            if (i < 11) { // Add a condition to avoid printing comma after the last number
                System.out.print(",");
            }
            if (i>10){
            System.out.println("."); // Print period after each number
        }
    }
    }
}