public class arraysum3 {
    
        public static void main(String[] args) {
            int[] number = new int[5];//size is 5
            number[0]=10;
            number[1]=14;
            number[2]=14;
            number[3]=15;
            number[4]=14;
            int sum=number[0]+ number[1]+number[2]+number[3]+number[4];
            System.out.println("sum="+sum);
            int len = number.length;
            System.out.println("array size "+len);
        }
    }

