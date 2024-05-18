public class array3 {
public static void main(String[] args) {
    //int x;
    int a[];
    a= new int[3];//   int a[]= new int[3]; //same
    a[0] = 10;
    a[1] = 20;
    a[2] = 30;
    int x = a[0]+a[2];
    System.out.println("value of x:" +x);
    a[2]=100;
    x = a[0]+a[2];     
    System.out.println("valu of x:" +x);
 } 
 } 