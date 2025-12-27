import java.util.Scanner;

public class BitManipulation {

    public static int clearIthBit(int num , int bitMask)
    {
        return num & ~(bitMask);
    }

    public static void main(String[] args) {
        
        // System.out.println(5 & 6);
        // System.out.println(5 | 6);
        // System.out.println(~0);
        // System.out.println("Left Shift -> " +(5<<2)); // 5 * 2^2 = 20 ;
        // System.out.println("Left Shift -> " +(5>>2)); // 5 / 2^2 = 1;

        //check even or odd
        // int bitMask = 1;
        // if((20 & n) == 0)
        // {
        //     System.out.println("Even");
        // }
        // else
        // {
        //     System.out.println("Odd");
        // }

        //Get ith Postition of the number

        //Scanner class
        Scanner sc = new Scanner(System.in);

        //Taking the input
        // int x  = sc.nextInt();

        //Taking the bitmask 
        // int bitMask = 1<<x;

        // if( (6 & bitMask) == 0)
        // {
        //     System.out.println("0");
        // }
        // else
        // {
        //     System.out.println("1");
        // }

        //clear the ith bit

        int bitmask = 1 << 2;

        //Clear the ith bit 
        // int result  = clearIthBit(10,bitmask);
        // System.out.println(result);

        //Clear the Last i bits
        // bitmask = ((-1)<<2);
        
        // System.out.println(15 & bitmask);


        //clear the range of the bits from i to j
        // int j = 4;
        // int i = 2;
        // int a = ((~0) << (j+1));
        // int b = (1<<i) - 1 ;
        // bitmask = a | b;
        // System.out.println( 10 & bitmask);


        //Find the number of set bits in a number
        int n = sc.nextInt();
        int count = 0;
        while(n > 0)
        {
            if((n & 1) != 0)
            {
                count++;
            }
            n = n>>1;
        }
        System.out.println("The number of set bits are : " +count);

    }
}
