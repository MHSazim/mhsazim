import java.util.Scanner;

public class nestedLoop {
    public static void main(String[] args) {
      Scanner Scanner = new Scanner(System.in);
        int i,j;
        
        for(i=1;i<=2;i++){//2 times
            System.out.println("outer loop start");}
          for(j=1;j<=3;j++)//3 times
        {
            System.out.println("**********hi");
          }
         int scanner= Scanner.nextInt(); 
          if (i<2){//2 times
System.out.println("SAZIM IS GOOD BOY");
          }
          else{
            System.out.println("SAZIM IS bad BOY");
        System.out.println("outer loop end");
        Scanner.close( );
          }
          
        }
}
// @Override
// public String toString() {
// return "nestedLoop []";
// }
// if (i<=3) when that is uses
// outer loop start
// **********hi
// **********hi
// **********hi
// 2
// SAZIM IS GOOD BOY   
// outer loop end
// outer loop start
// **********hi
// **********hi
// **********hi
// 3
// SAZIM IS GOOD BOY
// outer loop end
